package com.google.firebase.quickstart.auth.abstatehoistingcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.firebase.quickstart.auth.abstatehoistingcompose.ui.theme.AbStatehoistingComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AbStatehoistingComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DemoScreen()
                }
            }
        }
    }
}

@Composable
fun DemoScreen() {

    var textState by remember { mutableStateOf("") }

    val onTextChange = { text : String ->
        textState = text
    }

    MyTextField(text = textState, onTextChange = onTextChange)
}

@Composable
fun MyTextField(text: String, onTextChange : (String) -> Unit) {

    TextField(
        value = text,
        onValueChange = onTextChange
    )
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AbStatehoistingComposeTheme {
        DemoScreen()
    }
}