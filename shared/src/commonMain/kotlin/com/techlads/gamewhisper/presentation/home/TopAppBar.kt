package com.techlads.gamewhisper.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TopAppBar(

) {
    Column {
        Text(
            modifier = Modifier,
            text = "GameWhisper",
        )

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth()
                .padding(8.dp),
            value = "",
            onValueChange = { },

        )
    }
}