package com.javasatu.journalistappreciator.model

data class WAUserProfile(
    val id: Int,
    val fotoProfil: Int = 0,
    val nomorPengguna: String,
    val namaPengguna: String,
    val statusBisukan: Boolean,
)
