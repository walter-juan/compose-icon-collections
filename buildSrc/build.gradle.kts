plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    maven("https://maven.google.com")
    maven("https://jetbrains.bintray.com/trove4j")
    maven("https://jitpack.io")
}

dependencies {
    val ktor_version = "2.3.12"
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
    implementation("io.ktor:ktor-client-core:$ktor_version")
    implementation("io.ktor:ktor-client-cio:$ktor_version")
    implementation("com.github.walter-juan:svg-to-compose:0.9.1")
}
