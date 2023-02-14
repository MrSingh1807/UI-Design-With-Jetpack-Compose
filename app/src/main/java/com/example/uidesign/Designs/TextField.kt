package com.example.uidesign

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun CustomizedTextField() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        var text by remember { mutableStateOf("Mr Singh... ") }

        /********    EditText in XML     *******/
        TextField(      // BasicTextField, OutlineTextField
            modifier = Modifier.fillMaxWidth(),
            value = text,
            onValueChange = {
                text = it
            },
//            enabled = true,
//            readOnly = true,
            label = {
                Text(text = "Title")
            },
//            singleLine = true,
//            maxLines = 2,
            leadingIcon = {
                IconButton(onClick = { Log.d("Leading Icon", "Clicked") }) {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Email Icon"
                    )
                }
            },
            trailingIcon = {
                IconButton(onClick = { Log.d("Trailing Icon", "Clicked") }) {
                    Icon(
                        imageVector = Icons.Filled.Check,
                        contentDescription = "Email Check"
                    )
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Go
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    Log.d("ImeAction", "Clicked")
                }
            )
        )

    }

}

@Composable
fun Password() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var password by rememberSaveable { mutableStateOf("") }
        var passwordVisibility by remember { mutableStateOf(false) }

        val icon = if (passwordVisibility) {
            painterResource(id = R.drawable.ic_visibility)
        } else {
            painterResource(id = R.drawable.visibility_off)
        }

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "Password") },
            label = { Text(text = "Password") },
            trailingIcon = {
                IconButton(
                    onClick = {
                        passwordVisibility = !passwordVisibility
                    }) {
                    Icon(
                        painter = icon,
                        contentDescription = "visibility icon"
                    )
                }
            },
            visualTransformation = if (passwordVisibility) VisualTransformation.None
            else PasswordVisualTransformation()
        )
    }
}
@Composable
fun ManageCharacterLimits() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var name by remember { mutableStateOf(" ") }
        val maxChar = 10

        OutlinedTextField(
            value = name,
            onValueChange = {
                if (it.length < maxChar) {
                    name = it
                }
            },
            label = { Text(text = "Name") },
            placeholder = { Text(text = "Enter Your Name") },
            maxLines = 1
        )
    }
}

@Preview
@Composable
fun PreviewTextField() {
    Surface(modifier = Modifier.fillMaxSize()) {
        ManageCharacterLimits()
    }
}