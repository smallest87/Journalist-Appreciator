package com.example.jetpack_compose_lazycolumn

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_lazycolumn.data.PusatDataFacebook
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TampilanBerandaFacebook() {
    val itemWisata = remember { PusatDataFacebook.recordDataFacebook}
    LazyColumn(
        modifier = Modifier
            .background(Color.LightGray)
    ){
        stickyHeader {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .border(width = Dp.Hairline, color = Color.LightGray),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ){

                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
                    shape = RoundedCornerShape(corner = CornerSize(10.dp)),
//                    modifier = Modifier
//                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.house),
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                    )
                }

                Image(
                    painter = painterResource(id = R.drawable.like),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.messenger),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.settings),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.p1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                        .clip(CircleShape)
                )

            }



        }
        items(
            items = itemWisata,
            itemContent = {
                ViewDataFacebook(kolomDataFacebook = it)
            }
        )
    }
}


