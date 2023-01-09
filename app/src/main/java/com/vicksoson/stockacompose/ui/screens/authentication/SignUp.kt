package com.vicksoson.stockacompose.ui.screens.authentication

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
fun SignUp(onComplete: () -> Unit = {}) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 23.dp, vertical = 44.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        var userName by remember {
            mutableStateOf(TextFieldValue(""))
        }
        var phoneNumber by remember {
            mutableStateOf(TextFieldValue(""))
        }
        var email by remember {
            mutableStateOf(TextFieldValue(""))
        }
        var industry by remember {
            mutableStateOf(TextFieldValue(""))
        }
        var password by remember {
            mutableStateOf(TextFieldValue(""))
        }
        var confirmPassword by remember {
            mutableStateOf(TextFieldValue(""))
        }
        var step by remember {
            mutableStateOf(1)
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

        BackHandler(enabled = step > 1) {
            step--
        }

        // Login Form
        Column(
            Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            //greeting
            Text(
                text = if (step == 1) "Let’s get you started" else "Complete Set Up ",
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium
            )
            if (step == 1) {
                Text(text = "Create An Account", fontSize = 12.sp, color = Gray)
            }

            when (step) {
                1 -> {
                    //username
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(top = 38.dp)
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
                            .padding(top = 38.dp)
                    ) {
                        TextField(
                            value = phoneNumber,
                            onValueChange = {
                                phoneNumber = it
                            },
                            colors = TextFieldDefaults.textFieldColors(
                                backgroundColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                disabledIndicatorColor = Color.Transparent,
                                cursorColor = Primary,
                            ),
                            placeholder = {
                                Text(text = "Phone Number", color = Color.Gray)
                            },
                            modifier = Modifier
                                .border(1.dp, Gray, RoundedCornerShape(10.dp))
                                .fillMaxWidth(),

                            )
                    }
                    //email
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(top = 38.dp)
                    ) {
                        TextField(
                            value = email,
                            onValueChange = {
                                email = it
                            },
                            colors = TextFieldDefaults.textFieldColors(
                                backgroundColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                disabledIndicatorColor = Color.Transparent,
                                cursorColor = Primary,
                            ),
                            placeholder = {
                                Text(text = "Email Address", color = Color.Gray)
                            },
                            modifier = Modifier
                                .border(1.dp, Gray, RoundedCornerShape(10.dp))
                                .fillMaxWidth(),

                            )
                    }
                    //industry
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(vertical = 38.dp)
                    ) {
                        TextField(
                            value = industry,
                            onValueChange = {
                                industry = it
                            },
                            colors = TextFieldDefaults.textFieldColors(
                                backgroundColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                disabledIndicatorColor = Color.Transparent,
                                cursorColor = Primary,
                            ),
                            placeholder = {
                                Text(
                                    text = "What industry does your business operate in?",
                                    color = Color.Gray
                                )
                            },
                            modifier = Modifier
                                .border(1.dp, Gray, RoundedCornerShape(10.dp))
                                .fillMaxWidth(),

                            )
                    }
                }
                2 -> {
                    //password
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(top = 38.dp)
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
                                Text(text = "Create Password", color = Color.Gray)
                            },
                            modifier = Modifier
                                .border(1.dp, Gray, RoundedCornerShape(10.dp))
                                .fillMaxWidth(),

                            )
                    }
                    //confirm pasword
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(vertical = 38.dp)
                    ) {
                        TextField(
                            value = confirmPassword,
                            onValueChange = {
                                confirmPassword = it
                            },
                            colors = TextFieldDefaults.textFieldColors(
                                backgroundColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                disabledIndicatorColor = Color.Transparent,
                                cursorColor = Primary,
                            ),
                            placeholder = {
                                Text(
                                    text = "Confirm Password",
                                    color = Color.Gray
                                )
                            },
                            modifier = Modifier
                                .border(1.dp, Gray, RoundedCornerShape(10.dp))
                                .fillMaxWidth(),

                            )
                    }
                }
            }
        }

        Button(
            onClick = {
                if (step == 1) {
                    step = 2
                } else {
                    onComplete.invoke()
                }
            },
            colors = ButtonDefaults.buttonColors(backgroundColor = Primary),
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(), shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                text = if (step == 2) "Sign In" else "Continue",
                color = Color.Black,
                fontSize = 14.sp
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Already have an account?",
                fontSize = 10.sp,
                modifier = Modifier.padding(end = 4.dp)
            )
            Text(text = "Login", fontSize = 10.sp, color = Primary)
        }

    }
}
