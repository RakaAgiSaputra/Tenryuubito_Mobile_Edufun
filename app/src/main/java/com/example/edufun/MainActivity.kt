package com.example.edufun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.edufun.ui.theme.EdufunTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EdufunTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp(){
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
       OnboardingDua(innerPadding)
    }
}


@Composable
fun OnboardingSatu(pd: PaddingValues){
    Box(
        modifier = Modifier.padding(pd)
    ){
        Column(modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = null
            )
        }
    }
}

@Composable
fun OnboardingDua(pd: PaddingValues){
    Box(
        modifier = Modifier.padding(pd)
    ){
        Column(modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Selamat Datang di Edufun!")
            Image(
                painter = painterResource(R.drawable.img_board1),
                contentDescription = null
            )
            Text("Platform belajar yang seru dan interaktif untuk meningkatkan literasi dan moral anak-anak.")

        Button(onClick = {}){
            Text("Mulai")
        }
        }
    }
}
@Composable
fun OnboardingTiga(pd: PaddingValues){
    Box(
        modifier = Modifier.padding(pd)
    ){
        Column(modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Selamat Datang di Edufun!")
            Image(
                painter = painterResource(R.drawable.img_board1),
                contentDescription = null
            )
            Text("Platform belajar yang seru dan interaktif untuk meningkatkan literasi dan moral anak-anak.")

        Button(onClick = {}){
            Text("Mulai")
        }
        }
    }
}
