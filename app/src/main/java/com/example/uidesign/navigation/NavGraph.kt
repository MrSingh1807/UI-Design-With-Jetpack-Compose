package com.example.uidesign.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.uidesign.Screen.HomeScreen
import com.example.uidesign.Screen.SplashScreen

@Composable
fun SetUpNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    )
    {
        composable(route = Screen.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(route = Screen.HomeScreen.route) {
            HomeScreen()
        }
    }
}

