import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.utils.io.jvm.javaio.*
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
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
        val beforeRename = directory.walkTopDown().filterSvg().count()
        directory.walkTopDown().filterSvg().forEach { file ->
            val newFile = file.renameToSupportedFormat()
            if (file != newFile) {
                file.renameTo(newFile)
            }
        }
        val afterRename = directory.walkTopDown().filterSvg().count()

        val diff = beforeRename - afterRename
        require(diff == 0) {
            "There have been $diff icons lost from a total of $beforeRename. After renaming they have had the same name as others."
        }
    }

    /**
     * Rename to a supported format
     */
    fun File.renameToSupportedFormat(): File {
        val newFileNameWithoutExtension = this
            .nameWithoutExtension
            .replace(Regex("""[^a-zA-Z\d]"""), "_")
            .replace(Regex("""^\d"""), "_")
            .trim('_')
            .snakeToCamelCase()
            .capitalize()
        return File(this.parentFile, "$newFileNameWithoutExtension.$extension")
    }

    /**
     * Returns a copy of this string having its first letter titlecased
     */
    fun String.capitalize(): String {
        return replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }

    fun String.snakeToCamelCase(): String {
        val pattern = """_[a-z\d]""".toRegex()
        return replace(pattern) { it.value.last().uppercase() }
    }

    /**
     * Filter only the SVG files
     */
    fun Sequence<File>.filterSvg(): Sequence<File> {
        return filter { it.isFile && it.name.endsWith(".svg") }
    }
}