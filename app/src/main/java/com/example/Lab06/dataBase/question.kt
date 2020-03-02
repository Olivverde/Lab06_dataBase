package com.example.Lab06.dataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "question_table")
data class question(

    //Numerical index: auto-generated
    @PrimaryKey(autoGenerate = true)
    var questionID: Long = 0L,

    //Question
    @ColumnInfo(name = "name")
    var name: String,

    //Answer's type for currently question
    @ColumnInfo(name = "type")
    var type: String,

    //Indicates if the question belows to the system
    @ColumnInfo(name = "default")
    var default: Boolean


){

}