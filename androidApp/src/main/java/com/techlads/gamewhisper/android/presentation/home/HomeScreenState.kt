package com.techlads.gamewhisper.android.presentation.home

import com.techlads.gamewhisper.domain.model.Game

data class HomeScreenState(
    var loading: Boolean = false,
    var games: List<Game> = listOf(),
    var errorMessage: String? = null
)