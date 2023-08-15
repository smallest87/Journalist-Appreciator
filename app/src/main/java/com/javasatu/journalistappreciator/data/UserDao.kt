package com.javasatu.journalistappreciator.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun tambahUser(user: User)

    @Query("SELECT * FROM user_table")
    fun getAllBooks(): List<User>

    @Query("DELETE FROM user_table")
    suspend fun hapusSemuaBarisData()

    @Update
    suspend fun updateBook(user: User)

    @Delete
    suspend fun deleteBook(user: User)
}