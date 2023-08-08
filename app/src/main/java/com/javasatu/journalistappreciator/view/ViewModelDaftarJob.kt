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
import com.javasatu.journalistappreciator.model.FormDataJob

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ViewModelDaftarJob(formDataJob: FormDataJob){

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Column() {
            Row(){
                Text(
                    modifier = Modifier
                        .padding(10.dp),
                    text = formDataJob.topikBerita,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 28.sp
                )
            }

//            Divider(thickness = 1.dp, color = Color.Gray)
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = formDataJob.detailJob,
                fontSize = 24.sp,
                letterSpacing = 0.5.sp,
                lineHeight = 28.sp,
                color = Color.Gray
            )
            FlowRow(
                modifier = Modifier
                    .padding(12.dp)
            ) {
                formDataJob.jenisJob.forEach{
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(4.dp)
                    ) {
                        Text(text = it)
                    }
                }
            }
            Divider(thickness = 1.dp, color = Color.Gray)
        }
    }
}
