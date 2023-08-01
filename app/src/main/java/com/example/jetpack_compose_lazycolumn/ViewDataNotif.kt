package com.example.jetpack_compose_lazycolumn

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import com.example.jetpack_compose_lazycolumn.data.KolomNotifFB

@Composable
fun ViewDataNotif(kolomNotifFB: KolomNotifFB){
    Row (
        modifier = Modifier
            .background(color = Color.White)
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        FotoNotif(kolomNotifFB = kolomNotifFB)

        Text(
            text = kolomNotifFB.namaSubyekString + " " + kolomNotifFB.jenisAksiString
                + " " + kolomNotifFB.namaObyekString,
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            fontSize = 14.sp,
            )
        Text(
            text = kolomNotifFB.waktuNotifString,
            fontSize = 12.sp,
            color = Color.Gray
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
            .size(40.dp)
            .padding(4.dp)
    )
}

