package com.techlads.gamewhisper.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.techlads.gamewhisper.android.presentation.GameWhisperApp
import com.techlads.gamewhisper.android.presentation.home.HomeScreen
import com.techlads.gamewhisper.android.presentation.home.HomeViewModel
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GameWhisperApp()
        }
    }
}

