package com.techlads.gamewhisper.data.util

import com.techlads.gamewhisper.data.remote.GameResponse
import com.techlads.gamewhisper.domain.model.Game

internal fun GameResponse.toGame(): Game {
    return Game(
        id = id,
        title = title,
        description = shortDescription,
        genre = genre,
        platform = platform,
        publisher = publisher,
        releaseDate = releaseDate,
        shortDescription = shortDescription,
        thumbnail = thumbnail,

    )
}