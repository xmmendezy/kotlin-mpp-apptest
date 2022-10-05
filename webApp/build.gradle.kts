import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

var kobweb = "0.9.14"

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version "1.1.0"
    id("com.varabyte.kobweb.application") version "0.9.14"
    id("com.varabyte.kobwebx.markdown") version "0.9.14"
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
    maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
}

group = "net.app.webApp"
version = "1.0-SNAPSHOT"

kobweb {
    index {
        description.set("AppTest")
    }
}

kotlin {
    jvm {
        tasks.withType<KotlinCompile> {
            kotlinOptions.jvmTarget = "11"
        }

        tasks.named("jvmJar", Jar::class.java).configure {
            archiveFileName.set("webapp.jar")
        }
    }
    js(IR) {
        moduleName = "webapp"
        browser {
            commonWebpackConfig {
                outputFileName = "webapp.js"
            }
        }
        binaries.executable()
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(project(":common"))
                implementation(compose.web.core)
                implementation("com.varabyte.kobweb:kobweb-core:$kobweb")
                implementation("com.varabyte.kobweb:kobweb-silk:$kobweb")
                implementation("com.varabyte.kobweb:kobweb-silk-icons-fa:$kobweb")
                implementation("com.varabyte.kobwebx:kobwebx-markdown:$kobweb")
             }
        }

        val jvmMain by getting {
            dependencies {
                implementation("com.varabyte.kobweb:kobweb-api:$kobweb")
            }
        }
    }
}