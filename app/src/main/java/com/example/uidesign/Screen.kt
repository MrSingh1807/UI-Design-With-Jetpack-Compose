package com.example.uidesign

sealed class Screen(val route: String){
    object Home: Screen("home_screen")
    object Details : Screen("details_screen")
}
