package com.vicksoson.stockacompose.ui.screens.navigation.graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.vicksoson.stockacompose.ui.screens.authentication.Login
import com.vicksoson.stockacompose.ui.screens.authentication.SignUp
import com.vicksoson.stockacompose.ui.screens.onboarding.Intro
import com.vicksoson.stockacompose.ui.screens.onboarding.OnboardingScene
import com.vicksoson.stockacompose.ui.screens.onboarding.StartScreen
import com.vicksoson.stockacompose.ui.screens.onboarding.Welcome


fun NavGraphBuilder.authGraph(
    navController: NavController
) {
    navigation(
        startDestination = "intro",
        route = "auth"
    ) {
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
                    navController.navigate("start")
                }
            )
        }
        composable("login") {
            Login()
        }

        composable("signUp") {
            SignUp(
                onComplete = {
                    navController.navigate("welcome")
                }
            )
        }

        composable("welcome") {
            Welcome(
                onEnter = {
                    navController.navigate("home")
                }
            )
        }
    }
}