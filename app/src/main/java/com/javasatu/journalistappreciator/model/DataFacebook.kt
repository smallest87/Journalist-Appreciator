package com.javasatu.journalistappreciator.model

data class DataFacebook(
    val id: Int,
    val namaProfilString: String,
    val ikonProfilImage: Int = 0,
    val waktuPostingan: String,
    val postinganString: String,
    val fotoProfilImage: Int = 0
)
