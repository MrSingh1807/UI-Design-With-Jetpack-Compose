package com.example.uidesign

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uidesign.ui.theme.UIDesignTheme


@Composable
fun TextCustomization() {
    Text(
        text = stringResource(id = R.string.app_name),
        modifier = Modifier
            .background(Color.LightGray)
            .padding(16.dp)
            .fillMaxWidth(),
        fontSize = MaterialTheme.typography.h6.fontSize,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Right,   // Start, Center,Left etc
    )
}

@Composable
fun AnnotatedStringInText() {
    Text(
        text = buildAnnotatedString {
            // We know; How to stylized Each or every Character of string
            withStyle(
                style = ParagraphStyle(
                    textAlign = TextAlign.Center   // Customize according Yourself
                )
            ) {
                withStyle(
                    style = SpanStyle(
                        color = Color.Magenta,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("A")
                }
                append("B")
                append("C")
                append("D")
            }
        },
        fontStyle = FontStyle.Normal,
        fontSize = 18.sp,
        modifier = Modifier
            .padding(start = 16.dp)
            .fillMaxWidth()
    )
}

@Composable
fun RepeatText() {
    Text(
        text = "Mr Singh ".repeat(20),
        maxLines = 2,
        overflow = TextOverflow.Ellipsis  // Ellipsis, Visible, Clip
    )
}

@Composable
fun TextSelection() {
    SelectionContainer {
        Column {
            Text(text = "Mr Singh")
            DisableSelection {
                Text(text = "Mr Singh")
            }
            Text(text = "Mr Singh")
        }
    }
}

@Composable
fun Script(
    normalText: String,
    normalFontSize: TextUnit = MaterialTheme.typography.subtitle1.fontSize,
    superText: String,
    superTextFontSize: TextUnit = MaterialTheme.typography.overline.fontSize,
    superTextFontWeight: FontWeight = FontWeight.Normal
) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        textAlign = TextAlign.Center,
        text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(fontSize = normalFontSize)
            ) {
                append(normalText)
            }
            withStyle(
                style = SpanStyle(
                    fontSize = superTextFontSize,
                    fontWeight = superTextFontWeight,
                    baselineShift = BaselineShift.Superscript  // SubScript
                )
            ) {
                append(superText)
            }
        }
    )
}

@Preview
@Composable
fun Preview() {
    Surface(modifier = Modifier.fillMaxSize()) {

//        Script(
//            normalText = "Mr",
//            superText = "Singh",
//            normalFontSize = MaterialTheme.typography.h4.fontSize,
//            superTextFontSize = MaterialTheme.typography.h6.fontSize
//        )
    }
}