package com.javasatu.journalistappreciator.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.javasatu.journalistappreciator.model.FormDataFacebook
import com.javasatu.journalistappreciator.ui.theme.kustomTypography

@Composable
fun ViewModelPostBeranda(formDataFacebook: FormDataFacebook){
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Row (
                modifier = Modifier
                    .padding(vertical = 16.dp, horizontal = 8.dp)
            ){
                FotoProfilBeranda(formDataFacebook = formDataFacebook)
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
                        style = kustomTypography.titleLarge
                    )
                    Text(
                        text = formDataFacebook.waktuPostingan,
                        style = kustomTypography.titleSmall
                    )
                }
            }
            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = formDataFacebook.postinganString,
                style = kustomTypography.bodyLarge
            )

            Box(
                modifier = Modifier
                    .padding(start = 12.dp,end = 12.dp, top = 12.dp)
            ){
                FotoPosting(formDataFacebook = formDataFacebook)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth(0.3f)
                        .padding(12.dp)
                ){
                    Text(text = "Suka")
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(12.dp)
                ){
                    Text(text = "Komentar")
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                ){
                    Text(text = "Bagikan")
                }
            }
            Divider(
                thickness = Dp.Hairline,
                color = MaterialTheme.colorScheme.secondary
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(15.dp)
                    .background(MaterialTheme.colorScheme.tertiaryContainer)
            )
        }

}

@Composable
private fun FotoProfilBeranda(formDataFacebook: FormDataFacebook) {
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
            .fillMaxWidth()
            .clip(
                shape = RoundedCornerShape(10.dp)
            )
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            ),
        painter = painterResource(id = formDataFacebook.fotoProfilImage),
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
}

