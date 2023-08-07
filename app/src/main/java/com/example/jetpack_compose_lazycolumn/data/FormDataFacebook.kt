package com.example.jetpack_compose_lazycolumn.data

data class FormDataFacebook(
    val id: Int,
    val namaProfilString: String,
    val ikonProfilImage: Int = 0,
//   val emosiProfilString: String,
    val waktuPostingan: String,
    val postinganString: String,
    val fotoProfilImage: Int = 0
)
