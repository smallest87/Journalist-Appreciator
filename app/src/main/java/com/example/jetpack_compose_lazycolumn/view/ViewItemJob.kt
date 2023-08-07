import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_lazycolumn.model.TemplateFieldJob

@OptIn(ExperimentalLayoutApi::class)
@Composable
// Row Viewitem Abdus Salam
fun KumpulanViewItemJob(templateFieldJob: TemplateFieldJob){


        Card(
            modifier = Modifier
                .padding(bottom = 24.dp),
            elevation = CardDefaults.cardElevation(10.dp),
            border = BorderStroke(1.dp, Color.Gray)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column() {
                    Row(){
                        Text(
                            modifier = Modifier
                                .padding(10.dp),
                            text = templateFieldJob.topikBerita,
                            fontWeight = FontWeight.SemiBold
                        )
                    }

                    Divider(thickness = 1.dp, color = Color.Gray)
                    Text(
                        modifier = Modifier
                            .padding(10.dp),
                        text = templateFieldJob.detailJob,
                        fontSize = 15.sp,
                        letterSpacing = 0.5.sp,
                        lineHeight = 20.sp
                    )
                    FlowRow(
                        modifier = Modifier
                            .padding(12.dp)
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .padding(4.dp)
                        ) {
                            Text(text = templateFieldJob.jenisJob)
                        }
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .padding(4.dp)
                        ) {
                            Text(text = templateFieldJob.jenisJob)
                        }
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .padding(4.dp)
                        ) {
                            Text(text = templateFieldJob.jenisJob)
                        }
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .padding(4.dp)
                        ) {
                            Text(text = templateFieldJob.jenisJob)
                        }
                    }
                }
            }
        }
    }
