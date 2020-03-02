package com.example.labo5.dataBase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface dataBaseDao{

    //Insert new question
    @Insert
    fun insert(question: question)

    //Create a survey
    //no yet

    //Re-use questions by modifying answers
    @Update
    fun update(answer: answer)

    //Delete everything
    @Query("DELETE FROM answer_table")
    fun clear()

    //Get all the survey's answers
    @Query("SELECT * FROM answer_table ORDER BY answerID DESC")
    fun getAllAnswers(): LiveData<List<answer>>

}