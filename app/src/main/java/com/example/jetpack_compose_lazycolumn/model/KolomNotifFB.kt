package com.example.jetpack_compose_lazycolumn.model

data class KolomNotifFB(
    val id: Int,
    val notifDari: String,
    val aktivitas: String,
    val namaObyekString: String,
    val waktuNotifString: String,
    val fotoNotifImage: Int = 0
)
