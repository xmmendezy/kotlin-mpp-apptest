package net.app.common

interface Platform {
    val name: String
}
expect fun getPlatform(): Platform