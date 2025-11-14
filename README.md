# Template Kotlin Gradle

A template project for using the [Gauge](https://docs.gauge.org/) test framework with Gradle and Kotlin.

## Usage

```bash
gauge init <archive>.zip
./gradlew gauge
```

### Important: Update Package Configuration

If you change the package name from the default `com.example`, update `package_to_scan` in `env/default/kotlin.properties`.

## Verified Environment

```bash
$ java --version
openjdk 25.0.1 2025-10-21 LTS
OpenJDK Runtime Environment Temurin-25.0.1+8 (build 25.0.1+8-LTS)
OpenJDK 64-Bit Server VM Temurin-25.0.1+8 (build 25.0.1+8-LTS, mixed mode, sharing)
```

```bash
$ gauge version
Gauge version: 1.6.21
Commit Hash: 7d3f2cf

Plugins
-------
java (1.0.1)
html-report (4.3.6)
```
