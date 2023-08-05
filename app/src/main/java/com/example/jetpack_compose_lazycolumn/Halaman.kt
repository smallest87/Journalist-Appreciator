package com.example.jetpack_compose_lazycolumn

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_lazycolumn.data.PusatDataFacebook
import com.example.jetpack_compose_lazycolumn.data.PusatDataNotifFB
import com.example.jetpack_compose_lazycolumn.view.ViewDataNotif

@Composable
fun TabDanHalaman(){
    Column(){

        // Baris Branding
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(android.graphics.Color.parseColor("#bb0909")))
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

    Column(modifier = Modifier.fillMaxWidth()) {
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

        // Kolom Arsip
        Column(
            modifier = Modifier
                .background(Color(android.graphics.Color.parseColor("#1F2B31")))){
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


        // Kanvas ListView

        Column(
            modifier = Modifier
                .background(Color(android.graphics.Color.parseColor("#111b21")))
        ){

            // Row Viewitem Abdus Salam
            Row(
                modifier = Modifier
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.fotoprofilabdussalam),
                    contentDescription = null,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 8.dp)
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(
                            text = "Abdus Salam",
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                        Text(
                            text = "05/08/2023",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 12.sp,
                            color = Color(android.graphics.Color.parseColor("#878b8f"))
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(
                            text = "Hello...",
                            color = Color(android.graphics.Color.parseColor("#878b8f"))
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.pinned),
                                colorFilter = ColorFilter.tint(color = Color(android.graphics.Color.parseColor("#878b8f"))),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(28.dp)
                                    .padding(end = 8.dp)
                            )
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .clip(CircleShape)
                                    .background(Color(android.graphics.Color.parseColor("#0eba83"))),
                                contentAlignment = Alignment.Center
                            ){
                                Text(
                                    text="1",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                    }
                }
            }

            // Row Viewitem Rahmawati
            Row(
                modifier = Modifier
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.fotoprofilrahmawati),
                    contentDescription = null,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 8.dp)
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(
                            text = "Rahmawati",
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                        Text(
                            text = "10.23",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 12.sp,
                            color = Color(android.graphics.Color.parseColor("#0eba83"))
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(
                            text = "Hai",
                            color = Color(android.graphics.Color.parseColor("#878b8f"))
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .clip(CircleShape)
                                    .background(Color(android.graphics.Color.parseColor("#0eba83"))),
                                contentAlignment = Alignment.Center
                            ){
                                Text(
                                    text="23",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                    }
                }
            }

            // Row Viewitem Gunawan Sasmita
            Row(
                modifier = Modifier
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.fotoprofilgunawansasmita),
                    contentDescription = null,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 8.dp)
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(
                            text = "Gunawan Sasmita",
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                        Text(
                            text = "08.03",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 12.sp,
                            color = Color(android.graphics.Color.parseColor("#0eba83"))
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(
                            text = "Apa Kabarmu?",
                            color = Color(android.graphics.Color.parseColor("#878b8f"))
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .clip(CircleShape)
                                    .background(Color(android.graphics.Color.parseColor("#0eba83"))),
                                contentAlignment = Alignment.Center
                            ){
                                Text(
                                    text="42",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                    }
                }
            }

            // Row Viewitem Budi Harianto
            Row(
                modifier = Modifier
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.fotoprofilbudiharianto),
                    contentDescription = null,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 8.dp)
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(
                            text = "Budi Harianto",
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                        Text(
                            text = "02.23",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 12.sp,
                            color = Color(android.graphics.Color.parseColor("#0eba83"))
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(
                            text = "Dah tidur?",
                            color = Color(android.graphics.Color.parseColor("#878b8f"))
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .clip(CircleShape)
                                    .background(Color(android.graphics.Color.parseColor("#0eba83"))),
                                contentAlignment = Alignment.Center
                            ){
                                Text(
                                    text="6",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                    }
                }
            }

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
fun HalamanMarket() {

    val itemNotif = remember { PusatDataNotifFB.recordDataNotifFacebook}

    Column(){

        HeaderPage()

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
