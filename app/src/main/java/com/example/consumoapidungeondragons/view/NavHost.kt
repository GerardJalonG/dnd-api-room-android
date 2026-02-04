package com.example.consumoapidungeondragons.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.consumoapidungeondragons.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.ListView.route,
        modifier = modifier
    ) {
        composable(Routes.ListView.route) {
            ListView(navController = navController)
        }
        composable(Routes.DetailsView.route) { backStackEntry ->
            val monsterIndex = backStackEntry.arguments?.getString("monsterId")

            if (monsterIndex != null) {
                DetailsView(monsterIndex = monsterIndex, navController = navController)
            } else {
                navController.navigateUp()
            }
        }
        composable(Routes.KilledMonstersView.route) {
            KilledMonstersView(navController = navController)
        }
    }
}