package com.vicksoson.stockacompose.ui.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.vicksoson.stockacompose.utill.CustomText

@Composable
fun Home() {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        CustomText(modifier = Modifier, text = "stocka")
    }
}