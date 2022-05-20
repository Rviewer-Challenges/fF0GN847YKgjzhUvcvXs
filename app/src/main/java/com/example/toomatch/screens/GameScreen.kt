package com.example.toomatch.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
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
fun LoadImages(){

    var level = 0

    when (level) {
        0 -> {
            print("x == 0")
        }
        1 -> {
            print("x == 1")
        }
        2 -> {
            print("x == 2")
        }
    }


}

@Composable
fun ImageDistribution(){
    var i = 0
    var x = 0
    Column {
        while (x < 4){
            Row {
                while (i < 4){
                    SetImage()
                    i++
                }
            }
            x++
            i=0
        }
    }
}
@Composable
fun SetImage(){
     Image(
        modifier = Modifier
            .height(Dp(80f))
            .width(Dp(80f)),
        painter = painterResource(R.drawable.fila_1_columna_11),
        contentDescription = null
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
        ImageDistribution()
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