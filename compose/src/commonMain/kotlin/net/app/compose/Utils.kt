package net.app.compose

import androidx.compose.ui.graphics.Color

fun ColorFromHex(color: String) = Color(("ff" + color.removePrefix("#").lowercase()).toLong(16))
