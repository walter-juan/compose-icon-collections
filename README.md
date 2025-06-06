# Compose icon collections

Open source icons sets for Compose Multiplatform — supporting Android, iOS, Desktop (JVM), and Web (Wasm).

[![Platform](https://img.shields.io/badge/Platform-ComposeMultiplatform-brightgreen.svg)]()
[![MIT License](https://img.shields.io/github/license/walter-juan/compose-icon-collections)](LICENSE)

<a target="_blank" href="https://jetc.dev/issues/237.html"><img src="https://img.shields.io/badge/As_Seen_In-jetc.dev_Newsletter_Issue_%23237-blue?logo=Jetpack+Compose&amp;logoColor=white" alt="As Seen In - jetc.dev Newsletter Issue #237"></a>

Android | iOS | Desktop | Web
:------:|:------:|:------:|:------:|
<img width="125" src="https://github.com/user-attachments/assets/0ab9703d-f9e9-45c7-8a63-36ec971fa4d1"/>|<img width="175" src="https://github.com/user-attachments/assets/2bcbcfd9-c640-4f83-911f-940a11a11851"/>|<img width="250" src="https://github.com/user-attachments/assets/68d3bd8b-cd0b-4869-97d1-536949421c4f"/>|<img width="250" src="https://github.com/user-attachments/assets/4716b9ac-352c-41bc-b674-7f2e7abf9547"/>

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

| Icon Pack                                                    | Artifact    | Version                                                                                                                                                                                                                            | License                                                                                                                                                    |
|--------------------------------------------------------------|-------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Tabler](https://github.com/tabler/tabler-icons)             | tabler      | [![Tabler - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/tabler)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=tabler)                 | [![GitHub License](https://img.shields.io/github/license/tabler/tabler-icons)](https://github.com/tabler/tabler-icons/blob/main/LICENSE)                   |
| [Octicons](https://github.com/primer/octicons)               | octicons    | [![Octicons - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/octicons)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=octicons)           | [![GitHub License](https://img.shields.io/github/license/primer/octicons)](https://github.com/primer/octicons/blob/main/LICENSE)                           |
| [Remix Icon](https://github.com/Remix-Design/RemixIcon)      | remix       | [![Remix - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/remix)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=remix)                    | [![GitHub License](https://img.shields.io/github/license/Remix-Design/RemixIcon)](https://github.com/Remix-Design/RemixIcon/blob/master/License)           |
| [Boxicons](https://github.com/atisawd/boxicons)              | boxicons    | [![Boxicons - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/boxicons)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=boxicons)           | [![GitHub License](https://img.shields.io/github/license/atisawd/boxicons)](https://github.com/atisawd/boxicons/blob/master/LICENSE)                       |
| [Feather](https://github.com/feathericons/feather)           | feather     | [![Feather - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/feather)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=feather)              | [![GitHub License](https://img.shields.io/github/license/feathericons/feather)](https://github.com/feathericons/feather/blob/main/LICENSE)                 |
| [Ionicons](https://github.com/ionic-team/ionicons)           | ionicons    | [![Ionicons - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/ionicons)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=ionicons)           | [![GitHub License](https://img.shields.io/github/license/ionic-team/ionicons)](https://github.com/ionic-team/ionicons/blob/main/LICENSE)                   |
| [Font Awesome](https://github.com/FortAwesome/Font-Awesome)  | fontawesome | [![Font Awesome - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/fontawesome)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=fontawesome) | [![Static Badge](https://img.shields.io/badge/license-CC_BY_4.0-green)](https://github.com/FortAwesome/Font-Awesome/blob/6.x/LICENSE.txt)                  |
| [Heroicons](https://github.com/tailwindlabs/heroicons)       | heroicons   | [![Heroicons - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/heroicons)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=heroicons)        | [![GitHub License](https://img.shields.io/github/license/tailwindlabs/heroicons)](https://github.com/tailwindlabs/heroicons/blob/master/LICENSE)           |                                                                                                                                        |
| [Simple icons](https://github.com/simple-icons/simple-icons) | simpleicons | [![Simple icons - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/simpleicons)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=simpleicons) | [![GitHub License](https://img.shields.io/github/license/simple-icons/simple-icons)](https://github.com/simple-icons/simple-icons/blob/develop/LICENSE.md) |                                                                                                                                        |
| [Bootstrap icons](https://github.com/twbs/icons)             | twbs        | [![Bootstrap icons - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/twbs)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=twbs)            | [![GitHub License](https://img.shields.io/github/license/twbs/icons)](https://github.com/twbs/icons/blob/main/LICENSE)                                     |                                                                                                                                        |

## How it works

**Download task**

Download tasks are executed to update the icons, the process is as follows:
1. The icons are downloaded from the official repositories
2. The SVG files are converted to Compose using [SVG to compose](https://github.com/DevSrSouza/svg-to-compose) and saved in the corresponding module
3. Documentation is generated and saved in the [docs](/docs) folder
4. The version is updated in the `build.gradle` file
5. (Optional) The changes are committed to the repository

**Auto update**

The [Update icons workflow](.github/workflows/update-icons.yml) will update the icons automatically every 2 weeks. Right now, it only updates icons that have GitHub releases, so there are some icons that should be updated manually

**Special cases**

Typically, all icon download tasks retrieve icons from GitHub releases. However, there are a few exceptions:

- **boxicons**: Downloads icons directly from the main branch for this reason this is not updated automatically, a manual update required.
- **ionicons**: Uses a custom `afterDownload` and `gitHubUrlProvider` function to categorize icons. Additionally, there is an issue with the `Square` value from `StrokeCap` in the generated image vectors. This must be manually replaced with `StrokeCap.Square` to avoid conflicts with an icon named `Square` (see [#35](https://github.com/walter-juan/compose-icon-collections/pull/35)).
- **fontawesome**: Implements a custom `iconNameTransformer` to handle conflicts between the `FontAwesome` icon and its accessor name.
- **simpleicons**: Uses a custom `afterDownload` function to remove the `lerna.svg` icon because it throws `MethodTooLargeException` when compiling the project.

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
   - If a special case has been added, add a note in the *Special cases* section

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
