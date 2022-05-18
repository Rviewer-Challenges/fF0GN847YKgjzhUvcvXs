package com.example.toomatch.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.toomatch.R
import com.example.toomatch.navigation.AppNavigation

@Composable
fun GameScreen(navController: NavController){
    Scaffold() {
        GameScreenBodyContent(navController)
    }
}

@Composable
fun MyImage(){
    Image(
        painter = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "Content description for visually impaired"
    )
}

@Composable
fun GameScreenBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "hola navegacion")
        MyImage()
      Button(onClick = { /*TODO*/ }) {
            Text(text = "navega")
        }
    }
}

@Preview (showSystemUi = true)
@Composable
fun PreviewGameScreen(){
    GameScreenBodyContent(rememberNavController())
}