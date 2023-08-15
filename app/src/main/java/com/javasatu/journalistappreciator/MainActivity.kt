package com.javasatu.journalistappreciator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.javasatu.journalistappreciator.data.User
import com.javasatu.journalistappreciator.data.UserDao
import com.javasatu.journalistappreciator.data.UserDatabase
import com.javasatu.journalistappreciator.ui.theme.LazyColumnTheme
import com.javasatu.journalistappreciator.view.TampilanAwal
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
            name = "book_database"
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
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun PraTampilanAwal() {
        Scaffold(
            content = {
                TampilanAwal()
            }
        )
    }
}
