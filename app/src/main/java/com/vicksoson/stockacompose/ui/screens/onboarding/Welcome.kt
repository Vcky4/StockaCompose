package com.vicksoson.stockacompose.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vicksoson.stockacompose.R
import com.vicksoson.stockacompose.ui.theme.Primary
import com.vicksoson.stockacompose.utill.CustomText

@Composable
fun Welcome(onEnter: () -> Unit = {}) {
    Column(Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
        ) {
            Image(
                painter = painterResource(id = R.drawable.welcome_bg),
                contentDescription = "background",
                modifier = Modifier.fillMaxSize(),
            )

            Image(
                painter = painterResource(id = R.drawable.celebration),
                contentDescription = "background",
                modifier = Modifier
                    .size(200.dp)
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp),
            )

        }

        Column(
            Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp, vertical = 50.dp),
            verticalArrangement = Arrangement.SpaceBetween,

            ) {
            Column {
                Text(
                    text = "Cheers, your business is up! ",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Medium
                )
                CustomText(
                    modifier = Modifier.widthIn(max = 300.dp),
                    text = "Explore the world of business accountability with stocka",
                    fontSize = 14,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Normal
                )
            }
            Button(
                onClick = {
                    onEnter.invoke()
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Primary),
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth(), shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "Enter",
                    color = Color.Black,
                    fontSize = 14.sp
                )
            }
        }
    }
}