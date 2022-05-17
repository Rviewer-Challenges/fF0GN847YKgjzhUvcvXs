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

@Composable
fun CreditsScreen(){
    Scaffold() {
        CreditsBodyContent()
    }
}

@Composable
fun CreditsBodyContent(){
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

@Preview(showBackground = true)
@Composable
fun CreditsDefaultPreview(){
    CreditsScreen()
}