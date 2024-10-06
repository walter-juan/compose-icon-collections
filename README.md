# Compose icon collections

![Platform](https://img.shields.io/badge/Platform-ComposeMultiplatform-brightgreen.svg)
[![MIT License](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)

Compose Multiplatform open source icon collections

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
            implementation("com.woowla.compose.icon.collections:tabler:{version}")
            implementation("com.woowla.compose.icon.collections:octicons:{version}")
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

- Tabler: https://github.com/tabler/tabler-icons
- Octicons: https://github.com/primer/octicons

The same version numbers as the official icon packs have been followed

| Name     | Version | License                                                                    |
|----------|---------|----------------------------------------------------------------------------|
| tabler   | 3.19.0  | [MIT license](https://github.com/tabler/tabler-icons/blob/v3.19.0/LICENSE) |
| octicons | 19.11.0 | [MIT license](https://github.com/primer/octicons/blob/v19.11.0/LICENSE)    |

## Development

### Requirements

- Android Studio
- [Kotlin Multiplatform Plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform)
- Java 17

### Update the icons

1. Run the icon download task
2. Change the version in `build.gradle` from the updated modules
3. Update [README.md](README.md) with the new version in *Icon packs* section

### Add new icons

1. Create a new module by copying the `build.gradle` from another module
2. Create a `download-icons` task
3. Add new input choice in [deploy.yml](.github/workflows/publish.yml)
4. Add a new entry in the *Icon packs* section
5. Update the sample

### Gradle tasks

- The folder [.run](.run) contains all the necessary tasks to download the icons and run the sample apps (Android/iOS/Desktop/Web)
- Download icon ones:
  - `./gradlew <module>:download-icons`
  - `./gradlew download-icons`

## Useful links

- [How to run and create multiplatform project](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-create-first-app.html)
- Multiplatform library template, [from Kotlin](https://github.com/Kotlin/multiplatform-library-template)
- Multiplatform library template, [from github.com/Tweener/kmplate-lib](https://github.com/Tweener/kmplate-lib)
- [Multiplatform app template](https://kmp.jetbrains.com/)
- [Publish Kotlin/Wasm to GitHub Pages](https://kotlinlang.org/docs/wasm-get-started.html#publish-on-github-pages)
- [SVG to compose](https://github.com/DevSrSouza/svg-to-compose)
