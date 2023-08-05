package com.example.jetpack_compose_lazycolumn.data

import com.example.jetpack_compose_lazycolumn.R
import com.example.jetpack_compose_lazycolumn.model.KolomProfil

object PusatDataProfil {
    val profil =
        KolomProfil(
            id = 1,
            namaProfil = "Wibowo Susilo",
            bioData = "Kota Malang",
            fotoProfil = R.drawable.fotoprofil02
        )

    val kumpulanDataProfil = listOf(
        profil,
        KolomProfil(
            id = 2,
            namaProfil = "Ruma Kertas",
            bioData = "Kota Malang",
            fotoProfil = R.drawable.fotoprofil01
        ),
        KolomProfil(
            id = 3,
            namaProfil = "Debby Setiawan",
            bioData = "Kota Malang",
            fotoProfil = R.drawable.fotoprofil03
        ),
        KolomProfil(
            id = 4,
            namaProfil = "Jopuju Prod",
            bioData = "Kota Malang",
            fotoProfil = R.drawable.fotoprofil04
        ),
        KolomProfil(
            id = 5,
            namaProfil = "Ipung Sweetenan",
            bioData = "Kota Malang",
            fotoProfil = R.drawable.fotoprofil05
        )
    )
}