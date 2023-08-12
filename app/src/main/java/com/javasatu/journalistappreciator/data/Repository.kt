package com.javasatu.journalistappreciator.data

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class Repository(
    private val userDao: Dao
) {

    val allWords: Flow<List<User>> = userDao.getAlphabetizedWords()
    @WorkerThread
    suspend fun insert(
        word: User
    ) {
        userDao.insert(word)
    }
}