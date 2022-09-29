package net.app.common

class DesktopPlatform : Platform {
    override val name: String = "Desktop - ${System.getProperty("os.name")}"
}

actual fun getPlatform(): Platform = DesktopPlatform()