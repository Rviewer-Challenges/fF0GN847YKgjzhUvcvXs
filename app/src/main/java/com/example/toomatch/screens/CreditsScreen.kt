package com.example.toomatch.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun CreditsScreen(navController: NavController){
    Scaffold() {
        CreditsBodyContent(navController)
    }
}

@Composable
fun CreditsBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "hola navegacion")
      Button(onClick = { /*TODO*/ }) {
            Text(text = "navega")
        }
    }
}

@Preview (showSystemUi = true)
@Composable
fun PreviewCreditsScreen(){
    CreditsBodyContent(rememberNavController())
}