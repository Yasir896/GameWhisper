package com.techlads.gamewhisper.domain.usecase

import com.techlads.gamewhisper.domain.model.Game
import com.techlads.gamewhisper.domain.repository.GameRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetGamesUseCase: KoinComponent {
    private val repository: GameRepository by inject()

    @Throws(Exception::class)
    suspend operator fun invoke(): List<Game> = repository.getGames()
}