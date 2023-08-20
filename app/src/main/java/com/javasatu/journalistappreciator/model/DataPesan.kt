package com.javasatu.journalistappreciator.model

data class DataPesan(
    val id: Int,
    val fotoProfilChatPesan: Int = 0,
    val user: String,
    val cuplikan: String,
    val pinned: Boolean,
    val bisukan: Boolean,
    val notif: Int
)

