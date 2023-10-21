package com.techlads.gamewhisper.android

import android.app.Application
import com.techlads.gamewhisper.android.di.appModule
import com.techlads.gamewhisper.di.getSharedModule
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModule())
        }
    }
}