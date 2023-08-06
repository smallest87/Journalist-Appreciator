package com.example.jetpack_compose_lazycolumn.model

data class KolomNotifFB(
    val id: Int,
    val notifDari: String,
    val aktivitas: String,
    val namaObyekString: String,
    val waktuNotifString: String,
    val fotoNotifImage: Int = 0
)

data class TemplateFieldWhatsappChat(
    val id: Int,
    val fotoProfil: Int = 0,
    val namaPengguna: String,
    val cuplikanChat: String,
    val pinned: Boolean,
    val bisukan: Boolean,
    val jumlahNotif: Int
)

data class TemplateFieldWhatsappUserProfile(
    val id: Int,
    val fotoProfil: Int = 0,
    val nomorPengguna: String,
    val namaPengguna: String,
    val statusBisukan: Boolean,
)

data class TemplateFieldProjectList(
    val id: Int,
    val namaProyek: String,
    val ringkasanProyek: String,
    val namaPekerja: String,
    val tanggalAmbilJob: String
)

data class TemplateFieldJenisAksi(
    val id: Int,
    val namaTugas: String,
    val produkTugas: String,
    val statusTugas: String,
    val PemegangHakCiptaProduk: String
)