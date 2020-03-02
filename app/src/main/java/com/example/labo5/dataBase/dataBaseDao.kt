package com.example.labo5.dataBase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface dataBaseDao{

    //Insert new question
    @Insert
    fun insertQuestion(question: question)

    //Insert new answer
    @Insert
    fun insertAnswer(answer: answer)

    //Insert new Survey
    @Insert
    fun insertSurvey(survey: survey)

    //Delete everything in the answer table
    @Query("DELETE FROM question_table")
    fun clearQuestion()

    //Delete everything in the answer table
    @Query("DELETE FROM poll_table")
    fun clearPoll()

    //Delete everything in the answer table
    @Query("DELETE FROM answer_table")
    fun clearAnswer()

    //Get all the survey's answers
    @Query("SELECT * FROM answer_table ORDER BY answerID DESC")
    fun getAllAnswers(): LiveData<List<answer>>

}