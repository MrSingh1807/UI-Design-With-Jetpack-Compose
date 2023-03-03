package com.example.uidesign

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
        Image(
            modifier = Modifier
                .size(300.dp)
                .clip(RoundedCornerShape(size = 50.dp))  // CircleShape
                .border(
                    width = 10.dp,
                    color = Color.Cyan,
                    shape = RoundedCornerShape(size = 50.dp)  // CircleShape
                ),
            painter = painterResource(id = R.drawable.ic_visibility),
            contentDescription = "Cat Circular Image",
            alignment = Alignment.Center,
        )
}

@Preview(showBackground = true)
@Composable
fun PreviewMain() {
    MainScreen()
}