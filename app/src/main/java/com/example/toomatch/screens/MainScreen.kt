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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.toomatch.navigation.AppScreens

@Composable
fun MainScreen(navController: NavController){
    Scaffold() {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController){
    Column {
        Title("TOOMATCH")
    }
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Spacer(modifier = Modifier.height(50.dp))
        SimpleButton("Start", AppScreens.CreditsScreen.route, navController)
        SimpleButton("Options",AppScreens.CreditsScreen.route, navController)
        SimpleButton("Credits",AppScreens.CreditsScreen.route, navController)
    }

}

@Composable
fun SimpleButton(myText: String, route: String, navController: NavController) {
    Button(onClick = {
        navController.navigate(route)
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
fun PreviewMainScreen() {
    BodyContent(rememberNavController())
}