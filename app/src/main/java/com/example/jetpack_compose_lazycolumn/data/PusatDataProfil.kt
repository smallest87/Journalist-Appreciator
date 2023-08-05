package com.example.jetpack_compose_lazycolumn.data

import com.example.jetpack_compose_lazycolumn.R
import com.example.jetpack_compose_lazycolumn.model.KolomProfil

object PusatDataProfil {
    val profil =
        KolomProfil(
            id = 1,
            namaProfil = "Abdus Salam",
            bioData = "Hello",
            fotoProfil = R.drawable.fotoprofilabdussalam
        )

    val kumpulanDataProfil = listOf(
        profil,
        KolomProfil(
            id = 2,
            namaProfil = "Rahmawati",
            bioData = "Hai",
            fotoProfil = R.drawable.fotoprofilrahmawati
        ),
        KolomProfil(
            id = 3,
            namaProfil = "Gunawan Sasmita",
            bioData = "Apa kabarmu?",
            fotoProfil = R.drawable.fotoprofilgunawansasmita
        ),
        KolomProfil(
            id = 4,
            namaProfil = "Budi Harianto",
            bioData = "Dah tidur",
            fotoProfil = R.drawable.fotoprofilbudiharianto
        ),
        KolomProfil(
            id = 5,
            namaProfil = "Susilowati Wahid",
            bioData = "Jon...",
            fotoProfil = R.drawable.fotoprofilsusilowatiwahid
        )
    )
}