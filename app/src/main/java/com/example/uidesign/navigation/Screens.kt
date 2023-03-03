package com.example.uidesign.navigation


sealed class Screen(val  route: String) {
    object HomeScreen : Screen(route = "Home")
    object SplashScreen : Screen( route = "Splash")
}