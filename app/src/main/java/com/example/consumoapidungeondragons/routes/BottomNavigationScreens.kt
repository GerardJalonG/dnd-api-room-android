package com.example.consumoapidungeondragons.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationScreens(
    val route: String,
    val icon: ImageVector,
    val label: String
) {
    object Monsters : BottomNavigationScreens(Routes.ListView.route, Icons.Filled.List, "Monsters")
    object Hunted : BottomNavigationScreens(Routes.KilledView.route, Icons.Filled.Star, "Hunted")
}