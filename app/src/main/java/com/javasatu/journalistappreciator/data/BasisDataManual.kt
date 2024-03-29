package com.javasatu.journalistappreciator.data

import com.javasatu.journalistappreciator.R
import com.javasatu.journalistappreciator.model.DataFacebook
import com.javasatu.journalistappreciator.model.JenisJob
import com.javasatu.journalistappreciator.model.JenisAksi
import com.javasatu.journalistappreciator.model.DataJob
import com.javasatu.journalistappreciator.model.DataPesan
import com.javasatu.journalistappreciator.model.DataNotif
import com.javasatu.journalistappreciator.model.WAUserProfile

object BasisDataManual {

    val dataWhatsappChat = listOf(
        DataPesan(id = 1,fotoProfilChatPesan = R.drawable.fotoprofilabdussalam,user = "Abdus Salam",cuplikan = "Hello",pinned = true,bisukan = false,notif = 1),
        DataPesan(id = 2,fotoProfilChatPesan = R.drawable.fotoprofilrahmawati,user = "Rahmawati",cuplikan = "Hai",pinned = false,bisukan = false,notif = 0),
        DataPesan(id = 3,fotoProfilChatPesan = R.drawable.fotoprofilgunawansasmita,user = "Gunawan Sasmita",cuplikan = "Apa kabarmu",pinned = false,bisukan = false,notif = 42),
        DataPesan(id = 4,fotoProfilChatPesan = R.drawable.fotoprofilbudiharianto,user = "Budi Harianto",cuplikan = "Dah tidur",pinned = false,bisukan = false,notif = 6),
        DataPesan(id = 5,fotoProfilChatPesan = R.drawable.fotoprofilsusilowatiwahid,user = "Susilowati Wahid",cuplikan = "Jon...",pinned = false,bisukan = false,notif = 3),
        DataPesan(id = 6,fotoProfilChatPesan = R.drawable.fotoprofilnurrachman,user = "Nurrachman",cuplikan = "Assalamualaikum",pinned = false,bisukan = false,notif = 3),
        DataPesan(id = 7,fotoProfilChatPesan = R.drawable.fotoprofiljadadalwi,user = "Jadad Alwi",cuplikan = "KOen nandi",pinned = false,bisukan = false,notif = 7),
        DataPesan(id = 8,fotoProfilChatPesan = R.drawable.fotoprofiltheresiaarnold,user = "Theresia Arnold",cuplikan = "Onok kobongan i lho",pinned = false,bisukan = false,notif = 23),
        DataPesan(id = 9,fotoProfilChatPesan = R.drawable.fotoprofilsyamsaputra,user = "Syam Saputra",cuplikan = "Posisi?",pinned = false,bisukan = false,notif = 87),
        DataPesan(id = 10,fotoProfilChatPesan = R.drawable.fotoprofilsasasandiaga,user = "Sasa Sandiaga",cuplikan = "Udah makan?",pinned = false,bisukan = false,notif = 2),
        DataPesan(id = 11,fotoProfilChatPesan = R.drawable.fotoprofilrunojanwari,user = "Runo Janwari",cuplikan = "Yuk melok",pinned = false,bisukan = false,notif = 11),
        DataPesan(id = 12,fotoProfilChatPesan = R.drawable.fotoprofiljokopistiawan,user = "Joko Pistiawan",cuplikan = "Temenan?",pinned = false,bisukan = false,notif = 354),
        DataPesan(id = 13,fotoProfilChatPesan = R.drawable.fotoprofilramonsierra,user = "Ramon Sierra",cuplikan = "Dah bikin PR",pinned = false,bisukan = false,notif = 8),
        DataPesan(id = 14,fotoProfilChatPesan = R.drawable.fotoprofilgugunbanjar,user = "Gugun Banjar",cuplikan = "Kuesel aku",pinned = false,bisukan = false,notif = 43),
        DataPesan(id = 15,fotoProfilChatPesan = R.drawable.fotoprofillukitowahyu,user = "Lukito Wahyu",cuplikan = "Remek...",pinned = false,bisukan = false,notif = 1)
    )

    val listWhatsappUserProfile = listOf(
        WAUserProfile(id = 1,fotoProfil = R.drawable.fotoprofilabdussalam, nomorPengguna = "+62 815-5589-9499", namaPengguna = "Abdus Salam",statusBisukan = false),
        WAUserProfile(id = 2,fotoProfil = R.drawable.fotoprofilrahmawati, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Rahmawati",statusBisukan = false),
        WAUserProfile(id = 3,fotoProfil = R.drawable.fotoprofilgunawansasmita, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Gunawan Sasmita",statusBisukan = false),
        WAUserProfile(id = 4,fotoProfil = R.drawable.fotoprofilbudiharianto, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Budi Harianto",statusBisukan = false),
        WAUserProfile(id = 5,fotoProfil = R.drawable.fotoprofilsusilowatiwahid, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Susilowati Wahid",statusBisukan = false),
        WAUserProfile(id = 6,fotoProfil = R.drawable.fotoprofilnurrachman, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Nurrachman",statusBisukan = false),
        WAUserProfile(id = 7,fotoProfil = R.drawable.fotoprofiljadadalwi, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Jadad Alwi",statusBisukan = false),
        WAUserProfile(id = 8,fotoProfil = R.drawable.fotoprofiltheresiaarnold, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Theresia Arnold",statusBisukan = false),
        WAUserProfile(id = 9,fotoProfil = R.drawable.fotoprofilsyamsaputra, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Syam Saputra",statusBisukan = false),
        WAUserProfile(id = 10,fotoProfil = R.drawable.fotoprofilsasasandiaga, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Sasa Sandiaga",statusBisukan = false),
        WAUserProfile(id = 11,fotoProfil = R.drawable.fotoprofilrunojanwari, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Runo Janwari",statusBisukan = false),
        WAUserProfile(id = 12,fotoProfil = R.drawable.fotoprofiljokopistiawan, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Joko Pistiawan",statusBisukan = false),
        WAUserProfile(id = 13,fotoProfil = R.drawable.fotoprofilramonsierra, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Ramon Sierra",statusBisukan = false),
        WAUserProfile(id = 14,fotoProfil = R.drawable.fotoprofilgugunbanjar, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Gugun Banjar",statusBisukan = false),
        WAUserProfile(id = 15,fotoProfil = R.drawable.fotoprofillukitowahyu, nomorPengguna = "+62 815-5589-9499",namaPengguna = "Lukito Wahyu",statusBisukan = false)
    )

    val dataJob = listOf(
        DataJob(id = 1, jenisJob = listOf("Audio","Foto","Video","Transkrip"),"Presiden Tinjau Pabrik Peluru PT Pindad","Liputan tentang kunjungan Presiden RI di PT Pindad Turen","Abdus Salam","06/08/2023"),
        DataJob(id = 2, jenisJob = listOf("Foto","Video","Transkrip"),"PD dan Perumda Ikuti Lomba Baris","Mewawancarai audio pada Liputan Presiden RI","Abdus Salam","06/08/2023"),
        DataJob(id = 3, jenisJob = listOf("Video","Transkrip"), "Maling Curi 2 Motor di Penginapan Sawojajar","Pengambilan foto saat kunjungan Presiden RI di PT Pindad Turen","Abdus Salam","06/08/2023"),
        DataJob(id = 4, jenisJob = listOf("Transkrip"),"Ketua Dewan Soroti Pembongkaran Pagar Balaikota","Pengambilan video saat kunjungan Presiden RI di PT Pindad Turen","Gunawan Sasimita","06/08/2023")
    )

    val listAksi = listOf(
        JenisAksi(id = 1,"Ambil foto ilustrasi","Foto","Cukup","Abdus Salam"),
        JenisAksi(id = 2,"Ambil video ilustrasi","Video","Proses", "Rahmawati"),
        JenisAksi(id = 3,"Wawancara narasumber","Audio","Proses","Rahmawati"),
        JenisAksi(id = 4,"Transkrip wawancara","Teks","Belum","Sulaiman"),
        JenisAksi(id = 5,"Tambah referensi","Link","Belum","Sulaiman")
    )

    val dataNotif = listOf(
        DataNotif(id = 1,notifDari = "Meidika Wardana",aktivitas = "memposting",namaObyekString = "tulisan",waktuNotifString = "1h",fotoNotifImage = R.drawable.p1),
        DataNotif(id = 2,notifDari = "Mario",aktivitas = "menyukai postingan",namaObyekString = "Wahidah",waktuNotifString = "2h",fotoNotifImage = R.drawable.p2),
        DataNotif(id = 3,notifDari = "Teguh",aktivitas = "memposting",namaObyekString = "postingan baru",waktuNotifString = "4h",fotoNotifImage = R.drawable.p3),
        DataNotif(id = 4,notifDari = "Mawardi",aktivitas = "memposting",namaObyekString = "postingan baru",waktuNotifString = "1h",fotoNotifImage = R.drawable.p4),
        DataNotif(id = 5,notifDari = "Tasya",aktivitas = "memposting",namaObyekString = "postingan baru",waktuNotifString = "1h",fotoNotifImage = R.drawable.p5),
        DataNotif(id = 6,notifDari = "Rois",aktivitas = "memposting",namaObyekString = "postingan baru",waktuNotifString = "1h",fotoNotifImage = R.drawable.p6),
        DataNotif(id = 7,notifDari = "Ghana",aktivitas = "memposting",namaObyekString = "postingan baru",waktuNotifString = "1h",fotoNotifImage = R.drawable.p7),
        DataNotif(id = 8,notifDari = "Judika",aktivitas = "memposting",namaObyekString = "postingan baru",waktuNotifString = "1h",fotoNotifImage = R.drawable.p8),
        DataNotif(id = 9,notifDari = "Meidika Wardana",aktivitas = "menulis",namaObyekString = "postingan baru",waktuNotifString = "1h",fotoNotifImage = R.drawable.p9),
        DataNotif(id = 10,notifDari = "Meidika Wardana",aktivitas = "menulis",namaObyekString = "postingan baru",waktuNotifString = "1h",fotoNotifImage = R.drawable.p10),
        DataNotif(id = 11,notifDari = "Meidika Wardana",aktivitas = "menulis",namaObyekString = "postingan baru",waktuNotifString = "1h",fotoNotifImage = R.drawable.p11),
        DataNotif(id = 12,notifDari = "Meidika Wardana",aktivitas = "menulis",namaObyekString = "postingan baru",waktuNotifString = "1h",fotoNotifImage = R.drawable.p12)
    )

    val listFacebook = listOf(
        DataFacebook(id = 1,namaProfilString = "Meidika Wardana",postinganString = "Keseruan bersama kawan-kawan seperjuangan dan sepengabdian.",waktuPostingan = "1h.",fotoProfilImage = R.drawable.p1),
        DataFacebook(id = 2,namaProfilString = "Jevry Jeje",postinganString = "Ketemu ular king cobra sebesar ini bikin kaki gemetar.",waktuPostingan = "3h",fotoProfilImage = R.drawable.p2),
        DataFacebook(id = 3,namaProfilString = "Arief Masbuchin",postinganString = "Ayo sekarang ke Labuan Bajo bareng AirAsia!",waktuPostingan = "4h",fotoProfilImage = R.drawable.p3),
        DataFacebook(id = 4,namaProfilString = "Poy Hp",postinganString = "Ben tahes lur di Malang Posco Media.",waktuPostingan = "8h",fotoProfilImage = R.drawable.p4),
        DataFacebook(id = 5,namaProfilString = "Erickhoes Ahmad Almaveoso",postinganString = "Cakra Khan menjadi salah satu peserta.",waktuPostingan = "11h",fotoProfilImage = R.drawable.p5),
        DataFacebook(id = 6,namaProfilString = "Laksamana Caping",postinganString = "Opo yo podo langka e lur...Sebutno deso mu lur seng langka.",waktuPostingan = "14h",fotoProfilImage = R.drawable.p6),
        DataFacebook(id = 7,namaProfilString = "Antok Trihartono",postinganString = "Kota Malang",waktuPostingan = "13h",fotoProfilImage = R.drawable.p7),
        DataFacebook(id = 8,namaProfilString = "Lukito Purnomo",postinganString = "Kota Malang",waktuPostingan = "14h",fotoProfilImage = R.drawable.p8),
        DataFacebook(id = 9,namaProfilString = "Agung H Buana",postinganString = "Kota Malang",waktuPostingan = "16h",fotoProfilImage = R.drawable.p9),
        DataFacebook(id = 10,namaProfilString = "Budi Fathony",postinganString = "Kota Malang",waktuPostingan = "21h",fotoProfilImage = R.drawable.p10),
        DataFacebook(id = 11,namaProfilString = "Zahir R Metallic",postinganString = "Kota Malang",waktuPostingan = "22h",fotoProfilImage = R.drawable.p11),
        DataFacebook(id = 12,namaProfilString = "Suryadi",postinganString = "Kota Malang",waktuPostingan = "23h",fotoProfilImage = R.drawable.p12)
    )

    val dataFacebook = listOf(
        DataFacebook(id = 1,namaProfilString = "Meidika Wardana",postinganString = "Keseruan bersama kawan-kawan seperjuangan dan sepengabdian.",waktuPostingan = "1h.",fotoProfilImage = R.drawable.p1),
        DataFacebook(id = 2,namaProfilString = "Jevry Jeje",postinganString = "Ketemu ular king cobra sebesar ini bikin kaki gemetar.",waktuPostingan = "3h",fotoProfilImage = R.drawable.p2),
        DataFacebook(id = 3,namaProfilString = "Arief Masbuchin",postinganString = "Ayo sekarang ke Labuan Bajo bareng AirAsia!",waktuPostingan = "4h",fotoProfilImage = R.drawable.p3),
        DataFacebook(id = 4,namaProfilString = "Poy Hp",postinganString = "Ben tahes lur di Malang Posco Media.",waktuPostingan = "8h",fotoProfilImage = R.drawable.p4),
        DataFacebook(id = 5,namaProfilString = "Erickhoes Ahmad Almaveoso",postinganString = "Cakra Khan menjadi salah satu peserta.",waktuPostingan = "11h",fotoProfilImage = R.drawable.p5),
        DataFacebook(id = 6,namaProfilString = "Laksamana Caping",postinganString = "Opo yo podo langka e lur...Sebutno deso mu lur seng langka.",waktuPostingan = "14h",fotoProfilImage = R.drawable.p6),
        DataFacebook(id = 7,namaProfilString = "Antok Trihartono",postinganString = "Kota Malang",waktuPostingan = "13h",fotoProfilImage = R.drawable.p7),
        DataFacebook(id = 8,namaProfilString = "Lukito Purnomo",postinganString = "Kota Malang",waktuPostingan = "14h",fotoProfilImage = R.drawable.p8),
        DataFacebook(id = 9,namaProfilString = "Agung H Buana",postinganString = "Kota Malang",waktuPostingan = "16h",fotoProfilImage = R.drawable.p9),
        DataFacebook(id = 10,namaProfilString = "Budi Fathony",postinganString = "Kota Malang",waktuPostingan = "21h",fotoProfilImage = R.drawable.p10),
        DataFacebook(id = 11,namaProfilString = "Zahir R Metallic",postinganString = "Kota Malang",waktuPostingan = "22h",fotoProfilImage = R.drawable.p11),
        DataFacebook(id = 12,namaProfilString = "Suryadi",postinganString = "Kota Malang",waktuPostingan = "23h",fotoProfilImage = R.drawable.p12)
    )

    val dataTes = listOf(
        JenisJob(id = 1,daftarJob = "Wawancara, Audio, Video, Transkrip"),
        JenisJob(id = 1,daftarJob = "Wawancara, Audio, Video, Transkrip"),
        JenisJob(id = 1,daftarJob = "Wawancara, Audio, Video, Transkrip"),
        JenisJob(id = 1,daftarJob = "Wawancara, Audio, Video, Transkrip"),
    )

}
