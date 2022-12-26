package com.vicksoson.stockacompose.ui.screens.onboarding

import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.vicksoson.stockacompose.ui.theme.Black
import com.vicksoson.stockacompose.ui.theme.Primary

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardingScene() {
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        val pagerState = rememberPagerState()
        HorizontalPager(count = 3, state = pagerState) {
            Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = ), contentDescription = )
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