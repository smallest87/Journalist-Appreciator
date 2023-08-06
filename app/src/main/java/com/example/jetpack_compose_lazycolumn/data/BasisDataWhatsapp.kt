package com.example.jetpack_compose_lazycolumn.data

import com.example.jetpack_compose_lazycolumn.R
import com.example.jetpack_compose_lazycolumn.model.TemplateFieldJenisAksi
import com.example.jetpack_compose_lazycolumn.model.TemplateFieldJob
import com.example.jetpack_compose_lazycolumn.model.TemplateFieldWhatsappChat
import com.example.jetpack_compose_lazycolumn.model.TemplateFieldWhatsappUserProfile

object BasisDataWhatsapp {

    val listWhatsappChat = listOf(
        TemplateFieldWhatsappChat(id = 1,fotoProfil = R.drawable.fotoprofilabdussalam,namaPengguna = "Abdus Salam",cuplikanChat = "Hello",pinned = true,bisukan = false,jumlahNotif = 1),
        TemplateFieldWhatsappChat(id = 2,fotoProfil = R.drawable.fotoprofilrahmawati,namaPengguna = "Rahmawati",cuplikanChat = "Hai",pinned = false,bisukan = false,jumlahNotif = 0),
        TemplateFieldWhatsappChat(id = 3,fotoProfil = R.drawable.fotoprofilgunawansasmita,namaPengguna = "Gunawan Sasmita",cuplikanChat = "Apa kabarmu",pinned = false,bisukan = false,jumlahNotif = 42),
        TemplateFieldWhatsappChat(id = 4,fotoProfil = R.drawable.fotoprofilbudiharianto,namaPengguna = "Budi Harianto",cuplikanChat = "Dah tidur",pinned = false,bisukan = false,jumlahNotif = 6),
        TemplateFieldWhatsappChat(id = 5,fotoProfil = R.drawable.fotoprofilsusilowatiwahid,namaPengguna = "Susilowati Wahid",cuplikanChat = "Jon...",pinned = false,bisukan = false,jumlahNotif = 3),
        TemplateFieldWhatsappChat(id = 6,fotoProfil = R.drawable.fotoprofilnurrachman,namaPengguna = "Nurrachman",cuplikanChat = "Assalamualaikum",pinned = false,bisukan = false,jumlahNotif = 3),
        TemplateFieldWhatsappChat(id = 7,fotoProfil = R.drawable.fotoprofiljadadalwi,namaPengguna = "Jadad Alwi",cuplikanChat = "KOen nandi",pinned = false,bisukan = false,jumlahNotif = 7),
        TemplateFieldWhatsappChat(id = 8,fotoProfil = R.drawable.fotoprofiltheresiaarnold,namaPengguna = "Theresia Arnold",cuplikanChat = "Onok kobongan i lho",pinned = false,bisukan = false,jumlahNotif = 23),
        TemplateFieldWhatsappChat(id = 9,fotoProfil = R.drawable.fotoprofilsyamsaputra,namaPengguna = "Syam Saputra",cuplikanChat = "Posisi?",pinned = false,bisukan = false,jumlahNotif = 87),
        TemplateFieldWhatsappChat(id = 10,fotoProfil = R.drawable.fotoprofilsasasandiaga,namaPengguna = "Sasa Sandiaga",cuplikanChat = "Udah makan?",pinned = false,bisukan = false,jumlahNotif = 2),
        TemplateFieldWhatsappChat(id = 11,fotoProfil = R.drawable.fotoprofilrunojanwari,namaPengguna = "Runo Janwari",cuplikanChat = "Yuk melok",pinned = false,bisukan = false,jumlahNotif = 11),
        TemplateFieldWhatsappChat(id = 12,fotoProfil = R.drawable.fotoprofiljokopistiawan,namaPengguna = "Joko Pistiawan",cuplikanChat = "Temenan?",pinned = false,bisukan = false,jumlahNotif = 354),
        TemplateFieldWhatsappChat(id = 13,fotoProfil = R.drawable.fotoprofilramonsierra,namaPengguna = "Ramon Sierra",cuplikanChat = "Dah bikin PR",pinned = false,bisukan = false,jumlahNotif = 8),
        TemplateFieldWhatsappChat(id = 14,fotoProfil = R.drawable.fotoprofilgugunbanjar,namaPengguna = "Gugun Banjar",cuplikanChat = "Kuesel aku",pinned = false,bisukan = false,jumlahNotif = 43),
        TemplateFieldWhatsappChat(id = 15,fotoProfil = R.drawable.fotoprofillukitowahyu,namaPengguna = "Lukito Wahyu",cuplikanChat = "Remek...",pinned = false,bisukan = false,jumlahNotif = 1)
    )

    val listWhatsappUserProfile = listOf(
        TemplateFieldWhatsappUserProfile(id = 1,fotoProfil = R.drawable.fotoprofilabdussalam, nomorPengguna = "+62 815-5589-9499", namaPengguna = "Abdus Salam",statusBisukan = false),
        TemplateFieldWhatsappUserProfile(id = 2,fotoProfil = R.drawable.fotoprofilrahmawati, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Rahmawati",statusBisukan = false),
        TemplateFieldWhatsappUserProfile(id = 3,fotoProfil = R.drawable.fotoprofilgunawansasmita, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Gunawan Sasmita",statusBisukan = false),
        TemplateFieldWhatsappUserProfile(id = 4,fotoProfil = R.drawable.fotoprofilbudiharianto, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Budi Harianto",statusBisukan = false),
        TemplateFieldWhatsappUserProfile(id = 5,fotoProfil = R.drawable.fotoprofilsusilowatiwahid, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Susilowati Wahid",statusBisukan = false),
        TemplateFieldWhatsappUserProfile(id = 6,fotoProfil = R.drawable.fotoprofilnurrachman, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Nurrachman",statusBisukan = false),
        TemplateFieldWhatsappUserProfile(id = 7,fotoProfil = R.drawable.fotoprofiljadadalwi, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Jadad Alwi",statusBisukan = false),
        TemplateFieldWhatsappUserProfile(id = 8,fotoProfil = R.drawable.fotoprofiltheresiaarnold, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Theresia Arnold",statusBisukan = false),
        TemplateFieldWhatsappUserProfile(id = 9,fotoProfil = R.drawable.fotoprofilsyamsaputra, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Syam Saputra",statusBisukan = false),
        TemplateFieldWhatsappUserProfile(id = 10,fotoProfil = R.drawable.fotoprofilsasasandiaga, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Sasa Sandiaga",statusBisukan = false),
        TemplateFieldWhatsappUserProfile(id = 11,fotoProfil = R.drawable.fotoprofilrunojanwari, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Runo Janwari",statusBisukan = false),
        TemplateFieldWhatsappUserProfile(id = 12,fotoProfil = R.drawable.fotoprofiljokopistiawan, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Joko Pistiawan",statusBisukan = false),
        TemplateFieldWhatsappUserProfile(id = 13,fotoProfil = R.drawable.fotoprofilramonsierra, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Ramon Sierra",statusBisukan = false),
        TemplateFieldWhatsappUserProfile(id = 14,fotoProfil = R.drawable.fotoprofilgugunbanjar, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Gugun Banjar",statusBisukan = false),
        TemplateFieldWhatsappUserProfile(id = 15,fotoProfil = R.drawable.fotoprofillukitowahyu, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Lukito Wahyu",statusBisukan = false)
    )

    val listJob = listOf(
        TemplateFieldJob(id = 1,"Liputan Data Presiden RI","Liputan tentang kunjungan Presiden RI di PT Pindad Turen","Abdus Salam","06/08/2023"),
        TemplateFieldJob(id = 2,"Wawancara Joko Widodo","Mewawancarai audio pada Liputan Presiden RI","Abdus Salam","06/08/2023"),
        TemplateFieldJob(id = 3,"Liputan Foto Presiden RI","Pengambilan foto saat kunjungan Presiden RI di PT Pindad Turen","Abdus Salam","06/08/2023"),
        TemplateFieldJob(id = 4,"Liputan Video Presiden RI","Pengambilan video saat kunjungan Presiden RI di PT Pindad Turen","Gunawan Sasimita","06/08/2023"),
        TemplateFieldJob(id = 5,"Transkrip Audio Wawancara Joko Widodo","Transkrip audio wawancara","Rahmawati","06/08/2023")
    )

    val listAksi = listOf(
        TemplateFieldJenisAksi(id = 1,"Ambil foto ilustrasi","Foto","Cukup","Abdus Salam"),
        TemplateFieldJenisAksi(id = 2,"Ambil video ilustrasi","Video","Proses", "Rahmawati"),
        TemplateFieldJenisAksi(id = 3,"Wawancara narasumber","Audio","Proses","Rahmawati"),
        TemplateFieldJenisAksi(id = 4,"Transkrip wawancara","Teks","Belum","Sulaiman"),
        TemplateFieldJenisAksi(id = 5,"Tambah referensi","Link","Belum","Sulaiman")
    )
}
