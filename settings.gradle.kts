pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    
}

rootProject.name = "AppTest"

include(":androidApp")
include(":desktopApp")
include(":common")

