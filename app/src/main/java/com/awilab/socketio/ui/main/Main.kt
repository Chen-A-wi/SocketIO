package com.awilab.socketio.ui.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.awilab.socketio.ui.theme.SocketIOTheme
import com.awilab.socketio.ui.widget.BaseAppBar

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        BaseAppBar(title = "MainScreen")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    SocketIOTheme {
        BaseAppBar(title = "MainScreen")
    }
}