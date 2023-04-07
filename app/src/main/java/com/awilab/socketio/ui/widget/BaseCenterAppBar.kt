@file:OptIn(ExperimentalMaterial3Api::class)

package com.awilab.socketio.ui.widget

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun BaseCenterAppBar(title: String) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = title)
                },
                navigationIcon = {
                    IconButton(onClick = { println("Menu ClickKKKKK") }) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                    }
                }
            )
        },
        content = {}
    )
}