package com.example.labo5.viewModels

import android.app.Application
import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.labo5.dataBase.dataBaseDao


class QuestionsViewModel(
    dataSource: dataBaseDao,
    application: Application
) : ViewModel()  {



    // The list of words - the front of the list is the next word to guess
    private var addedQuestions = ArrayList<String>()
    private lateinit var questionsList: ArrayList<String>
    var question = ""

    fun defaultQuestions(){
        questionsList = ArrayList()

        for (question in addedQuestions){
            questionsList.add(question)
        }

        questionsList.add("¿Tiene algún comentario o sugerencia?")
        questionsList.add("¿Qué le pareció nuestro servicio?")

        Log.i("QuestionsViewModel", "List created!")
    }

    //Moves to the next question in the list
    fun nextQuestion() {
        //Select and remove a question from the list
        if (questionsList.isNotEmpty()) {
            question = questionsList.removeAt(0)
        }
    }
    //Add question
    fun addQuestion(newQuestion: String) {
        addedQuestions.add(newQuestion)

        Log.i("QuestionsViewModel", "Question created!")
    }
    //Returns question list
    fun getQuestionList(): ArrayList<String>{

        return questionsList
    }
    //Returns first question
    fun getFirstQuestion(): String{
        return questionsList[0]
    }

}