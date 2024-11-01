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

| Icon Pack                                               | Artifact | Version                                                                                                                                                                                                                  | License                                                                              |
|---------------------------------------------------------|----------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------|
| [Tabler](https://github.com/tabler/tabler-icons)        | tabler   | [![Tabler - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/tabler)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=tabler)       | [![GitHub License](https://img.shields.io/github/license/tabler/tabler-icons)]()     |
| [Octicons](https://github.com/primer/octicons)          | octicons | [![Octicons - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/octicons)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=octicons) | [![GitHub License](https://img.shields.io/github/license/primer/octicons)]()         |
| [Remix Icon](https://github.com/Remix-Design/RemixIcon) | remix    | [![Remix - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/remix)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=remix)          | [![GitHub License](https://img.shields.io/github/license/Remix-Design/RemixIcon)]()  |
| [Boxicons](https://github.com/atisawd/boxicons)         | boxicons | [![Boxicons - Maven Central Version](https://img.shields.io/maven-central/v/com.woowla.compose.icon.collections/boxicons)](https://central.sonatype.com/search?namespace=com.woowla.compose.icon.collections&q=boxicons) | [![GitHub License](https://img.shields.io/github/license/atisawd/boxicons)]()        |

## Development

### Requirements

- Android Studio
- [Kotlin Multiplatform Plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform)
- Java 17

### Update the icons

Run the icon download task, use the `-Pgitcommit` flag to commit the changes.

### Add new icons

1. Create a new module by copying the `build.gradle` from another module
2. Update everything needed like the version, `download-icons` task, and others from the `build.gradle`
3. Add new input choice in [deploy.yml](.github/workflows/publish.yml)
4. If it's possible, add the new task in [update-icons.yml](.github/workflows/update-icons.yml)
5. Add a new entry in the *Icon packs* section

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
