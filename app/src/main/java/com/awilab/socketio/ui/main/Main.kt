package com.awilab.socketio.ui.main

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.awilab.socketio.ui.theme.SocketIOTheme
import com.awilab.socketio.ui.widget.BaseAppBar

@Composable
fun MainPage(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        BaseAppBar(title = "MainScreen")
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "主頁")
@Composable
fun MainPagePreview() {
    SocketIOTheme {
        Scaffold {
            Column(modifier = Modifier.fillMaxSize()) {
                BaseAppBar(title = "MainScreen")
            }
        }
    }
}