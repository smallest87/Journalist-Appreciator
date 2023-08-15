package com.javasatu.journalistappreciator.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.javasatu.journalistappreciator.contants.TABLE_NAME

@Entity(tableName = TABLE_NAME)
class User (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val firstName: String,
    val lastName: String,
    val age: Int
)