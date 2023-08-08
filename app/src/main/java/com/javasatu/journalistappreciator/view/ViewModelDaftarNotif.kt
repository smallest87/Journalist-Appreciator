package com.javasatu.journalistappreciator.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.javasatu.journalistappreciator.model.FormDataNotif

@Composable
fun ViewModelDaftarNotif(formDataNotif: FormDataNotif){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ){
            FotoNotif(formDataNotif = formDataNotif)
            Text(

                modifier = Modifier
                    .padding(start = 4.dp),
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append(formDataNotif.notifDari)
                    }

                    append(" ")
                    append(formDataNotif.aktivitas)
                    append(" ")

                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold
                        )){
                        append(formDataNotif.namaObyekString)
                    }

                    append(".")
                    append(" ")
                    withStyle(
                        style = SpanStyle(
                            color = Color.Gray,
                            fontSize = 12.sp
                        )) {
                        append(formDataNotif.waktuNotifString)
                    }
                }
            )
        }


    }

    Divider(thickness = 1.dp, color = Color.LightGray)
}
@Composable
private fun FotoNotif(formDataNotif: FormDataNotif) {
    Image(
        painter = painterResource(id = formDataNotif.fotoNotifImage),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(60.dp)
            .padding(4.dp)
            .clip(CircleShape)

    )
}

