package com.javasatu.journalistappreciator.view

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun HeaderAplikasi(){

    androidx.compose.material3.TopAppBar(
        title = {
            Text(
                text = "Journalist Appreciator™"
            ) },
        navigationIcon = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Navigation icon"
                )
            }
        }
    )

}