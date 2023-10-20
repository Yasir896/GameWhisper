package com.techlads.gamewhisper.domain.repository

import com.techlads.gamewhisper.domain.model.Game

interface GameRepository {
    suspend fun getGames(): List<Game>
    suspend fun getGameById(id: Int): Game
}