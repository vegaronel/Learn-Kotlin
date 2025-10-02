package com.example.dayfour

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Screen.FirstScreen.route) {
        composable(Screen.FirstScreen.route) {
            FirstScreen(navController)
        }
        composable(Screen.SecondScreen.route) {
            SecondScreen(navController)
        }
    }
}

fun Sample() {

}