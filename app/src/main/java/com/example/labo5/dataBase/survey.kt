package com.example.labo5.dataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "poll_table")
data class survey(

    //Numerical index: auto-generated
    @PrimaryKey(autoGenerate = true)
    var pollId: Long = 0L,

    //Current date and time
    @ColumnInfo(name = "create_date")
    var create_date: Date = Calendar.getInstance().time
)


