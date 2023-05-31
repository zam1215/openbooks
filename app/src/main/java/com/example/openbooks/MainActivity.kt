package com.example.openbooks

import android.content.Context
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.openbooks.ui.theme.鍾愛美Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            鍾愛美Theme {
                // A surface container using the 'background' color from the theme

                Surface(modifier = Modifier.fillMaxSize(),  color = MaterialTheme.colors.background) {
                    Greeting("鍾愛美")

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "作者：海青班數媒 $name")
        Image(
            painterResource(id = R.drawable.map),
            contentDescription ="map")
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    鍾愛美Theme {
        Greeting("鍾愛美")
    }
}