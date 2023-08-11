package com.javasatu.journalistappreciator.data

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class Repository(private val userDao: Dao) {

    // Room executes all queries on a separate thread.
    // Observed Flow will notify the observer when the data has changed.
    val allWords: Flow<List<User>> = userDao.getAlphabetizedWords()

    // By default Room runs suspend queries off the main thread, therefore, we don't need to
    // implement anything else to ensure we're not doing long running database work
    // off the main thread.
    @WorkerThread
    suspend fun insert(word: User) {
        userDao.insert(word)
    }
}