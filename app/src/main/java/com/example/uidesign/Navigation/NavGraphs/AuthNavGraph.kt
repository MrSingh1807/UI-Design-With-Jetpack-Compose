package com.example.uidesign.Navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.uidesign.AUTHENTICATION_ROUTE
import com.example.uidesign.Navigation.Screens.LoginScreen
import com.example.uidesign.Navigation.Screens.SignUpScreen
import com.example.uidesign.Screen


fun NavGraphBuilder.authNavGraph(
    navController: NavController
){
    // Nested Navigation
    navigation(
        startDestination = Screen.LogIn.route,
        route = AUTHENTICATION_ROUTE
    ){
        composable(
            route = Screen.LogIn.route
        ){
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ){
            SignUpScreen(navController)
        }
    }
}