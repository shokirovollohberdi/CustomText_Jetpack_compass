package com.example.jetpackcompassfirst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompassfirst.ui.theme.JetpackCompassFirstTheme
import com.example.jetpackcompassfirst.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompassFirstTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        Greeting("Android")
                        customText(text = "My First Compass application")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        Modifier.padding(10.dp)
    )
}

@Composable
fun customText(text: String) {
    Text(
        text = text,
        Modifier.padding(10.dp),
        style = Typography.h5,
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackCompassFirstTheme {
        Column {
            Greeting("Android")
            customText(text = "My First Compass application")
        }

    }
}