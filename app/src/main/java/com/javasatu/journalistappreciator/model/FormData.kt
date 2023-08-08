package com.javasatu.journalistappreciator.model

data class FormDataPesan(
    val id: Int,
    val fotoProfilChatPesan: Int = 0,
    val user: String,
    val cuplikan: String,
    val pinned: Boolean,
    val bisukan: Boolean,
    val notif: Int
)

data class FormDataJob(
    val id: Int,
    val jenisJob:List<String>,
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

data class FormDataFacebook(
    val id: Int,
    val namaProfilString: String,
    val ikonProfilImage: Int = 0,
    val waktuPostingan: String,
    val postinganString: String,
    val fotoProfilImage: Int = 0
)

data class KolomDataWisata(
    val id: Int,
    val judul: String,
    val lokasi: String,
    val deskripsi: String,
    val wisataImageId: Int = 0
)

data class FormDataJenisJob(
    val id: Int,
    val daftarJob: String
)