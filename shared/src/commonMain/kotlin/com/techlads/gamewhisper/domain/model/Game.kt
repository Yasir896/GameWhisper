package com.techlads.gamewhisper.domain.model

import kotlinx.serialization.SerialName

data class Game(
    val id: Int,
    val title: String,
    val description: String,
    //val status: String,
    val genre: String,
    val platform: String,
    val publisher: String,
    val releaseDate: String,
    val shortDescription: String,
    val thumbnail: String,
)