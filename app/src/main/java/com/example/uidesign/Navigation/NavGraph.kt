package com.example.uidesign.Navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.uidesign.DETAILS_ARGUMENT_KEY
import com.example.uidesign.DETAILS_ARGUMENT_KEY_NAME
import com.example.uidesign.Screen

@Composable
fun SetUpNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument(DETAILS_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 0
                }),

            ) {
            Log.d("Args", it.arguments?.getInt(DETAILS_ARGUMENT_KEY).toString())
//            Log.d("Args", it.arguments?.getString(DETAILS_ARGUMENT_KEY_NAME).toString())
            DetailScreen(navController)
        }
    }
}