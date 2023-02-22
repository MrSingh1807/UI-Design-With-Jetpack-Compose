package com.example.uidesign.Navigation

import android.util.Log
import androidx.navigation.*
import androidx.navigation.compose.composable
import com.example.uidesign.DETAILS_ARGUMENT_KEY
import com.example.uidesign.DETAILS_ARGUMENT_KEY_NAME
import com.example.uidesign.HOME_ROUTE
import com.example.uidesign.Screen


fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
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
                },
                navArgument(DETAILS_ARGUMENT_KEY_NAME) {
                    type = NavType.StringType
                    defaultValue = "MR Singh"
                }),

            ) {
            Log.d("Args", it.arguments?.getInt(DETAILS_ARGUMENT_KEY).toString())
            Log.d("Args", it.arguments?.getString(DETAILS_ARGUMENT_KEY_NAME).toString())
            DetailScreen(navController)
        }
    }
}