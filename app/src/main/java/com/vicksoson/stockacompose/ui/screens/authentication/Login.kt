package com.vicksoson.stockacompose.ui.screens.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
import com.vicksoson.stockacompose.ui.theme.Gray
import com.vicksoson.stockacompose.ui.theme.Primary

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
        var password by remember {
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
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 42.dp)
            ) {
                TextField(
                    value = userName,
                    onValueChange = {
                        userName = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        cursorColor = Primary,
                    ),
                    placeholder = {
                        Text(text = "Username", color = Color.Gray)
                    },
                    modifier = Modifier
                        .border(1.dp, Gray, RoundedCornerShape(10.dp))
                        .fillMaxWidth(),

                    )
            }
            //password
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 42.dp)
            ) {
                TextField(
                    value = password,
                    onValueChange = {
                        password = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        cursorColor = Primary,
                    ),
                    placeholder = {
                        Text(text = "Password", color = Color.Gray)
                    },
                    modifier = Modifier
                        .border(1.dp, Gray, RoundedCornerShape(10.dp))
                        .fillMaxWidth(),

                    )
            }

            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Primary),
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth(), shape = RoundedCornerShape(10.dp)
            ) {
                Text(text = "Log In", color = Color.Black, fontSize = 14.sp)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Don't have an account?",
                    fontSize = 10.sp,
                    modifier = Modifier.padding(end = 4.dp)
                )
                Text(text = "Sign Up", fontSize = 10.sp, color = Primary)
            }

        }


    }
}