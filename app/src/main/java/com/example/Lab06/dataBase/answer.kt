package com.example.Lab06.dataBase

import android.renderscript.Script
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

//CASCADE allows to delete everything from all the tables
@Entity(tableName = "answer_table",  foreignKeys = [ForeignKey(entity = survey::class,
    parentColumns = ["pollID"], childColumns = ["poll_id"], onDelete = CASCADE),
    ForeignKey(entity = question::class, parentColumns = ["questionID"],
        childColumns = ["question_ID"], onDelete = CASCADE)])
data class answer (

    //Numerical index: auto-generated
    @PrimaryKey(autoGenerate = true)
    var answerID: Long = 0L,

    //referred data from survey::class
    @ColumnInfo(name = "pool_id", index = true)
    var poll_id: Long = 0L,

    //Referred data from question::class
    @ColumnInfo(name = "question_ID", index = true)
    var question_ID: Long = 0L,

    //Answer: String
    @ColumnInfo(name = "answer_text", index = true)
    var answer_text: String,

    //Answer: Long
    @ColumnInfo(name = "answer_numb", index = true)
    var answer_numb: Long = 0L

)
