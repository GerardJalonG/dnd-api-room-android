package com.example.consumoapidungeondragons.routes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.consumoapidungeondragons.Routes

sealed class BottomNavigationScreens(
    val route: String,
    val icon: ImageVector,
    val label: String
) {
    object Monsters : BottomNavigationScreens(Routes.ListView.route,
        Icons.AutoMirrored.Filled.List, "Monsters")
    object Hunted : BottomNavigationScreens(Routes.KilledMonstersView.route, Icons.Filled.Star, "Hunted")
}