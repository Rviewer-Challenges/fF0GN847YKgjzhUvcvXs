package com.example.toomatch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.toomatch.ui.theme.ToomatchTheme
import androidx.compose.material.Text as MyText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(){
            MyTexts()
        }

    }
}

@Composable
fun MyTexts(){
    Column {
        Title("TOOMATCH")
        SimpleButton()
        SimpleButton()
        SimpleButton()
    }

}

@Composable
fun SimpleButton() {
    Button(onClick = {
        //your onclick code here
    }) {
        MyText(text = "Simple Button")
    }
}


@Composable
fun Title(text: String){
    MyText(text)
}

@Preview
@Composable
fun PreviewTexts(){
    MyTexts()
}