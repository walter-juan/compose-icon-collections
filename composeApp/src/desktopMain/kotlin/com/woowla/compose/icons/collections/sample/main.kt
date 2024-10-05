package com.woowla.compose.icons.collections.sample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Compose icon collections",
    ) {
        App()
    }
}