plugins {
    id("org.jetbrains.kotlin.jvm") version "2.2.21"
    id("org.gauge") version "3.0.0"
}

group = "Gradle_example"
version = "1.0-SNAPSHOT"

kotlin {
    jvmToolchain(24)
}

repositories {
    mavenCentral()
}

sourceSets {
    main {
        kotlin.setSrcDirs(emptyList<String>())
        resources.setSrcDirs(emptyList<String>())
    }
    test {
        kotlin.setSrcDirs(listOf("src/test/kotlin"))
        resources.setSrcDirs(listOf("src/test/resources"))
    }
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-stdlib:2.2.21")
    testImplementation("com.thoughtworks.gauge:gauge-java:1.0.1")
    testImplementation("org.assertj:assertj-core:3.27.3")
    testImplementation("org.slf4j:slf4j-simple:2.0.17")
}

tasks.test {
    failOnNoDiscoveredTests = false
}
