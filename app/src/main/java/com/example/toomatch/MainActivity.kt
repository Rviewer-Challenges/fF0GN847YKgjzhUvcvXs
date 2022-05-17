package com.example.toomatch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.Text as MyText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MyTexts()
        }

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
        MyText(text = myText)
    }
}


@Composable
fun Title(text: String){
    MyText(text)
}

@Preview (showSystemUi = true)
@Composable
fun PreviewTexts(){
    MyTexts()
}