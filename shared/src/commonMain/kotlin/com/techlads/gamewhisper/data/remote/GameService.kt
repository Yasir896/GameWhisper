package com.techlads.gamewhisper.data.remote

import io.ktor.client.call.body
import io.ktor.client.request.get

internal class GameService: KtorApi() {

    suspend fun getGames(): GamesResponse = client.get {
        pathUrl("games")
    }.body()

    suspend fun getGameById(id: Int): GameResponse = client.get {
        pathUrl("game?id=$id")
    }.body()
}