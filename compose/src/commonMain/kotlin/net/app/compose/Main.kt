package net.app.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.app.common.Greeting

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
