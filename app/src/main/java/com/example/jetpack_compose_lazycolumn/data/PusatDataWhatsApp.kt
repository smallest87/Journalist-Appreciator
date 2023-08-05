package com.example.jetpack_compose_lazycolumn.data

import com.example.jetpack_compose_lazycolumn.R
import com.example.jetpack_compose_lazycolumn.model.KolomNotifFB
import com.example.jetpack_compose_lazycolumn.model.ModelWhatsapp

object PusatDataWhatsApp {
    val nilaiAwal =
        ModelWhatsapp(
            id = 1,
            namaPengguna = "Abdus Salam",
            cuplikanChat = "Hello",
            pinned = true,
            jumlahNotif = 1,
            fotoProfil = R.drawable.fotoprofilabdussalam
        )

    val listChatWhatsapp = listOf(
        nilaiAwal,
        ModelWhatsapp(
            id = 2,
            namaPengguna = "Rahmawati",
            cuplikanChat = "Hai",
            pinned = false,
            jumlahNotif = 0,
            fotoProfil = R.drawable.fotoprofilrahmawati
        ),
        ModelWhatsapp(
            id = 3,
            namaPengguna = "Gunawan Sasmita",
            cuplikanChat = "Apa kabarmu",
            pinned = false,
            jumlahNotif = 42,
            fotoProfil = R.drawable.fotoprofilgunawansasmita
        ),
        ModelWhatsapp(
            id = 4,
            namaPengguna = "Budi Harianto",
            cuplikanChat = "Dah tidur",
            pinned = false,
            jumlahNotif = 6,
            fotoProfil = R.drawable.fotoprofilbudiharianto
        ),
        ModelWhatsapp(
            id = 5,
            namaPengguna = "Susilowati Wahid",
            cuplikanChat = "Jon...",
            pinned = false,
            jumlahNotif = 3,
            fotoProfil = R.drawable.fotoprofilsusilowatiwahid
        ),
        ModelWhatsapp(
            id = 6,
            namaPengguna = "Nurrachman",
            cuplikanChat = "Assalamualaikum",
            pinned = false,
            jumlahNotif = 3,
            fotoProfil = R.drawable.fotoprofilnurrachman
        ),
        ModelWhatsapp(
            id = 7,
            namaPengguna = "Jadad Alwi",
            cuplikanChat = "KOen nandi",
            pinned = false,
            jumlahNotif = 7,
            fotoProfil = R.drawable.fotoprofiljadadalwi
        ),
        ModelWhatsapp(
            id = 8,
            namaPengguna = "Theresia Arnold",
            cuplikanChat = "Onok kobongan i lho",
            pinned = false,
            jumlahNotif = 23,
            fotoProfil = R.drawable.fotoprofiltheresiaarnold
        ),
        ModelWhatsapp(
            id = 9,
            namaPengguna = "Syam Saputra",
            cuplikanChat = "Posisi?",
            pinned = false,
            jumlahNotif = 87,
            fotoProfil = R.drawable.fotoprofilsyamsaputra
        ),
        ModelWhatsapp(
            id = 10,
            namaPengguna = "Sasa Sandiaga",
            cuplikanChat = "Udah makan?",
            pinned = false,
            jumlahNotif = 2,
            fotoProfil = R.drawable.fotoprofilsasasandiaga
        ),
        ModelWhatsapp(
            id = 11,
            namaPengguna = "Runo Janwari",
            cuplikanChat = "Yuk melok",
            pinned = false,
            jumlahNotif = 11,
            fotoProfil = R.drawable.fotoprofilrunojanwari
        ),
        ModelWhatsapp(
            id = 12,
            namaPengguna = "Joko Pistiawan",
            cuplikanChat = "Temenan?",
            pinned = false,
            jumlahNotif = 354,
            fotoProfil = R.drawable.fotoprofiljokopistiawan
        ),
        ModelWhatsapp(
            id = 13,
            namaPengguna = "Ramon Sierra",
            cuplikanChat = "Dah bikin PR",
            pinned = false,
            jumlahNotif = 8,
            fotoProfil = R.drawable.fotoprofilramonsierra
        ),
        ModelWhatsapp(
            id = 14,
            namaPengguna = "Gugun Banjar",
            cuplikanChat = "Kuesel aku",
            pinned = false,
            jumlahNotif = 43,
            fotoProfil = R.drawable.fotoprofilgugunbanjar
        ),
        ModelWhatsapp(
            id = 15,
            namaPengguna = "Lukito Wahyu",
            cuplikanChat = "Remek...",
            pinned = false,
            jumlahNotif = 1,
            fotoProfil = R.drawable.fotoprofillukitowahyu
        )
    )
}