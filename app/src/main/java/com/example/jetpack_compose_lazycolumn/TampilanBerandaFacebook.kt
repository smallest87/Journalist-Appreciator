package com.example.jetpack_compose_lazycolumn

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_lazycolumn.data.PusatDataFacebook
import com.example.jetpack_compose_lazycolumn.data.PusatDataTemplate
import com.example.jetpack_compose_lazycolumn.data.PusatDataWisata

@Composable
fun TampilanBerandaFacebook() {
    val itemWisata = remember { PusatDataFacebook.recordDataFacebook}
    LazyColumn(
        modifier = Modifier
            .background(Color.LightGray)
    ){
        items(
            items = itemWisata,
            itemContent = {
                ViewDataFacebook(kolomDataFacebook = it)
            }
        )
    }
}

