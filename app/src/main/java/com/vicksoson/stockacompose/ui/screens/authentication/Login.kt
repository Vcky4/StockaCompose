package com.vicksoson.stockacompose.ui.screens.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.vicksoson.stockacompose.R

@Composable
fun Login() {
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Image(
            painter = painterResource(id = R.drawable.stocka_logo),
            contentDescription = "stocka logo",
            modifier = Modifier.size(48.dp)
        )
    }
}