package com.techlads.gamewhisper.data.remote

import com.techlads.gamewhisper.util.Dispatcher
import kotlinx.coroutines.withContext

internal class GameDataSource(
    private val apiService: GameService,
    private val dispatchers: Dispatcher
) {
    suspend fun getGames() = withContext(dispatchers.io) {
        apiService.getGames()
    }

    suspend fun getGameById(id: Int) = withContext(dispatchers.io) {
        apiService.getGameById(id = id)
    }
}