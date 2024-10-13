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

object Utils {
    /**
     * @param downloadedFile File where the asset will be downloaded
     * @return Release tag
     */
    fun githubZipballDownload(
        repo: String,
        project: String,
        downloadedFile: File,
    ): String {
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

            println("Download URL: $zipballUrl")

            // download the asset
            runBlocking {
                client.get(zipballUrl).bodyAsChannel().toInputStream().use { input ->
                    downloadedFile.outputStream().use { output ->
                        input.copyTo(output)
                    }
                }
            }
            tagName
        }
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