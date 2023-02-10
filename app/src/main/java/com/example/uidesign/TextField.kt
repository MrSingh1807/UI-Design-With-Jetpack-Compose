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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun CustomizedTextField() {

    Column(
        modifier = Modifier.fillMaxSize().padding(10.dp),
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

@Preview
@Composable
fun PreviewTextField() {
    Surface(modifier = Modifier.fillMaxSize()) {
        CustomizedTextField()
    }
}