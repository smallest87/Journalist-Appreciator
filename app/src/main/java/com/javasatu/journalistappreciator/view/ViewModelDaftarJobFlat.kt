import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.javasatu.journalistappreciator.model.FormDataJob
import com.javasatu.journalistappreciator.ui.theme.replyTypography

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ViewModelDaftarJobFlat(formDataJob: FormDataJob){

    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp)
        ) {

            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = formDataJob.topikBerita,
                style = replyTypography.titleLarge
            )




//            Divider(thickness = 1.dp, color = Color.Gray)
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = formDataJob.detailJob,
                style = replyTypography.bodyLarge
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

            Divider(
                thickness = 3.dp,
                color = MaterialTheme.colorScheme.tertiary,
                modifier = Modifier
                    .padding(horizontal = 72.dp)
            )
        }
    }
}