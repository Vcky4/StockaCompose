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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vicksoson.stockacompose.R
import com.vicksoson.stockacompose.ui.theme.Primary
import com.vicksoson.stockacompose.utill.CustomText

@Composable
fun StartScreen() {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.stocka_logo),
            contentDescription = "Stocka Logo",
            modifier = Modifier
                .weight(0.3f)
                .align(Alignment.CenterHorizontally)
        )
        Column(
            Modifier
                .padding(horizontal = 23.dp)
                .weight(0.6f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            CustomText(modifier = Modifier, text = "Welcome to\n Stocka", fontSize = 36)

            Column {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Primary),
                    modifier = Modifier
                        .height(50.dp)
                        .fillMaxWidth(), shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Log In", color = Color.Black, fontSize = 14.sp)
                }
                Spacer(modifier = Modifier.height(30.dp))
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Primary),
                    modifier = Modifier
                        .height(50.dp)
                        .fillMaxWidth(), shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Sign Up", color = Color.Black, fontSize = 14.sp)
                }
            }

            Text(
                text = "By signing up, you agree to our Terms & Conditions and Privacy Policy",
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                color = Color.Gray,
                modifier = Modifier.padding(bottom = 50.dp)
            )
        }
    }
}