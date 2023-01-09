package com.vicksoson.stockacompose.utill

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.vicksoson.stockacompose.ui.theme.Black
import com.vicksoson.stockacompose.ui.theme.Primary
import com.vicksoson.stockacompose.ui.theme.Teal200
import java.util.*


@Composable
fun CustomText(
    modifier: Modifier,
    text: String,
    fontSize: Int = 22,
    textAlign: TextAlign = TextAlign.Center,
    fontWeight: FontWeight = FontWeight.SemiBold
) {
    val annotedText = buildAnnotatedString {
        text.split(" ").forEach {
            if (it.lowercase(Locale.ROOT) == "stocka") {
                it.forEach { char ->
                    if (char == 'a') {
                        pushStringAnnotation(
                            tag = "stocka",
                            annotation = char.toString()
                        )
                        withStyle(
                            style = SpanStyle(
                                color = Primary,
                                fontSize = fontSize.sp,
                                fontWeight = fontWeight,

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
                                fontSize = fontSize.sp,
                                fontWeight = fontWeight,

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
                        fontSize = fontSize.sp,
                        fontWeight = fontWeight
                    )
                ) {
                    append("$it ")
                }
                pop()
            }
        }

    }
    Text(text = annotedText, modifier = modifier, textAlign = textAlign)
}