package com.example.jetpack_compose_lazycolumn

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_lazycolumn.data.KolomDataWisata

@Composable
fun ViewDataWisata01(kolomDataWisata: KolomDataWisata){
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(Color.White),
        shape = RoundedCornerShape(corner = CornerSize(8.dp))
    ) {
        Row {
            WisataImage(kolomDataWisata = kolomDataWisata)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text = kolomDataWisata.judul,
                    style = typography.titleLarge
                )
                Text(
                    text = "VIEW DETAIL",
                    style = typography.bodyMedium
                )
            }
        }
    }
}

@Composable
private fun WisataImage(kolomDataWisata: KolomDataWisata) {
    Image(
        painter = painterResource(id = kolomDataWisata.wisataImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(86.dp)
            .clip(RoundedCornerShape(corner = CornerSize(8.dp)))
    )
}
