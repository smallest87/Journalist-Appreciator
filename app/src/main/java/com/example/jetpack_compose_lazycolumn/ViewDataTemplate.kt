package com.example.jetpack_compose_lazycolumn

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_lazycolumn.data.KolomDataTemplate

@Composable
fun ViewDataTemplate(kolomDataTemplate: KolomDataTemplate){
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(Color.White),
        shape = RoundedCornerShape(corner = CornerSize(8.dp))
    ) {
        Row {
            TemplateImage(kolomDataTemplate = kolomDataTemplate)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Top)
            ) {
                Text(
                    text = kolomDataTemplate.kolom02String.uppercase(),
                    Modifier
                        .fillMaxWidth()
                        .background(color = Color.LightGray)
                        .padding(6.dp),
                    style = typography.titleMedium,
                    color = Color.White
                )
                Text(
                    text = kolomDataTemplate.kolom03String,
                    style = typography.labelMedium
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
private fun TemplateImage(kolomDataTemplate: KolomDataTemplate) {
    Image(
        painter = painterResource(id = kolomDataTemplate.kolom05ImageInteger),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(140.dp)
    )
}
