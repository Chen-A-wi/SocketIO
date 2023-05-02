package com.awilab.socketio.ui.widget

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector

data class IncludeNavItem(
    val name: String,
    val route: String,
    val icon: ImageVector,
)

val navItems = listOf(
    IncludeNavItem(name = "Home", route = "home", icon = Icons.Default.Home),
    IncludeNavItem(name = "Create", route = "add", icon = Icons.Default.AddCircle),
    IncludeNavItem(name = "Settings", route = "settings", icon = Icons.Default.Settings),
)

@Composable
fun IncludeNavBar() {
    var selectedItem by remember { mutableStateOf(0) }


    val items = listOf("Songs", "Artists", "Playlists")
    NavigationBar {
        items.forEachIndexed { index, item -> NavigationDrawerItem(
            label = { Text(text = item) },
            selected = selectedItem == index,
            onClick = { /*TODO*/ }) }
    }
}
