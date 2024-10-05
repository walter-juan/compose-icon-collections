import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.jetbrains.compose.compiler)
}

version = "1.0.0"
group = "com.woowla.compose.icon.collections"

kotlin {
    jvm()
    androidTarget {
        publishLibraryVariants("release")
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.ui)
            }
        }
        val commonTest by getting {
            dependencies { }
        }
    }
}

android {
    namespace = "com.woowla.compose.icon.collections.${project.name}"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}


tasks.register("download-icons") {
    val srcDir = layout.projectDirectory.dir("src/commonMain/kotlin").asFile
    val downloadsDir = project.rootDir.resolve("downloads").resolve("octicons")
    val downloadedFile = downloadsDir.resolve("icons.zip")
    val unzippedFile = downloadsDir.resolve("unzipped")

    outputs.dir(downloadsDir)
    outputs.dir(unzippedFile)

    doLast {
        downloadsDir.mkdirs()
        unzippedFile.mkdirs()

        println("Downloading...")
        val tag = Utils.githubZipballDownload(
            repo = "primer",
            project = "octicons",
            downloadedFile = downloadedFile,
        )
        println("Downloaded version $tag")

        println("Unzipping...")

        Utils.unzip(zipFile = downloadedFile.absolutePath, destinationDir = unzippedFile.absolutePath)

        require(unzippedFile.listFiles()?.count { it.isDirectory } == 1) { "Multiple directories found" }
        val vectorsDir = unzippedFile.listFiles()?.first { it.isDirectory }?.resolve("icons")
        requireNotNull(vectorsDir) { "icons dir not found" }

        println("Renaming...")
        Utils.rename(vectorsDir)

        println("Converting...")
        Svg2Compose.parse(
            applicationIconPackage = "com.woowla.compose.icon.collections.octicons",
            accessorName = "Octicons",
            outputSourceDirectory = srcDir,
            vectorsDirectory = vectorsDir,
            type = VectorType.SVG,
            iconNameTransformer = { name, group -> name.removePrefix(group) },
            allAssetsPropertyName = "AllIcons",
            generatePreview = false,
        )

        println("Removing...")
        downloadsDir.deleteRecursively()
    }
}
