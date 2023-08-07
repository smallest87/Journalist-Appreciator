package com.example.jetpack_compose_lazycolumn.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_lazycolumn.R
import com.example.jetpack_compose_lazycolumn.model.FormDataFacebook
import com.example.jetpack_compose_lazycolumn.ui.theme.fontKu

@Composable
fun TemplateListItemBeranda(formDataFacebook: FormDataFacebook){
    Card (
        modifier = Modifier
            .padding(horizontal = 0.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(Color.White),
        shape = RoundedCornerShape(corner = CornerSize(0.dp))
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Row (
                modifier = Modifier
                    .padding(vertical = 16.dp, horizontal = 8.dp)
            ){
                FotoProfil(formDataFacebook = formDataFacebook)
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Top)
                        .padding(horizontal = 8.dp)
                ) {
                    Text(
                        text = formDataFacebook.namaProfilString,
                        Modifier
                            .fillMaxWidth(),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = formDataFacebook.waktuPostingan,
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }
            }
            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = formDataFacebook.postinganString,
                fontSize = 16.sp,
                fontFamily = fontKu,
                letterSpacing = 0.2.sp
            )

            FotoPosting(formDataFacebook = formDataFacebook)
            Row(
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Image(
                    painter = painterResource(id = R.drawable.postbottomiconthumb),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.postbottomiconcomment),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.postbottomiconshare),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                )
            }
        }
    }

}

@Composable
private fun FotoProfil(formDataFacebook: FormDataFacebook) {
    Image(
        painter = painterResource(id = formDataFacebook.fotoProfilImage),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
    )
}

@Composable
private fun FotoPosting(formDataFacebook: FormDataFacebook) {
    Image(
        modifier = Modifier
            .fillMaxWidth(),
        painter = painterResource(id = formDataFacebook.fotoProfilImage),
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
}

