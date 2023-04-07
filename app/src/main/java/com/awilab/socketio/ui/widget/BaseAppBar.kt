@file:OptIn(ExperimentalMaterial3Api::class)

package com.awilab.socketio.ui.widget

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun BaseAppBar(title: String) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = title)
                }
            )
        },
        content = {}
    )
}