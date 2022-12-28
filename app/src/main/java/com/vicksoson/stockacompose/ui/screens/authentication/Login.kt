package com.vicksoson.stockacompose.ui.screens.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vicksoson.stockacompose.R

@Composable
fun Login() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 23.dp, vertical = 44.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        var userName by remember {
            mutableStateOf(TextFieldValue(""))
        }
        // Logo
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

        // Login Form
        Column(Modifier.fillMaxWidth()) {
            //greeting
            Text(text = "Welcome back!", fontSize = 24.sp, fontWeight = FontWeight.Medium)

            //username
            TextField(
                value = userName,
                onValueChange = {
                    userName = it },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                ),
            )
        }


    }
}