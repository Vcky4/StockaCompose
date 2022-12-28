package com.vicksoson.stockacompose.ui.screens.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.vicksoson.stockacompose.R

@Composable
fun Login() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 23.dp, vertical = 44.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Card(
            Modifier
                .padding(top = 10.dp, end = 18.dp)
                .align(Alignment.End)
        ) {
            Image(
                painter = painterResource(id = R.drawable.stocka_logo),
                contentDescription = "stocka logo",
                modifier = Modifier
                    .size(48.dp)

            )
        }

    }
}