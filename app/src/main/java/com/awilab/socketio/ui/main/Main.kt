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

@Composable
private fun CodeLab(
    modifier: Modifier = Modifier,
    names: List<String> = listOf("Android", "Compose", "iOS", "Flutter")
) {
    Surface(modifier = modifier, color = MaterialTheme.colorScheme.background) {
        Column(modifier = modifier.padding(vertical = 4.dp)) {
            for (name in names) {
                Greeting(name)
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Hello $name", modifier = Modifier.padding(24.dp))
            ElevatedButton(onClick = { /*TODO*/ }) {
                Text(text = "Show more")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainPagePreview() {
    SocketIOTheme {
        Scaffold {
            Column (modifier = Modifier.fillMaxSize()){
//                BaseAppBar(title = "MainScreen")
                CodeLab(Modifier)
            }
        }
    }
}