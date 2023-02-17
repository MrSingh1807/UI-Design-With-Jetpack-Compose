package com.example.uidesign

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object Details :
        Screen("details_screen?id={id}") {
            // Optional Arguments => you pass a default value
            fun passID(id: Int = 0): String {
                return "details_screen?id=$id"
            }
    }
}
