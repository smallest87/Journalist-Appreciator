package com.javasatu.journalistappreciator.data

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class UserApplication : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy {
        UserDatabase.getDatabase(this, applicationScope)
    }
    val repository by lazy {
        Repository(
            database.userDao()
        )
    }
}