package com.techlads.gamewhisper.presentation.home

sealed class MainScreenState {
    object Init: MainScreenState()
    object Loading: MainScreenState()
    data class Error(val message: String): MainScreenState()

}