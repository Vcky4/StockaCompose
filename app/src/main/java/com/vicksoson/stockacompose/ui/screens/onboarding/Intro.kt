package com.vicksoson.stockacompose.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vicksoson.stockacompose.R
import com.vicksoson.stockacompose.ui.theme.Black
import com.vicksoson.stockacompose.ui.theme.Primary


@Composable
fun Intro() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 38.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.stocka_logo),
            contentDescription = "Stocka Logo",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Text(
            text = "The best way to manage your daily sales, income and purchases",
            modifier = Modifier.padding(top = 50.dp, end = 20.dp),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        )

        Column(Modifier.padding(top = 50.dp)) {
            (0..3).map { each ->
                Row(
                    modifier = Modifier.padding(vertical = 12.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.tick_box),
                        contentDescription = "Tick Box"
                    )
                    Text(
                        text = when (each) {
                            0 -> "Forecast Profit"
                            1 -> "Scan goods at the point of purchase"
                            2 -> "Stay up to date with daily charts"
                            else -> "Connect with other business owners"
                        },
                        modifier = Modifier.padding(start = 12.dp, end = 30.dp),
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Black
                        )
                    )
                }
            }
        }

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