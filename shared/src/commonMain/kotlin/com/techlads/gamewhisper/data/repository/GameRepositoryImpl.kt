package com.techlads.gamewhisper.data.repository

import com.techlads.gamewhisper.data.remote.GameDataSource
import com.techlads.gamewhisper.data.util.toGame
import com.techlads.gamewhisper.domain.model.Game
import com.techlads.gamewhisper.domain.repository.GameRepository

internal class GameRepositoryImpl(
    private val dataSource: GameDataSource
): GameRepository {
    override suspend fun getGames(): List<Game> {
        return dataSource.getGames().result.map {
            it.toGame()
        }
    }

    override suspend fun getGameById(id: Int): Game {
        return dataSource.getGameById(id = id).toGame()
    }
}