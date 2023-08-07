package com.example.jetpack_compose_lazycolumn.model

data class FormDataPesan(
    val id: Int,
    val fotoProfil: Int = 0,
    val user: String,
    val cuplikan: String,
    val pinned: Boolean,
    val bisukan: Boolean,
    val notif: Int
)

data class FormDataJob(
    val id: Int,
    val jenisJob: String,
    val topikBerita: String,
    val detailJob: String,
    val namaPekerja: String,
    val waktuJob: String
)

data class FormDataNotif(
    val id: Int,
    val notifDari: String,
    val aktivitas: String,
    val namaObyekString: String,
    val waktuNotifString: String,
    val fotoNotifImage: Int = 0
)

data class TemplateFieldWhatsappUserProfile(
    val id: Int,
    val fotoProfil: Int = 0,
    val nomorPengguna: String,
    val namaPengguna: String,
    val statusBisukan: Boolean,
)

data class TemplateFieldJenisAksi(
    val id: Int,
    val namaTugas: String,
    val produkTugas: String,
    val statusTugas: String,
    val PemegangHakCiptaProduk: String
)