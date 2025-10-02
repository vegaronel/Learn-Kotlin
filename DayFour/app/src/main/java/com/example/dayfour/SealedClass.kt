package com.example.dayfour

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

sealed class Screen(val route: String) {
    object FirstScreen : Screen("home")
    object SecondScreen : Screen("second")
}


@Composable
fun FirstScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text("First Screen")
        Button(onClick = {
            navController.navigate(Screen.SecondScreen.route)
        }) {
            Text("Go to Second Screen")
        }
    }
}

@Composable
fun SecondScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text("Second Screen")
        Button(onClick = {
            navController.navigate(Screen.FirstScreen.route)
        }) {
            Text("Back to Main Screen")
        }
    }
}