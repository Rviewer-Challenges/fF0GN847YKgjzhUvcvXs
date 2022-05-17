package com.example.toomatch.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(){
    Scaffold() {
        MyTexts()
    }
}

@Composable
fun MyTexts(){
    Column {
        Title("TOOMATCH")
    }
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Spacer(modifier = Modifier.height(50.dp))
        SimpleButton("Start")
        SimpleButton("Options")
        SimpleButton("Credits")
    }

}

@Composable
fun SimpleButton(myText: String) {
    Button(onClick = {
        //your onclick code here
    }) {
        Text(text = myText)
    }
}


@Composable
fun Title(text: String){
    Text(text)
}

@Preview (showSystemUi = true)
@Composable
fun PreviewTexts(){
    MyTexts()
}