package com.example.moviedbjetpackcompose

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.moviedbjetpackcompose.navigation.Actions
import com.example.moviedbjetpackcompose.navigation.Destination
import com.example.moviedbjetpackcompose.ui.DashboardScreen
import com.example.moviedbjetpackcompose.ui.colorSecondary
import com.example.moviedbjetpackcompose.ui.onboarding.OnboardingScreen
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun ComposeApp() {
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = !isSystemInDarkTheme()

    DisposableEffect(systemUiController, useDarkIcons) {
        // Update all of the system bar colors to be transparent, and use
        // dark icons if we're in light theme
        systemUiController.setSystemBarsColor(
            color = colorSecondary,
            darkIcons = false
        )


        // setStatusBarColor() and setNavigationBarColor() also exist

        onDispose {}
    }


    val navController = rememberNavController()

    val actions = remember(navController) { Actions(navController) }
    MaterialTheme {
        NavHost(navController = navController, startDestination = Destination.Onboarding) {

            composable(Destination.Onboarding) {
                OnboardingScreen(actions.openDashboard)
            }

            composable(Destination.DashBoard) {
                DashboardScreen()
            }
        }
    }
}