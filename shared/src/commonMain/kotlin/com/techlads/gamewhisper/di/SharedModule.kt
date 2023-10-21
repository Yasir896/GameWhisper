package com.techlads.gamewhisper.di

import com.techlads.gamewhisper.data.remote.GameDataSource
import com.techlads.gamewhisper.data.remote.GameService
import com.techlads.gamewhisper.data.repository.GameRepositoryImpl
import com.techlads.gamewhisper.domain.repository.GameRepository
import com.techlads.gamewhisper.domain.usecase.GetGameByIdUseCase
import com.techlads.gamewhisper.domain.usecase.GetGamesUseCase
import com.techlads.gamewhisper.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { GameDataSource(get(), get()) }
    factory { GameService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<GameRepository> { GameRepositoryImpl(get()) }
    factory { GetGamesUseCase() }
    factory { GetGameByIdUseCase() }
}

private val sharedModule = listOf(dataModule, utilityModule, domainModule)

fun getSharedModule() = sharedModule