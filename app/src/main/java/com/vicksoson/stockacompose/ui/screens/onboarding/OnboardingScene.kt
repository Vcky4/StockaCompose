package com.vicksoson.stockacompose.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import com.vicksoson.stockacompose.R
import com.vicksoson.stockacompose.ui.theme.Black
import com.vicksoson.stockacompose.ui.theme.Gray
import com.vicksoson.stockacompose.ui.theme.Primary
import com.vicksoson.stockacompose.ui.theme.Teal200
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardingScene(onGetStarted: () -> Unit = {}) {
    Column(Modifier.fillMaxSize()) {
        val pagerState = rememberPagerState()
        val scope = rememberCoroutineScope()
        HorizontalPager(
            count = 3, state = pagerState,
            modifier = Modifier.weight(1f)
        ) { page ->
            Column(
                Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(
                        id = when (page) {
                            0 -> R.drawable.bro
                            1 -> R.drawable.amico
                            else -> R.drawable.onbaording3
                        }
                    ), contentDescription = "onboarding image", modifier = Modifier.size(223.dp)
                )
                CustomText(
                    text = when (page) {
                        0 -> "Manage your stock on a daily, weekly and monthly basis"
                        1 -> "Monitor your business growth, in real time."
                        else -> "Be a step ahead in your business with stocka"
                    },
                    modifier = Modifier
                        .widthIn(max = 301.dp)
                        .padding(top = 67.dp),
                )

            }
        }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            HorizontalPagerIndicator(
                pagerState = pagerState,
                activeColor = Primary,
                indicatorWidth = 12.7.dp,
                indicatorHeight = 12.7.dp,
                inactiveColor = Gray
            )
            Button(
                onClick = {
                    when (pagerState.currentPage) {
                        2 -> {
                            onGetStarted.invoke()
                        }
                        else -> scope.launch {
                            pagerState.animateScrollToPage(
                                pagerState.currentPage.plus(
                                    1
                                )
                            )
                        }
                    }
                },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 80.dp, top = 56.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Primary
                )
            ) {
                Text(
                    text = when (pagerState.currentPage) {
                        2 -> "Get Started"
                        else -> "Next"
                    }, style = TextStyle(color = Black)
                )
            }
        }
    }
}

@Composable
fun CustomText(modifier: Modifier, text: String) {
    val annotedText = buildAnnotatedString {
        text.split(" ").forEach {
            if (it == "stocka") {
                "stocka".forEach { char ->
                    if (char == 'a') {
                        pushStringAnnotation(
                            tag = "stocka",
                            annotation = char.toString()
                        )
                        withStyle(
                            style = SpanStyle(
                                color = Primary,
                                fontSize = 22.sp,
                                fontWeight = FontWeight.SemiBold,

                                )
                        ) {
                            append("$char")
                        }
                        pop()
                    } else {
                        pushStringAnnotation(
                            tag = "stocka",
                            annotation = char.toString()
                        )
                        withStyle(
                            style = SpanStyle(
                                color = Teal200,
                                fontSize = 22.sp,
                                fontWeight = FontWeight.SemiBold,

                                )
                        ) {
                            append("$char")
                        }
                        pop()
                    }
                }
            } else {
                pushStringAnnotation(
                    tag = "URL",
                    annotation = it
                )
                withStyle(
                    style = SpanStyle(
                        color = Black,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                ) {
                    append("$it ")
                }
                pop()
            }
        }

    }
    Text(text = annotedText, modifier = modifier, textAlign = TextAlign.Center)
}