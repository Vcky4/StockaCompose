package com.vicksoson.stockacompose.ui.screens.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.vicksoson.stockacompose.ui.theme.Black
import com.vicksoson.stockacompose.ui.theme.Primary

@Composable
fun OnboardingScene() {
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 80.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Primary
            )
        ) {
            Text(text = "Continue", style = TextStyle(color = Black))
        }
    }
}