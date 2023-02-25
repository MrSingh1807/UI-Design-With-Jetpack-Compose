package com.example.uidesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.uidesign.ui.theme.UIDesignTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val mainViewModel : MainViewModel by viewModels()


                MainScreen(mainViewModel = mainViewModel)

        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}