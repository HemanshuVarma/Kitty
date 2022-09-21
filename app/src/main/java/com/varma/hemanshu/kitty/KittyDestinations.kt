package com.varma.hemanshu.kitty

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Contract for information needed on every App navigation destination
 */
interface KittyDestinations {
    val icon: ImageVector
    val route: String
}

object HomeScreen : KittyDestinations {
    override val icon: ImageVector
        get() = Icons.Filled.Home
    override val route: String
        get() = "home"
}

object DetailsScreen : KittyDestinations {
    override val icon: ImageVector
        get() = Icons.Filled.ArrowBack
    override val route: String
        get() = "kitty_details"
}