package net.app.desktopApp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import net.app.common.Greeting

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "AppTest") {
        MaterialTheme {
            Main()
        }
    }
}
@Composable
fun Main() {
    var count by remember { mutableStateOf(0) }
    Column(Modifier.fillMaxSize(), Arrangement.spacedBy(5.dp)) {
        Text(text = Greeting().greeting(), modifier = Modifier.align(Alignment.CenterHorizontally))
        Text(text = "Count $count", modifier = Modifier.align(Alignment.CenterHorizontally))
        Button(onClick = { count++ }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text(text = "Aumentar")
        }
        Button(onClick = { count = 0 }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text(text = "Reset")
        }
    }
}
