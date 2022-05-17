package com.example.toomatch.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen(){
    Scaffold() {
        
    }
}

@Composable
fun BodyContent(){
    Column() {
        Text(text = "hola navegacion")
      /* Button(onClick = {  }) {
            Text(text = "navega")
        }*/
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    MainScreen()
}