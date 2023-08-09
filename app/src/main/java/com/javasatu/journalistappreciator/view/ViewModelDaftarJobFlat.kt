import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.javasatu.journalistappreciator.model.FormDataJob
import com.javasatu.journalistappreciator.ui.theme.kustomTypography

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ViewModelDaftarJobFlat(formDataJob: FormDataJob){

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
                    text = formDataJob.topikBerita,
                    style = kustomTypography.titleLarge
                )




//            Divider(thickness = 1.dp, color = Color.Gray)
                Text(
                    modifier = Modifier
                        .padding(10.dp),
                    text = formDataJob.detailJob,
                    style = kustomTypography.bodyLarge
                )

                FlowRow(
                    modifier = Modifier
                        .padding(12.dp)
                ) {
                    formDataJob.jenisJob.forEach{
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