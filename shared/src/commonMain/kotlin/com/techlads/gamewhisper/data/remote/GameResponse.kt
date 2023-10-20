package com.techlads.gamewhisper.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class GameResponse(
    val description: String,
    val genre: String,
    val id: Int,
    val platform: String,
    val publisher: String,
    @SerialName("release_date")
    val releaseDate: String,
    val shortDescription: String,
    val status: String,
    val thumbnail: String,
    val title: String,
)