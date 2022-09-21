package com.varma.hemanshu.kitty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.varma.hemanshu.kitty.factory.ViewModelProviderFactory
import com.varma.hemanshu.kitty.repository.CatRepositoryImpl
import com.varma.hemanshu.kitty.repository.Repository
import com.varma.hemanshu.kitty.ui.components.AppBar
import com.varma.hemanshu.kitty.ui.theme.KittyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KittyApp()
        }
    }
}

@Composable
fun KittyApp() {
    KittyTheme {
        val navController = rememberNavController()
        val catRepository: Repository = CatRepositoryImpl()
        val viewModelFactory = ViewModelProviderFactory(catRepository)

        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = { AppBar() }
        ) { innerPadding ->
            KittyNavHost(
                navController = navController,
                viewModelFactory = viewModelFactory,
                modifier = Modifier.padding(paddingValues = innerPadding)
            )
        }
    }
}