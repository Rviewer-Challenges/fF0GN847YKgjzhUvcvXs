package com.example.toomatch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.toomatch.screens.MainScreen
import com.example.toomatch.screens.MyTexts
import androidx.compose.material.Text as MyText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Surface() {
                MainScreen()
            }
        }
    }
}
@Preview (showSystemUi = true)
@Composable
fun PreviewTexts(){
    MainScreen()
}
