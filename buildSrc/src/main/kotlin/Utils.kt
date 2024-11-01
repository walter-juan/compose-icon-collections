import io.github.z4kn4fein.semver.Version
import io.github.z4kn4fein.semver.toVersion
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.utils.io.jvm.javaio.*
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.io.File
import java.util.*
import java.util.zip.ZipFile

data class GitHubRelease(val tagName: String, val zipballUrl: String, val version: Version)

object Utils {
    /**
     * Commit the project changes to the git repository
     */
    fun commitChanges(project: String, version: Version) {
        // git add all from project and docs
        val process = ProcessBuilder("git", "add", "$project/*", "docs/*").start()
        val exitCode = process.waitFor()
        if (exitCode != 0) {
            throw RuntimeException("Failed to execute git add command")
        }
        // git commit
        val commitMessage = "Update $project to $version"
        val process2 = ProcessBuilder("git", "commit", "-m", commitMessage).start()
        val exitCode2 = process2.waitFor()
        if (exitCode2 != 0) {
            throw RuntimeException("Failed to execute git commit command")
        }
    }

    /**
     * Replace the version in the file
     */
    fun updateVersion(file: File, version: Version) {
        val process = ProcessBuilder("sed", "-i", "s/version = \".*\"/version = \"${version}\"/", file.absolutePath).start()
        val exitCode = process.waitFor()
        if (exitCode != 0) {
            throw RuntimeException("Failed to execute sed -i command to update the version")
        }
    }
    /**
     * Return true if a new release has been found
     */
    fun checkGithubNewRelease(currentVersion: Version, repo: String, project: String): Pair<Boolean, GitHubRelease> {
        val gitHubRelease = githubLastRelease(repo = repo, project = project)
        return if (currentVersion >= gitHubRelease.version) {
            println("NO new icons version found $currentVersion >= ${gitHubRelease.version}")
            false to gitHubRelease
        } else {
            println("New icons version found $currentVersion < ${gitHubRelease.version}")
            true to gitHubRelease
        }
    }

    fun githubLastRelease(repo: String, project: String): GitHubRelease {
        val url = "https://api.github.com/repos/$repo/$project/releases/latest"
        val client = HttpClient(CIO)
        return client.use {
            println("Get latest release: $url")

            // download the JSON data
            val jsonData = runBlocking {
                client.get(url).body<String>()
            }
            val jsonElement = Json.parseToJsonElement(jsonData)

            // extract the asset URL
            val tagName	= jsonElement.jsonObject["tag_name"]?.jsonPrimitive?.content
            val zipballUrl	= jsonElement.jsonObject["zipball_url"]?.jsonPrimitive?.content

            requireNotNull(tagName) { "Tag name not found" }
            requireNotNull(zipballUrl) { "URL not found" }

            val version = tagName.toVersion(strict = false)
            println("Latest release tag: $tagName")
            println("Latest version: $version")
            println("Latest release download URL: $zipballUrl")

            GitHubRelease(tagName = tagName, zipballUrl = zipballUrl, version = version)
        }
    }

    /**
     * @param downloadedFile File where the asset will be downloaded
     * @return Release tag
     */
    fun githubZipballDownload(
        repo: String,
        project: String,
        downloadedFile: File,
    ): String {
        val gitHubRelease = githubLastRelease(repo = repo, project = project)
        val client = HttpClient(CIO)
        return client.use {
            runBlocking {
                client.get(gitHubRelease.zipballUrl).bodyAsChannel().toInputStream().use { input ->
                    downloadedFile.outputStream().use { output ->
                        input.copyTo(output)
                    }
                }
            }
            gitHubRelease.tagName
        }
    }


    /**
     * Download the code from the main branch
     * @param downloadedFile File where the asset will be downloaded
     */
    fun githubDownloadFromBranch(
        branch: String,
        repo: String,
        project: String,
        downloadedFile: File,
    ): String {
        val url = "https://github.com/$repo/$project/archive/refs/heads/$branch.zip"
        val client = HttpClient(CIO)
        client.use {
            println("Download URL: $url")

            // download the asset
            runBlocking {
                client.get(url).bodyAsChannel().toInputStream().use { input ->
                    downloadedFile.outputStream().use { output ->
                        input.copyTo(output)
                    }
                }
            }
        }
        return branch
    }

    /**
     * @param zipFile ZIP file path
     * @param destinationDir Directory where the ZIP file contents will be extracted
     */
    fun unzip(zipFile: String, destinationDir: String) {
        val zipFile = ZipFile(zipFile)
        val destDir = File(destinationDir)

        // create destination directory if it doesn't exist
        if (!destDir.exists()) {
            destDir.mkdirs()
        }

        // iterate over each entry in the ZIP file
        zipFile.use { zip ->
            zip.entries().asSequence().forEach { entry ->
                val entryDestination = File(destDir, entry.name)

                if (entry.isDirectory) {
                    // if the entry is a directory, create it
                    entryDestination.mkdirs()
                } else {
                    // ensure the parent directory exists
                    entryDestination.parentFile.mkdirs()

                    // if the entry is a file, extract it
                    zip.getInputStream(entry).use { input ->
                        entryDestination.outputStream().use { output ->
                            input.copyTo(output)
                        }
                    }
                }
            }
        }
    }

    fun String.renameToSupportedFormat(camelCase: Boolean): String {
        val newFileNameWithoutExtension = this
            .replace("&", "_and_")
            .replace(Regex("""[^a-zA-Z\d]"""), "_")
            .replace(Regex("""^\d"""), "_")
            .replace(Regex("""_+"""), "_")
            .trim('_')
            .lowercase()

        return if (camelCase) {
            newFileNameWithoutExtension
                .snakeToCamelCase()
                .capitalize()
        } else {
            newFileNameWithoutExtension
        }
    }

    /**
     * Returns a copy of this string having its first letter titlecased
     */
    fun String.capitalize(): String {
        return replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }

    fun String.snakeToCamelCase(): String {
        val pattern = """_[a-zA-Z\d]""".toRegex()
        return replace(pattern) { it.value.last().uppercase() }
    }
}