package com.example.jetpack_compose_lazycolumn

import KumpulanViewProfil
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Divider
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_lazycolumn.data.PusatDataFacebook
import com.example.jetpack_compose_lazycolumn.data.PusatDataNotifFB
import com.example.jetpack_compose_lazycolumn.data.BasisDataWhatsapp
import com.example.jetpack_compose_lazycolumn.view.ViewDataNotif
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun TabDanHalaman(){
    Column(){

        // Baris Branding
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(android.graphics.Color.parseColor("#480003")))
        ){
            Branding("AJD - Alat Jurnalis Digital™",16)
        }
        MenuTabAtas()
    }
}

@Composable
fun MenuTabAtas() {
    var tabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("Beranda", "Pesan", "Market","Notif")

    Column(
        modifier = Modifier
            .fillMaxWidth()) {
        TabRow(selectedTabIndex = tabIndex) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    text = { Text(title) },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index },
                    icon = {
                        when (index) {
                            0 -> Image(
                                painter = painterResource(id = R.drawable.house),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(24.dp)
                            )
                            1 -> Image(
                                painter = painterResource(id = R.drawable.messenger),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(24.dp)
                            )
                            2 -> Image(
                                painter = painterResource(id = R.drawable.market),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(24.dp)
                            )
                            3 -> Image(
                                painter = painterResource(id = R.drawable.notif),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(24.dp)
                            )
                        }
                    }
                )
            }
        }
        when (tabIndex) {
            0 -> HalamanBeranda()
            1 -> HalamanWhatsapp()
            2 -> HalamanPesan()
            3 -> HalamanNotifikasi()
        }
    }
}

@Composable
fun HalamanWhatsapp() {

    // Kolom Kanvas
    Column(){

        BarisArsip()

        // Kanvas ListView

        Column(
            modifier = Modifier
                .background(Color(android.graphics.Color.parseColor("#1c0001")))
        ){

            val itemProfil = remember { BasisDataWhatsapp.listWhatsappChat}

            Column(){

//        HeaderPage()

                LazyColumn(){
                    items(
                        items = itemProfil,
                        itemContent = {
                            KumpulanViewProfil(templateFieldWhatsappChat = it)
                        }
                    )
                }
            }



        }



    }
}

@Composable
fun BarisArsip() {
    // Kolom Arsip
    Column(
        modifier = Modifier
            .background(Color(android.graphics.Color.parseColor("#480003")))){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 18.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically


            //
        ){
            Image(
                painter = painterResource(id = R.drawable.like),
                colorFilter = ColorFilter.tint(color = Color.White),
                contentDescription = null,
                modifier = Modifier
                    .size(36.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = "Diarsipkan",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )
        }
    }
}

@Composable
fun HalamanBeranda() {

    val itemFacebook = remember { PusatDataFacebook.recordDataFacebook}

    Column(){

//        HeaderPage()

        LazyColumn(){
            items(
                items = itemFacebook,
                itemContent = {
                    ViewDataFacebook(kolomDataFacebook = it)
                }
            )
        }
    }

}

@Composable
fun HalamanPesan() {

    Column(
        modifier = Modifier
            .padding(24.dp)
    ){

        Card(
            modifier = Modifier
                .padding(bottom = 24.dp),
            elevation = CardDefaults.cardElevation(10.dp),
            border = BorderStroke(1.dp,Color.Gray)
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Column (){
                    Text(
                        modifier = Modifier
                            .padding(10.dp),
                        text = "Kunjungan Presiden RI",
                        fontWeight = FontWeight.Bold
                    )
                    Divider(thickness = 1.dp, color = Color.Gray)
                    Text(
                        modifier = Modifier
                            .padding(10.dp),
                        text = "Presiden Joko Widodo mengunjungi PT Pindad di Turen, Kabupaten Malang" +
                                " pada Senin (31/07/2023).",
                        fontSize = 15.sp,
                        letterSpacing = 0.5.sp,
                        lineHeight = 20.sp
                    )
                    Row(){
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .padding(10.dp)
                        ) {
                            Text(text = "Ambil Job")
                        }
                    }
                }

            }


        }

        Card(
            elevation = CardDefaults.cardElevation(10.dp),
            border = BorderStroke(1.dp,Color.Gray),
                    modifier = Modifier
                    .padding(bottom = 24.dp),
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Column (){
                    Text(
                        modifier = Modifier
                            .padding(10.dp),
                        text = "Kunjungan Presiden RI",
                        fontWeight = FontWeight.Bold
                    )
                    Divider(thickness = 1.dp, color = Color.Gray)
                    Text(
                        modifier = Modifier
                            .padding(10.dp),
                        text = "Presiden Joko Widodo mengunjungi PT Pindad di Turen, Kabupaten Malang" +
                                " pada Senin (31/07/2023).",
                        fontSize = 15.sp,
                        letterSpacing = 0.5.sp,
                        lineHeight = 20.sp
                    )
                    Row(){
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .padding(10.dp)
                        ) {
                            Text(text = "Ambil Job")
                        }
                    }
                }

            }


        }

        Card(
            elevation = CardDefaults.cardElevation(10.dp),
            border = BorderStroke(1.dp,Color.Gray),
            modifier = Modifier
                .padding(bottom = 24.dp),
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Column (){
                    Text(
                        modifier = Modifier
                            .padding(10.dp),
                        text = "Kunjungan Presiden RI",
                        fontWeight = FontWeight.Bold
                    )
                    Divider(thickness = 1.dp, color = Color.Gray)
                    Text(
                        modifier = Modifier
                            .padding(10.dp),
                        text = "Presiden Joko Widodo mengunjungi PT Pindad di Turen, Kabupaten Malang" +
                                " pada Senin (31/07/2023).",
                        fontSize = 15.sp,
                        letterSpacing = 0.5.sp,
                        lineHeight = 20.sp
                    )
                    Row(){
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .padding(10.dp)
                        ) {
                            Text(text = "Ambil Job")
                        }
                    }
                }

            }


        }

        Card(
            elevation = CardDefaults.cardElevation(10.dp),
            border = BorderStroke(1.dp,Color.Gray),
            modifier = Modifier
                .padding(bottom = 24.dp),
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Column (){
                    Text(
                        modifier = Modifier
                            .padding(10.dp),
                        text = "Kunjungan Presiden RI",
                        fontWeight = FontWeight.Bold
                    )
                    Divider(thickness = 1.dp, color = Color.Gray)
                    Text(
                        modifier = Modifier
                            .padding(10.dp),
                        text = "Presiden Joko Widodo mengunjungi PT Pindad di Turen, Kabupaten Malang" +
                                " pada Senin (31/07/2023).",
                        fontSize = 15.sp,
                        letterSpacing = 0.5.sp,
                        lineHeight = 20.sp
                    )
                    Row(){
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .padding(10.dp)
                        ) {
                            Text(text = "Ambil Job")
                        }
                    }
                }

            }


        }
    }
}



@Composable
fun HalamanNotifikasi() {

    val itemNotif = remember { PusatDataNotifFB.recordDataNotifFacebook}

    Column(){

//        HeaderPage()

        LazyColumn(){
            items(
                items = itemNotif,
                itemContent = {
                    ViewDataNotif(kolomNotifFB = it)
                }
            )
        }
    }

}

@Composable
fun HeaderPage(){
    Column(){

        MenuTabAtas()
        JudulHalaman("Notifikasi")

        Divider(thickness = Dp.Hairline,color = Color.LightGray)
    }
}

@Composable
fun JudulHalaman(notif: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
    ){
        Text(
            text= notif,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(vertical = 16.dp, horizontal = 8.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.lens),
            contentDescription = null,
            modifier = Modifier
                .size(36.dp)
                .padding(end = 8.dp)
        )
    }
}

@Composable
fun Branding(namaMerek: String, ukuranFont: Int) {
    Text(
        text = namaMerek,
        fontSize = ukuranFont.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,

        modifier = Modifier
            .padding(8.dp)
    )
}
