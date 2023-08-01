package com.example.jetpack_compose_lazycolumn

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_lazycolumn.data.PusatDataTemplate
import com.example.jetpack_compose_lazycolumn.data.PusatDataWisata

@Composable
fun TampilanBerandaTemplate() {
    val itemWisata = remember { PusatDataTemplate.recordDataTemplate}
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items = itemWisata,
            itemContent = {
                ViewDataTemplate(kolomDataTemplate = it)
            }
        )
    }
}
