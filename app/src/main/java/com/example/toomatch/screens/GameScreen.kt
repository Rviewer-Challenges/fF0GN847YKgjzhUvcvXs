package com.example.toomatch.screens

import android.graphics.drawable.DrawableContainer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.toomatch.R
import com.example.toomatch.navigation.AppNavigation

var textoBoton = mutableStateOf("text")
var imagenes = mutableListOf<Painter>()


@Composable
fun GameScreen(navController: NavController){
        Scaffold() {

        GameScreenBodyContent(navController)
    }

}

@Composable
fun LoadImages(){
    imagenes.add(painterResource(R.drawable.fila_2_columna_1))
}

@Composable
fun ImageDistribution(){
    var i = 0
    var x = 0
    Column {
        while (x < 4){
            Row {
                while (i < 4){
                    SetImage(1)
                    i++
                }
            }
            x++
            i=0
        }
    }
}
@Composable
fun SetImage(numPicture: Int){
   // imagenes.add(painterResource(R.drawable.fila_2_columna_1))
     Image(
        modifier = Modifier
            .height(Dp(80f))
            .width(Dp(80f))
            .clickable { textoBoton.value = "Mimimi" },

        painter = imagenes[0],
        contentDescription = null
    )
}

/*fun MakeClick(){
    textoBoton.value = "Mimimi"
}*/

@Composable
fun GameScreenBodyContent(navController: NavController){
    LoadImages()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = textoBoton.value)
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