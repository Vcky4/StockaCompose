package com.vicksoson.stockacompose.ui.screens.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vicksoson.stockacompose.ui.screens.home.Home
import com.vicksoson.stockacompose.ui.screens.navigation.graph.authGraph

@Composable
fun MainNav() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "auth") {
        authGraph(navController = navController)
        composable("home") {
            Home()
        }
    }
}