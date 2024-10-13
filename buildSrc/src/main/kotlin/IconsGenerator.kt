import Utils.renameToSupportedFormat
import br.com.devsrsouza.svg2compose.ParsingResult
import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

public typealias IconName = String
public typealias GitHubUrl = String

@Serializable
data class JsonConfig(val defaultPack: String, val iconPacks: List<JsonIconPack>)
@Serializable
data class JsonIconPack(val name: String, val value: String, val categories: List<String>)
@Serializable
data class JsonIcon(val name: String, val svg: String)

data class GenerateIconsResult(
    val tag: String,
    val parsingResult: ParsingResult,
    val projectDownloadsDir: File,
    val repoDir: File,
)

object IconsGenerator {
    /**
     * @param ghIconsDir relative icons path from the code
     */
    fun generateIcons(
        ghUser: String,
        ghRepo: String,
        ghIconsDir: String,
        downloadsDir: File,
        applicationIconPackage: String,
        accessorName: String,
        outputDir: File,
    ): GenerateIconsResult {
        val projectDownloadsDir = downloadsDir.resolve("${ghUser}-${ghRepo}")
        val zipFile = projectDownloadsDir.resolve("code.zip")
        val unzippedDir = projectDownloadsDir.resolve("code")

        projectDownloadsDir.mkdirs()
        unzippedDir.mkdirs()

        println("Downloading...")
        val tag = Utils.githubZipballDownload(
            repo = ghUser,
            project = ghRepo,
            downloadedFile = zipFile,
        )
        println("Downloaded version $tag")

        println("Unzipping...")
        Utils.unzip(zipFile = zipFile.absolutePath, destinationDir = unzippedDir.absolutePath)

        val repoDir = unzippedDir.listFiles().first()
        val iconsDir = repoDir.resolve(ghIconsDir)

        println("Creating the image vectors...")
        val parsingResult = Svg2Compose.parse(
            applicationIconPackage = applicationIconPackage,
            accessorName = accessorName,
            outputSourceDirectory = outputDir,
            vectorsDirectory = iconsDir,
            type = VectorType.SVG,
            groupNameTransformer = { group ->
                group
                    .renameToSupportedFormat(camelCase = true)
            },
            iconNameTransformer = { name, group ->
                name
                    .removePrefix(group.lowercase())
                    .renameToSupportedFormat(camelCase = true)
            },
            allAssetsPropertyName = "AllIcons",
            generatePreview = false,
            generateStringAccessor = false,
        )

        return GenerateIconsResult(
            parsingResult = parsingResult,
            tag = tag,
            projectDownloadsDir = projectDownloadsDir,
            repoDir = repoDir,
        )
    }

    fun generateDocs(
        parsingResult: ParsingResult,
        rawGithubRepository: String,
        repoDir: File,
        docsDir: File,
        iconsPackName: String,
        projectName: String,
        license: String,
    ) {
        val jsonSerializer = Json {
            prettyPrint = true
        }

        // icon json
        val jsonDir = docsDir.resolve(projectName)
        val icons = mapGeneratedIcons(parsingResult, rawGithubRepository, repoDir)
        val iconsPerJsonFile = icons.groupBy {
            // group by the JSON file
            it.first
                .split(".")
                .toMutableList()
                .apply { removeFirst() } // first group
                .apply { removeLast() } // icon name
                .apply { add(0, projectName) }
                .joinToString(separator = "-", postfix = ".json")
                .lowercase()
        }
        jsonDir.deleteRecursively()
        jsonDir.mkdirs()
        iconsPerJsonFile.forEach { (fileName, icons) ->
            val allIcons = icons.map { (iconName, githubUrl) ->
                JsonIcon(name = iconName, svg = githubUrl)
            }
            val jsonContent = jsonSerializer.encodeToString(allIcons)
            val jsonFile = jsonDir.resolve(fileName)
            jsonFile.delete()
            jsonFile.createNewFile()
            jsonFile.writeText(jsonContent)
        }

        // config.json
        val configFile = docsDir.resolve("config.json")
        val obj = Json.decodeFromString<JsonConfig>(configFile.readText(Charsets.UTF_8))
        val categories = iconsPerJsonFile.keys.map {
            it.removeSuffix(".json").split("-").toMutableList().apply { removeFirst() }.joinToString(separator = "-")
        }
        val iconPack = JsonIconPack(
            name = iconsPackName,
            value = projectName,
            categories = categories
        )
        val iconPacks = obj.iconPacks.toMutableList()
            .apply { removeIf { it.value == projectName } }
            .apply { add(iconPack) }
        val config = obj.copy(iconPacks = iconPacks)
        val configJsonContent = jsonSerializer.encodeToString(config)
        configFile.delete()
        configFile.createNewFile()
        configFile.writeText(configJsonContent)

        // license
        val licenseFile = jsonDir.resolve("${projectName}-license.txt")
        licenseFile.delete()
        licenseFile.createNewFile()
        licenseFile.writeText(license)
    }

    private fun mapGeneratedIcons(
        parsingResult: ParsingResult,
        rawGithubRepository: String,
        repoDir: File,
        prefix: String = "",
    ): List<Pair<IconName, GitHubUrl>> {
        val prefixWithGroup =  if (prefix.isEmpty()) parsingResult.groupName.second else prefix + "." + parsingResult.groupName.second

        return if (parsingResult.generatedGroups.isEmpty()) {
            parsingResult.generatedIconsMemberNames.map { (vectorFile, memberName) ->
                val iconName = prefixWithGroup + "." + memberName.simpleName
                val url = "${rawGithubRepository}${vectorFile.toString().removePrefix(repoDir.toString())}"
                iconName to url
            }
        } else {
            parsingResult.generatedGroups.map {
                mapGeneratedIcons(
                    parsingResult = it,
                    rawGithubRepository = rawGithubRepository,
                    repoDir = repoDir,
                    prefix = prefixWithGroup
                )
            }.flatten()
        }
    }
}