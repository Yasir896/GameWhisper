package com.techlads.gamewhisper.android.presentation.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.techlads.gamewhisper.domain.usecase.GetGamesUseCase
import kotlinx.coroutines.launch

class HomeViewModel(
    val getGamesUseCase: GetGamesUseCase
) : ViewModel() {
    var uiState by mutableStateOf(HomeScreenState())


    init {
        fetchGames()
    }

    private fun fetchGames() {
        viewModelScope.launch {
            uiState = uiState.copy(
                loading = true
            )

            try {
                val result = getGamesUseCase()
                if (result.isNotEmpty()) {
                    uiState = uiState.copy(
                        loading = false,
                        games = result
                    )
                }
            } catch (error: Throwable) {
                uiState = uiState.copy(
                    loading = false,
                    errorMessage = "$error"
                )
            }
        }
    }

}