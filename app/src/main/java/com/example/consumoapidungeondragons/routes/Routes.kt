package com.example.consumoapidungeondragons.nav

sealed class Routes(val route: String) {
    object ListView : Routes("list")
    object KilledView : Routes("killed")
    object Details : Routes("details/{monsterId}") {
        fun createRoute(monsterId: String) = "details/$monsterId"
    }
}