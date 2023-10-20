package com.techlads.gamewhisper.data.remote

import kotlinx.serialization.Serializable

@Serializable
internal data class GamesResponse(
    val result: List<GameResponse>
)