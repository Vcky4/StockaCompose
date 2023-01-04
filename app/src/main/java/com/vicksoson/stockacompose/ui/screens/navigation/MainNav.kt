package com.vicksoson.stockacompose.ui.screens.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vicksoson.stockacompose.ui.screens.authentication.Login
import com.vicksoson.stockacompose.ui.screens.authentication.SignUp
import com.vicksoson.stockacompose.ui.screens.onboarding.Intro
import com.vicksoson.stockacompose.ui.screens.onboarding.OnboardingScene
import com.vicksoson.stockacompose.ui.screens.onboarding.StartScreen

@Composable
fun MainNav() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "start") {
        composable("start") {
            StartScreen(
                onAction = {
                    when (it) {
                        "signUp" -> navController.navigate("signUp")
                        "login" -> navController.navigate("login")
                    }
                }
            )
        }
        composable("intro") {
            Intro(
                onContinue = {
                    navController.navigate("onboarding")
                }
            )
        }
        composable("onboarding") {
            OnboardingScene(
                onGetStarted = {
                    navController.navigate("login")
                }
            )
        }
        composable("login") {
            Login()
        }

        composable("signUp") {
            SignUp()
        }
    }
}