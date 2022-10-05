package net.app.desktopApp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import net.app.compose.Theme
import net.app.compose.Main

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "AppTest") {
        Theme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
                Main()
            }
        }
    }
}

