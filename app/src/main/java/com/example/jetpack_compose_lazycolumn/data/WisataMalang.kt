package com.example.jetpack_compose_lazycolumn.data

data class WisataMalang(
    val id: Int,
    val judul: String,
    val lokasi: String,
    val deskripsi: String,
    val wisataImageId: Int = 0
)
