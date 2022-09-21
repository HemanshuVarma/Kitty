package com.varma.hemanshu.kitty.ui.components

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.varma.hemanshu.kitty.R
import com.varma.hemanshu.kitty.ui.theme.KittyTheme

@Composable
fun AppBar() {
    TopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.app_name)
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun AppBarPreview() {
    KittyTheme {
        AppBar()
    }
}