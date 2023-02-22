package com.example.uidesign.Navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.uidesign.*
import com.example.uidesign.Navigation.Screens.LoginScreen
import com.example.uidesign.Navigation.Screens.SignUpScreen

@Composable
fun SetUpNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {

        homeNavGraph(navController)

        // Nested Graph
        authNavGraph(navController = navController)

    }
}