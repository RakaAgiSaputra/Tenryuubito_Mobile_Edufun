package com.example.edufun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.edufun.ui.theme.EdufunTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EdufunTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyContentApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MyContentApp(modifier: Modifier) {
    Column(modifier = Modifier .fillMaxSize(), verticalArrangement = Arrangement.Center, )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EdufunTheme {
        Greeting("Android")
    }
}