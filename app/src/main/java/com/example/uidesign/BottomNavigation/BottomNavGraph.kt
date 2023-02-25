package com.example.uidesign.BottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.uidesign.BottomNavigation.Screens.SettingScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route){

        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottomBarScreen.Details.route){
            DetailScreen()
        }
        composable(route = BottomBarScreen.Setting.route){
            SettingScreen()
        }
    }
}