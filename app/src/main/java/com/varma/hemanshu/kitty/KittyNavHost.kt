package com.varma.hemanshu.kitty

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.varma.hemanshu.kitty.ui.screen.HomeScreen
import com.varma.hemanshu.kitty.ui.screen.KittyDetailsScreen

@Composable
fun KittyNavHost(
    navController: NavHostController, modifier: Modifier = Modifier
) {

    NavHost(
        navController = navController, startDestination = HomeScreen.route, modifier = modifier
    ) {
        composable(
            route = HomeScreen.route
        ) {
            HomeScreen()
        }

        composable(
            route = DetailsScreen.route
        ) {
            KittyDetailsScreen()
        }
    }
}