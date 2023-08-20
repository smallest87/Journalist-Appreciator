package com.javasatu.journalistappreciator.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.javasatu.journalistappreciator.R
import com.javasatu.journalistappreciator.model.DataJob
import com.javasatu.journalistappreciator.model.DataPesan
import com.javasatu.journalistappreciator.ui.theme.kustomTypography

class TabContent {
    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun ListJobFlat(dataJob: DataJob){

        Box(
            modifier = Modifier
                .padding(start=24.dp,end=24.dp,top=24.dp)
        ){

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(
                        elevation = 8.dp,
//                    ambientColor = MaterialTheme.colorScheme.primary
                        spotColor = MaterialTheme.colorScheme.primary,
                    )
                    .border(width = Dp.Hairline, color = MaterialTheme.colorScheme.secondary)
            ) {
                Column(
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.primaryContainer)

                ) {

                    Text(
                        modifier = Modifier
                            .padding(10.dp),
                        text = dataJob.topikBerita,
                        style = kustomTypography.titleLarge
                    )




//            Divider(thickness = 1.dp, color = Color.Gray)
                    Text(
                        modifier = Modifier
                            .padding(10.dp),
                        text = dataJob.detailJob,
                        style = kustomTypography.bodyLarge
                    )

                    FlowRow(
                        modifier = Modifier
                            .padding(12.dp)
                    ) {
                        dataJob.jenisJob.forEach{
                            Button(
                                onClick = { /*TODO*/ },
                                modifier = Modifier
                                    .padding(4.dp),
                                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)
                            ) {
                                Text(text = it)
                            }
                        }
                    }

                    Divider(
                        thickness = 2.dp,
                        color = MaterialTheme.colorScheme.primary,
                    )
                }
            }
        }
    }

    @Composable
    fun ListChat(dataPesan: DataPesan){

        Box(
            modifier = Modifier
                .clickable { }
        ){
            Row(
                modifier = Modifier
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                FotoProfilChatPesan(dataPesan = dataPesan)

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
                            text = dataPesan.user,
                            fontWeight = FontWeight.SemiBold,
                            letterSpacing = 0.5.sp
                        )
                        Text(
                            text = "05/08/2023",
                            fontSize = 12.sp,
                            letterSpacing = 0.2.sp,
                            color = Color(android.graphics.Color.parseColor("#878b8f"))
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(
                            text = dataPesan.cuplikan,
                            letterSpacing = 0.2.sp,
                            color = Color(android.graphics.Color.parseColor("#878b8f"))
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ){

                            if(dataPesan.pinned == true){

                                Image(
                                    painter = painterResource(id = R.drawable.pinned),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(28.dp)
                                        .padding(end = 8.dp)
                                )

                            }

                            if (dataPesan.notif > 0){

                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(25.dp))
                                        .background(Color(android.graphics.Color.parseColor("#bc6669"))),
                                    contentAlignment = Alignment.Center
                                ){
                                    Text(
                                        text=dataPesan.notif.toString(),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = androidx.compose.ui.graphics.Color.White,
                                        modifier = Modifier
                                            .padding(horizontal = 8.dp, vertical = 4.dp)
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
    fun FotoProfilChatPesan(dataPesan: DataPesan) {
        Image(
            painter = painterResource(id = dataPesan.fotoProfilChatPesan),
            contentDescription = null,
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
        )
    }

}