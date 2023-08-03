package com.example.jetpack_compose_lazycolumn.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_lazycolumn.model.KolomNotifFB

@Composable
fun ViewDataNotif(kolomNotifFB: KolomNotifFB){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(){
            FotoNotif(kolomNotifFB = kolomNotifFB)

            Column() {
                Text(
                    text = kolomNotifFB.namaSubyekString + " " + kolomNotifFB.jenisAksiString
                            + " " + kolomNotifFB.namaObyekString,
                    fontSize = 18.sp,
                    softWrap = true
                )
                Text(
                    text = kolomNotifFB.waktuNotifString,
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
        }

            Text(
                text = "...",
                modifier = Modifier
                    .padding(end = 8.dp)
            )
    }

    Divider(thickness = 1.dp, color = Color.LightGray)
}
@Composable
private fun FotoNotif(kolomNotifFB: KolomNotifFB) {
    Image(
        painter = painterResource(id = kolomNotifFB.fotoNotifImage),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(75.dp)
            .padding(4.dp)

    )
}

