package net.app.common

class BrowserPlatform : Platform {
    override val name: String = "Browser"
}

actual fun getPlatform(): Platform = BrowserPlatform()