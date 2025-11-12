# Template Java Gradle

A template project for using the [Gauge](https://docs.gauge.org/) test framework with Gradle and Java.

### Verified Environment

```bash
$ java --version
openjdk 25.0.1 2025-10-21 LTS
OpenJDK Runtime Environment Temurin-25.0.1+8 (build 25.0.1+8-LTS)
OpenJDK 64-Bit Server VM Temurin-25.0.1+8 (build 25.0.1+8-LTS, mixed mode, sharing)
```

```bash
$ ./gradlew --version

------------------------------------------------------------
Gradle 9.2.0
------------------------------------------------------------

Build time:    2025-10-29 13:53:23 UTC
Revision:      d9d6bbce03b3d88c67ef5a0ff31f7ae5e332d6bf

Kotlin:        2.2.20
Groovy:        4.0.28
Ant:           Apache Ant(TM) version 1.10.15 compiled on August 25 2024
Launcher JVM:  25.0.1 (Eclipse Adoptium 25.0.1+8-LTS)
Daemon JVM:    /Users/motohiro.takehara/.asdf/installs/java/temurin-25.0.1+8.0.LTS (no JDK specified, using current Java home)
OS:            Mac OS X 15.4.1 aarch64
```

```bash
$ gauge version
Gauge version: 1.6.21
Commit Hash: 7d3f2cf

Plugins
-------
java (1.0.1)
```

## Usage

### Initialize Project from Template (TBD)

```bash
gauge init <archive>.zip
```

### Run Tests

```bash
./gradlew gauge
```
