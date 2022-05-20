package com.example.toomatch.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.toomatch.screens.CreditsScreen
import com.example.toomatch.screens.GameScreen
import com.example.toomatch.screens.MainScreen

@Composable
fun AppNavigation(){
   val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.MainScreen.route){
        composable(route = AppScreens.MainScreen.route){
            MainScreen(navController)
        }
        composable(route = AppScreens.CreditsScreen.route){
            CreditsScreen(navController)
        }
        composable(route = AppScreens.GameScreen.route){
            GameScreen(navController)
        }
    }
}