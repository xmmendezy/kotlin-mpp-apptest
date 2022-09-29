package net.app.desktopApp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import net.app.common.Greeting

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "AppTest") {
        MaterialTheme {
            Column(Modifier.fillMaxSize(), Arrangement.spacedBy(5.dp)) {
                Text(text = Greeting().greeting(), modifier = Modifier.align(Alignment.CenterHorizontally))
            }
        }
    }
}