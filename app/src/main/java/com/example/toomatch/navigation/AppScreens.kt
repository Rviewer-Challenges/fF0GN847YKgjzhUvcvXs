package com.example.toomatch.navigation

sealed class AppScreens(val route: String){
    object MainScreen: AppScreens("main_screen")
    object CreditsScreen: AppScreens("credits_screen")
    object GameScreen: AppScreens("game_screen")
    object GameSettingsScreen: AppScreens("gameSettings_screen")
    object OptionsScreen: AppScreens("options_screen")
}
