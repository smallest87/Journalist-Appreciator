package com.example.jetpack_compose_lazycolumn.data

import com.example.jetpack_compose_lazycolumn.R

object WisataDataProvider {
    val wisata =
        WisataMalang(
            id = 1,
            judul = "Alun-alun Kota Malang",
            lokasi = "Kota Malang",
            deskripsi = "Tempat yang nyaman untuk jalan-jalan.",
            wisataImageId = R.drawable.p1
        )

    val wisataList = listOf(
        wisata,
        WisataMalang(
            id = 2,
            judul = "Kayutangan Heritage",
            lokasi = "Kota Malang",
            deskripsi = "Tempat yang nyaman untuk jalan-jalan.",
            wisataImageId = R.drawable.p2
        ),
        WisataMalang(
            id = 3,
            judul = "Taman Kunang-kunang",
            lokasi = "Kota Malang",
            deskripsi = "Tempat yang nyaman untuk jalan-jalan.",
            wisataImageId = R.drawable.p3
        ),
        WisataMalang(
            id = 4,
            judul = "Taman Slamet",
            lokasi = "Kota Malang",
            deskripsi = "Tempat yang nyaman untuk jalan-jalan.",
            wisataImageId = R.drawable.p4
        ),
        WisataMalang(
            id = 5,
            judul = "Kampung Warna Warni",
            lokasi = "Kota Malang",
            deskripsi = "Tempat yang nyaman untuk jalan-jalan.",
            wisataImageId = R.drawable.p5
        ),
        WisataMalang(
            id = 6,
            judul = "Kampung Biru",
            lokasi = "Kota Malang",
            deskripsi = "Tempat yang nyaman untuk jalan-jalan.",
            wisataImageId = R.drawable.p6
        ),
        WisataMalang(
            id = 7,
            judul = "Kampung Arema",
            lokasi = "Kota Malang",
            deskripsi = "Tempat yang nyaman untuk jalan-jalan.",
            wisataImageId = R.drawable.p7
        ),
        WisataMalang(
            id = 8,
            judul = "Taman Singha",
            lokasi = "Kota Malang",
            deskripsi = "Tempat yang nyaman untuk jalan-jalan..",
            wisataImageId = R.drawable.p8
        ),
        WisataMalang(
            id = 9,
            judul = "Kampung Heritage",
            lokasi = "Kota Malang",
            deskripsi = "Tempat yang nyaman untuk jalan-jalan.",
            wisataImageId = R.drawable.p9
        ),
        WisataMalang(
            id = 10,
            judul = "Kampung Bambu Mewek",
            lokasi = "Kota Malang",
            deskripsi = "Tempat yang nyaman untuk jalan-jalan.",
            wisataImageId = R.drawable.p10
        ),
        WisataMalang(
            id = 11,
            judul = "Jalan Idjen Boulevard",
            lokasi = "Kota Malang",
            deskripsi = "Tempat yang nyaman untuk jalan-jalan.",
            wisataImageId = R.drawable.p11
        ),
        WisataMalang(
            id = 12,
            judul = "Stella",
            lokasi = "Kota Malang",
            deskripsi = "Tempat yang nyaman untuk jalan-jalan.",
            wisataImageId = R.drawable.p12
        )
    )
}