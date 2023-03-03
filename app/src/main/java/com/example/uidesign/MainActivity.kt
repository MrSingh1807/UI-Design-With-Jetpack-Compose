package com.example.uidesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.uidesign.ui.theme.UIDesignTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MainScreen()

        }
    }
}

@Composable
fun MainScreen(){
    Column {
        repeat(10){
            AnimatedShimmer()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}