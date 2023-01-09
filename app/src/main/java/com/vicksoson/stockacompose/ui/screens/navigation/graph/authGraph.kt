package com.vicksoson.stockacompose.ui.screens.navigation.graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.vicksoson.stockacompose.ui.screens.authentication.Login
import com.vicksoson.stockacompose.ui.screens.authentication.SignUp
import com.vicksoson.stockacompose.ui.screens.navigation.routes.AuthRoutes
import com.vicksoson.stockacompose.ui.screens.onboarding.Intro
import com.vicksoson.stockacompose.ui.screens.onboarding.OnboardingScene
import com.vicksoson.stockacompose.ui.screens.onboarding.StartScreen
import com.vicksoson.stockacompose.ui.screens.onboarding.Welcome


fun NavGraphBuilder.authGraph(
    navController: NavController
) {
    navigation(
        startDestination = AuthRoutes.Intro,
        route = AuthRoutes.Default
    ) {
        composable(AuthRoutes.Start) {
            StartScreen(
                onAction = {
                    when (it) {
                        AuthRoutes.SignUp -> navController.navigate(AuthRoutes.SignUp)
                        AuthRoutes.Login -> navController.navigate(AuthRoutes.Login)
                    }
                }
            )
        }
        composable(AuthRoutes.Intro) {
            Intro(
                onContinue = {
                    navController.navigate(AuthRoutes.Onboarding)
                }
            )
        }
        composable(AuthRoutes.Onboarding) {
            OnboardingScene(
                onGetStarted = {
                    navController.navigate(AuthRoutes.Start)
                }
            )
        }
        composable(AuthRoutes.Login) {
            Login()
        }

        composable(AuthRoutes.SignUp) {
            SignUp(
                onComplete = {
                    navController.navigate(AuthRoutes.Welcome)
                }
            )
        }

        composable(AuthRoutes.Welcome) {
            Welcome(
                onEnter = {
                    navController.navigate("home")
                }
            )
        }
    }
}