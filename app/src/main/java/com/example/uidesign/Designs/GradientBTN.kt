package com.example.uidesign.Designs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uidesign.ui.theme.customColor1
import com.example.uidesign.ui.theme.customColor2

@Composable
fun GradientBTN(
    text: String = "Button",
    textColor: Color = Color.White,
    gradient: Brush = Brush.horizontalGradient(),
    onClick: () -> Unit
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        contentPadding = PaddingValues(),
        onClick = { onClick }) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = text, color = textColor)

        }
    }
}

@Preview
@Composable
fun PreviewGradientBTN() {
    GradientBTN(gradient = Brush.horizontalGradient(
        listOf(customColor1, customColor2)
    )) {
    }
}