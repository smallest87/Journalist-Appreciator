package com.javasatu.journalistappreciator.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
                        style = kustomTypography.titleMedium
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

            FotoPosting(formDataFacebook = formDataFacebook)
            Row(
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Text(
                    text = "Suka"
                )
                Text(
                    text = "Komentar"
                )
                Text(
                    text = "Bagikan"
                )
            }
            Divider(
                thickness = Dp.Hairline,
                color = MaterialTheme.colorScheme.secondary
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
            .fillMaxWidth(),
        painter = painterResource(id = formDataFacebook.fotoProfilImage),
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
}

