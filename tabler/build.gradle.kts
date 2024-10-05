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

version = "3.19.0"
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
    val downloadsDir = project.rootDir.resolve("downloads").resolve("tabler")
    val downloadedFile = downloadsDir.resolve("icons.zip")
    val unzippedFile = downloadsDir.resolve("unzipped")
    val vectorsDir = unzippedFile.resolve("svg")

    outputs.dir(downloadsDir)
    outputs.dir(unzippedFile)

    doLast {
        downloadsDir.mkdirs()
        unzippedFile.mkdirs()

        println("Downloading...")
        val tag = Utils.githubAssetsDownload(
            repo = "tabler",
            project = "tabler-icons",
            downloadedFile = downloadedFile,
            asset = { it.contains(".zip") }
        )
        println("Downloaded version $tag")

        println("Unzipping...")
        Utils.unzip(zipFile = downloadedFile.absolutePath, destinationDir = unzippedFile.absolutePath)

        println("Renaming...")
        Utils.rename(vectorsDir)

        println("Converting...")
        Svg2Compose.parse(
            applicationIconPackage = "com.woowla.compose.icon.collections.tabler",
            accessorName = "Tabler",
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
