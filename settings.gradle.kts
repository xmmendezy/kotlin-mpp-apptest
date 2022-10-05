pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
    }
    
}

rootProject.name = "AppTest"

include(":androidApp")
include(":desktopApp")
include(":webApp")
include(":compose")
include(":common")