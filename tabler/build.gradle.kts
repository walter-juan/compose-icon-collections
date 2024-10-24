import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.jetbrains.compose.compiler)
    alias(libs.plugins.vanniktech.maven.publish)
}

version = "3.20.0"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

mavenPublishing {
    coordinates(project.group.toString(), project.name, project.version.toString())

    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL, automaticRelease = true)
    signAllPublications()

    pom {
        name = project.name
        description = "The ${project.name} icons for Jetpack Compose"
        inceptionYear = "2024"
        url = "https://github.com/walter-juan/compose-icon-collections"
        licenses {
            license {
                name = "The MIT License"
                url = "https://opensource.org/licenses/MIT"
                distribution = "repo"
            }
        }
        developers {
            developer {
                id = "walter-juan"
                name = "Walter Juan"
                url.set("https://github.com/walter-juan/")
            }
        }
        scm {
            url = "https://github.com/walter-juan/compose-icon-collections"
            connection = "scm:git:git://github.com/walter-juan/compose-icon-collections.git"
            developerConnection = "scm:git:ssh://git@github.com/walter-juan/compose-icon-collections.git"
        }
    }
}

tasks.register("download-icons") {
    val ghUser = "tabler"
    val ghRepo = "tabler-icons"
    val ghIconsDir = "icons"
    val accessorName = "Tabler"
    val applicationIconPackage = "com.woowla.compose.icon.collections.tabler"
    val licenseFile = "LICENSE"
    val iconsPackName = "Tabler"

    val projectName = project.name
    val srcDir = layout.projectDirectory.dir("src/commonMain/kotlin").asFile
    val projectRootDir = project.rootDir
    val downloadsDir = projectRootDir.resolve("downloads")
    val docsDir = projectRootDir.resolve("docs")

    outputs.cacheIf { false }
    outputs.dir(downloadsDir)

    doLast {
        // generate icons
        val generateIconsResult = IconsGenerator.generateIcons(
            downloadsDir = downloadsDir,
            ghUser = ghUser,
            ghRepo = ghRepo,
            ghIconsDir = ghIconsDir,
            applicationIconPackage = applicationIconPackage,
            accessorName = accessorName,
            outputDir = srcDir,
        )

        // generate documentation
        val licenseContent = generateIconsResult.repoDir.resolve(licenseFile).readText(Charsets.UTF_8)
        val rawGithubRepository = "https://raw.githubusercontent.com/$ghUser/$ghRepo/${generateIconsResult.tag}"
        IconsGenerator.generateDocs(
            parsingResult = generateIconsResult.parsingResult,
            rawGithubRepository = rawGithubRepository,
            repoDir = generateIconsResult.repoDir,
            docsDir = docsDir,
            iconsPackName = iconsPackName,
            projectName = projectName,
            license = licenseContent,
        )

        println("Removing...")
        generateIconsResult.projectDownloadsDir.deleteRecursively()

        println("==== RESULTS ====")
        println("Tag [${generateIconsResult.tag}]")
        println("=================")
    }
}
