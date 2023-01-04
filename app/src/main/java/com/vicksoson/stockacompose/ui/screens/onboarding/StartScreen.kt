package com.vicksoson.stockacompose.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.vicksoson.stockacompose.R

@Composable
fun StartScreen() {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.stocka_logo),
            contentDescription = "Stocka Logo",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}