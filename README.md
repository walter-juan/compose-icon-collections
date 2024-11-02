# Compose icon collections

Compose Multiplatform open source icon collections

[![Platform](https://img.shields.io/badge/Platform-ComposeMultiplatform-brightgreen.svg)]()
[![MIT License](https://img.shields.io/github/license/walter-juan/compose-icon-collections)](LICENSE)

<a target="_blank" href="https://jetc.dev/issues/237.html"><img src="https://img.shields.io/badge/As_Seen_In-jetc.dev_Newsletter_Issue_%23237-blue?logo=Jetpack+Compose&amp;logoColor=white" alt="As Seen In - jetc.dev Newsletter Issue #237"></a>

## How to use it

Available in [Maven Central](https://central.sonatype.com/namespace/com.woowla.compose.icon.collections)

```kotlin
repositories {
    mavenCentral()
}
```

Add it to your project, see the table below for the corresponding version.

```kotlin
kotlin {
   sourceSets {
      commonMain {
         dependencies {
            implementation("com.woowla.compose.icon.collections:{artifact}:{version}")
         }
      }
   }
}
```

In your code, use the icons like this:

```kotlin
Icon(imageVector = Octicons.Home16, contentDescription = null)
Icon(imageVector = Tabler.Filled.HospitalCircle, contentDescription = null)
Icon(imageVector = Tabler.Outline.HospitalCircle, contentDescription = null)
```

## Icon packs

See all available icons on the [GitHub Pages](https://walter-juan.github.io/compose-icon-collections/), only the latest published version is available.


The same version numbers as the official icon packs have been followed

| Icon Pack                                               | Artifact | Version                                                                                                                                                                                                                  | License                                                                                                                                          |
|---------------------------------------------------------|----------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| [Tabler](https://github.com/tabler/tabler-icons)        | tabler   | [![Tabler - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/tabler)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=tabler)       | [![GitHub License](https://img.shields.io/github/license/tabler/tabler-icons)](https://github.com/tabler/tabler-icons/blob/main/LICENSE)         |
| [Octicons](https://github.com/primer/octicons)          | octicons | [![Octicons - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/octicons)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=octicons) | [![GitHub License](https://img.shields.io/github/license/primer/octicons)](https://github.com/primer/octicons/blob/main/LICENSE)                 |
| [Remix Icon](https://github.com/Remix-Design/RemixIcon) | remix    | [![Remix - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/remix)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=remix)          | [![GitHub License](https://img.shields.io/github/license/Remix-Design/RemixIcon)](https://github.com/Remix-Design/RemixIcon/blob/master/License) |
| [Boxicons](https://github.com/atisawd/boxicons)         | boxicons | [![Boxicons - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/boxicons)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=boxicons) | [![GitHub License](https://img.shields.io/github/license/atisawd/boxicons)](https://github.com/atisawd/boxicons/blob/master/LICENSE)             |
| [Feather](https://github.com/feathericons/feather)      | feather  | [![Feather - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/feather)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=feather)    | [![GitHub License](https://img.shields.io/github/license/feathericons/feather)](https://github.com/feathericons/feather/blob/main/LICENSE)       |
| [Ionicons](https://github.com/ionic-team/ionicons)      | ionicons | [![Ionicons - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/ionicons)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=ionicons) | [![GitHub License](https://img.shields.io/github/license/ionic-team/ionicons)](https://github.com/ionic-team/ionicons/blob/main/LICENSE)         |


## How it works

Download tasks are executed to update the icons, the process is as follows:
1. The icons are downloaded from the official repositories
2. The SVG files are converted to Compose using [SVG to compose](https://github.com/DevSrSouza/svg-to-compose) and saved in the corresponding module
3. Documentation is generated and saved in the [docs](/docs) folder
4. (Optional) The changes are committed to the repository

The [Update icons](.github/workflows/update-icons.yml) Workflow will update the icons automatically every 2 weeks. Right now, it only updates icons that have GitHub releases, so there are some icons that should be updated manually


## Development

### Requirements

- Android Studio
- [Kotlin Multiplatform Plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform)
- Java 17

### Update the icons

- Icon pack using GitHub releases: Run the icon download task, use the `-Pgitcommit` flag to commit the changes.
- Icon pack using the main branch: Run the icon download task, manually update the version in the `build.gradle` file, and commit the changes.

### Add new icons

1. Add new module
   - Create a new module by copying the `build.gradle` from an existing module. Copy `octicons` if the icon pack uses GitHub releases or `boxicons` if it uses the main branch.
   - Update everything needed like the version, `download-icons` task, and others from the `build.gradle`
2. Update workflows
   - Add new input option in [deploy.yml](.github/workflows/publish.yml) 
   - If the icon pack uses GitHub releases, add the new task in [update-icons.yml](.github/workflows/update-icons.yml)
3. Update readme
   - Add a new entry in the *Icon packs* section

### Test icons

Right now the only way to test is by running the sample app, follow these steps:

1. Replace the icons dependency you would like to test in [build.gradle.kts](sample/composeApp/build.gradle.kts) file
2. Add `AllIcons` to the `icons` list in the [App.kt](sample/composeApp/src/commonMain/kotlin/com/woowla/compose/icon/collections/sample/App.kt) file
3. Run the sample app and check the icons

### Gradle tasks

- The folder [.run](.run) contains all the necessary tasks to download the icons and run the sample apps (Android/iOS/Desktop/Web)
- Download icons tasks with update docs and version:
  - `./gradlew <module>:download-icons`
  - `./gradlew <module>:download-icons -Pgitcommit` use the `-Pgitcommit` flag to commit the changes
  - `./gradlew download-icons` to download all the icons, just in case **do not use with the `-Pgitcommit` flag**

### GitHub actions

- [Verification](.github/workflows/verification.yml): Verify the icons, it must be run manually before merge a pull request
- [Deploy](.github/workflows/publish.yml): Deploy the main branch to Maven Central
- [Update icons](.github/workflows/update-icons.yml): Update the icons automatically, not all icons can be updated automatically

## Useful links

- [How to run and create multiplatform project](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-create-first-app.html)
- Multiplatform library template, [from Kotlin](https://github.com/Kotlin/multiplatform-library-template)
- Multiplatform library template, [from github.com/Tweener/kmplate-lib](https://github.com/Tweener/kmplate-lib)
- [Multiplatform app template](https://kmp.jetbrains.com/)
- [Publish Kotlin/Wasm to GitHub Pages](https://kotlinlang.org/docs/wasm-get-started.html#publish-on-github-pages)
- [SVG to compose](https://github.com/DevSrSouza/svg-to-compose)
