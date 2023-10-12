package com.techlads.gamewhisper

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform