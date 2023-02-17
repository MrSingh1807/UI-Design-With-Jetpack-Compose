package com.example.uidesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.uidesign.Designs.CustomComponents.CustomComponent
import com.example.uidesign.Navigation.SetUpNavGraph
import com.example.uidesign.ui.theme.UIDesignTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIDesignTheme {
                navController = rememberNavController()

                MainScreen(navController = navController)
            }

        }
    }
}

@Composable
fun MainScreen(navController: NavHostController) {
    SetUpNavGraph(navController = navController)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen(rememberNavController())
}