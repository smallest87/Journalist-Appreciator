package com.javasatu.journalistappreciator.view

import ViewModelDaftarJob
import ViewModelChatPesan
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material3.Text
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import com.javasatu.journalistappreciator.R
import com.javasatu.journalistappreciator.data.BasisDataManual

@Composable
fun TampilanAwal(){
    Column(){

        // Baris Branding
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(android.graphics.Color.parseColor("#480003")))
        ){
            Branding("Journalist Appreciator™",16)
        }
        MenuTabAtas()
    }
}

@Composable
fun MenuTabAtas() {
    var tabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("Beranda", "Pesan", "Job","Notif")

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
            0 -> TabBeranda()
            1 -> TabPesan()
            2 -> TabJob()
            3 -> TabNotif()
        }
    }
}

@Composable
fun TabBeranda() {

    val itemFacebook = remember { BasisDataManual.dataFacebook}

    Column(){

//        HeaderPage()

        LazyColumn(){
            items(
                items = itemFacebook,
                itemContent = {
                    ViewModelPostBeranda(formDataFacebook = it)
                }
            )
        }
    }

}
@Composable
fun TabPesan() {

    // Kolom Kanvas
    Column(){

        BarisArsip()

        // Kanvas ListView

        Column(
            modifier = Modifier
                .background(Color(android.graphics.Color.parseColor("#1c0001")))
        ){

            val itemProfil = remember { BasisDataManual.dataWhatsappChat}

            Column(){

                LazyColumn(){
                    items(
                        items = itemProfil,
                        itemContent = {
                            ViewModelChatPesan(formDataPesan = it)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun TabJob() {

    val itemJob = remember { BasisDataManual.dataJob}
        LazyColumn(){
            items(
                items = itemJob,
                itemContent = {
                    ViewModelDaftarJob(formDataJob = it)
                }
            )
        }
}



@Composable
fun TabNotif() {

    val itemNotif = remember { BasisDataManual.dataNotif}

    Column(){

//        HeaderPage()

        LazyColumn(){
            items(
                items = itemNotif,
                itemContent = {
                    ViewModelDaftarNotif(formDataNotif = it)
                }
            )
        }
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