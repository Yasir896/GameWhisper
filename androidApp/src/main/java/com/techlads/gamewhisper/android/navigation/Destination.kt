package com.techlads.gamewhisper.android.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument

interface Destination {
    val title: String
    val route: String
    val routeWithArgs: String
}

object Home: Destination {
    override val title: String
        get() = "Games Whisper"
    override val route: String
        get() = "home"
    override val routeWithArgs: String
        get() = route

}

object Detail: Destination {
    override val title: String
        get() = "Details"

    override val route: String
        get() = "detail"

    override val routeWithArgs: String
        get() = "$route/{gameId}"

    val arguments = listOf(
        navArgument(name = "gameId"){type = NavType.IntType}
    )
}

val movieDestinations = listOf(Home, Detail)