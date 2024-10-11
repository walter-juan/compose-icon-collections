import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.utils.io.jvm.javaio.*
import kotlinx.coroutines.processNextEventInCurrentThread
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.io.File
import java.util.*
import java.util.zip.ZipFile
import kotlin.io.path.listDirectoryEntries
import kotlin.io.path.moveTo

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
     * @param downloadedFile File where the asset will be downloaded
     * @param asset Return true for the asset to download
     * @return Release tag
     */
    fun githubAssetsDownload(
        repo: String,
        project: String,
        downloadedFile: File,
        asset: (name: String) -> Boolean,
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
            val assetsUrl = jsonElement.jsonObject["assets"]?.jsonArray?.firstOrNull {
                val name = it.jsonObject["name"]?.jsonPrimitive?.content
                name?.let(asset) ?: false
            }?.jsonObject?.get("browser_download_url")?.jsonPrimitive?.content

            requireNotNull(tagName) { "Tag name not found" }
            requireNotNull(assetsUrl) { "URL not found" }

            println("Download URL: $assetsUrl")

            // download the asset
            runBlocking {
                client.get(assetsUrl).bodyAsChannel().toInputStream().use { input ->
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

    /**
     * Rename all SVG files from [directory] and all content.
     * Files will be renamed with only letter, numbers and everything else replaced by _
     */
    fun rename(directory: File) {
        // rename files
        val files = directory.walkTopDown().toList().filterSvg()
        val beforeRenameFiles = files.count()
        files.forEach { file ->
            val newFile = file.renameToSupportedFormat(camelCase = true)
            if (file != newFile) {
                file.renameTo(newFile)
            }
        }
        val afterRenameFiles = directory.walkTopDown().toList().filterSvg().count()

        val filesDiff = beforeRenameFiles - afterRenameFiles
        require(filesDiff == 0) {
            "There have been $filesDiff icons lost from a total of $beforeRenameFiles. After renaming they have had the same name as others."
        }

        // rename directories
        val dirs = directory.listFiles()?.toList()?.filterDirectories() ?: listOf()
        val beforeRenameDirs = dirs.count()
        dirs.forEach { dir ->
            val newDir = dir.renameToSupportedFormat(camelCase = false)
            if (dir != newDir) {
                dir.renameTo(newDir)
            }
        }
        val afterRenameDirs = directory.listFiles()?.toList()?.filterDirectories()?.count() ?: 0
        val dirsDiff = beforeRenameDirs - afterRenameDirs
        require(dirsDiff == 0) {
            "There have been $dirsDiff folders lost from a total of $beforeRenameDirs. After renaming they have had the same name as others."
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
     * Rename to a supported format
     */
    fun File.renameToSupportedFormat(camelCase: Boolean): File {
        var newFileNameWithoutExtension = this
            .nameWithoutExtension
            .replace("&", "_and_")
            .replace(Regex("""[^a-zA-Z\d]"""), "_")
            .replace(Regex("""^\d"""), "_")
            .replace(Regex("""_+"""), "_")
            .trim('_')
            .lowercase()

        if (camelCase) {
            newFileNameWithoutExtension = newFileNameWithoutExtension
                .snakeToCamelCase()
                .capitalize()
        }

        return if (this.extension.isNotBlank()){
            File(this.parentFile, "$newFileNameWithoutExtension.$extension")
        } else {
            File(this.parentFile, newFileNameWithoutExtension)
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

    /**
     * Filter only the SVG files
     */
    fun Iterable<File>.filterSvg(): Iterable<File> {
        return filter { it.isFile && it.name.endsWith(".svg") }
    }

    /**
     * Filter only the directories
     */
    fun Iterable<File>.filterDirectories(): Iterable<File> {
        return filter { it.isDirectory }
    }


}