package com.javasatu.journalistappreciator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.javasatu.journalistappreciator.contants.DATABASE_NAME
import com.javasatu.journalistappreciator.data.BasisDataManual
import com.javasatu.journalistappreciator.data.User
import com.javasatu.journalistappreciator.data.UserDao
import com.javasatu.journalistappreciator.data.UserDatabase
import com.javasatu.journalistappreciator.ui.theme.LazyColumnTheme
import com.javasatu.journalistappreciator.ui.theme.kustomTypography
import com.javasatu.journalistappreciator.view.TabContent
import com.javasatu.journalistappreciator.view.ViewModelDaftarNotif
import com.javasatu.journalistappreciator.view.ViewModelPostBeranda
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private lateinit var fungsiUserSiapPakai: UserDao
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        /*
        ** 'super' merupakan 'superclass'
        * Sedangkan metode 'onCreate' menunjukkan penyiapan dasar untuk aktivitas,
        * seperti mendeklarasikan antarmuka pengguna
        * (didefinisikan dalam file tata letak XML),
        * mendefinisikan variabel anggota,
        * dan mengonfigurasi beberapa UI.
        */

        setContent {
            /*
            * 'setContent' mendefinisikan aktivitas layout
            * dimana fungsi 'composable' dipanggil.
            * 'Fungsi Composable' hanya dapat dipanggil
            * dari 'fungsi composable' lainnya.
            * */

            LazyColumnTheme {
                /* 'LazyColumnTheme' menjadi bagian dari Theme.kt.
                * yang mengatur penerapan tema menyeluruh.
                */

                Surface(
                    /*Menangani buffer mentah
                    yang nantinya dikelola penyusun layar.
                     */

                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PraTampilanAwal()
                }
            }
        }

        val roomDatabaseBahan = Room.databaseBuilder(
            context = applicationContext,
            klass = UserDatabase::class.java,
            name = DATABASE_NAME
        )

        val roomDatabaseMatang = roomDatabaseBahan.build()

        fungsiUserSiapPakai = roomDatabaseMatang.beriFungsiBookDao()

        terapkanRoomDB()

    }


    private fun terapkanRoomDB() {

        lifecycleScope.launch(Dispatchers.IO) {
            fungsiUserSiapPakai.tambahUser(User(1,"Julian","Sukrisna",37))
            fungsiUserSiapPakai.tambahUser(User(2,"Joko","Winahyu",54))
            fungsiUserSiapPakai.tambahUser(User(3,"Awank","Wibianto",42))
            fungsiUserSiapPakai.tambahUser(User(4,"Ali","Baba",34))
        }
    }


    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    private fun PraTampilanAwal() {
        Scaffold(
            /*
            * Scaffold= Sebuah Composable dalam menyediakan slot
            * untuk berbagai komponen dan elemen layar lainnya
            * */
            content = {
                Column(){

                    // Baris Branding
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ){
                        Branding(
                            namaMerek = "Journalist Appreciator™")
                    }
                    MenuTabAtas()
                }
            }
        )
    }

    @Composable
    fun MenuTabAtas() {
        var tabIndex by remember { mutableStateOf(0) }

        val tabs = listOf(
            "Beranda",
            "Pesan",
            "Job",
            "Notif"
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()) {
            TabRow(selectedTabIndex = tabIndex) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        text = { Text(title) },
                        selected = tabIndex == index,
                        onClick = { tabIndex = index },
                        icon = {
                            when (index) {
                                0 -> Image(
                                    painter = painterResource(id = R.drawable.house),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(24.dp)
                                )
                                1 -> Image(
                                    painter = painterResource(id = R.drawable.messenger),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(24.dp)
                                )
                                2 -> Image(
                                    painter = painterResource(id = R.drawable.market),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(24.dp)
                                )
                                3 -> Image(
                                    painter = painterResource(id = R.drawable.notif),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(24.dp)
                                )
                            }
                        }
                    )
                }
            }
            when (tabIndex) {
                0 -> TabBeranda()
                1 -> TabPesan()
                2 -> TabJob()
                3 -> TabNotif()
            }
        }
    }

    @Composable
    fun TabBeranda() {

        val itemFacebook = remember { BasisDataManual.dataFacebook}

        Column(){

            LazyColumn(){
                items(
                    items = itemFacebook,
                    itemContent = {
                        ViewModelPostBeranda(dataFacebook = it)
                    }
                )
            }
        }

    }
    val tabContentDua = TabContent()

    @Composable
    fun TabPesan() {

        // Kolom Kanvas
        Column(){

            BarisArsip()

            // Kanvas ListView

            Column(){

                val itemProfil = remember { BasisDataManual.dataWhatsappChat}

                Column(){

                    LazyColumn(){
                        items(
                            items = itemProfil,
                            itemContent = {
                                tabContentDua.ListChat(dataPesan = it)
                            }
                        )
                    }
                }
            }
        }
    }

    @Composable
    fun TabJob() {

        val itemJob = remember { BasisDataManual.dataJob}
        LazyColumn(){
            items(
                items = itemJob,
                itemContent = {
                    tabContentDua.ListJobFlat(dataJob = it)
                }
            )
        }
    }



    @Composable
    fun TabNotif() {

        val itemNotif = remember { BasisDataManual.dataNotif}

        Column(){

            LazyColumn(){
                items(
                    items = itemNotif,
                    itemContent = {
                        ViewModelDaftarNotif(dataNotif = it)
                    }
                )
            }
        }

    }

    @Composable
    fun Branding(namaMerek: String) {
        Text(
            modifier = Modifier
                .padding(8.dp),
            text = namaMerek,
            style = kustomTypography.titleLarge
        )
    }

    @Composable
    fun BarisArsip() {
        // Kolom Arsip
        Column(){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically


                //
            ){
                Image(
                    painter = painterResource(id = R.drawable.like),
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp)
                        .padding(end = 8.dp)
                )
                Text(
                    text = "Diarsipkan",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }

}
