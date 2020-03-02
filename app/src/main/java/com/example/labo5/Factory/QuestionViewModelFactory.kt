package com.example.labo5.Factory

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.labo5.dataBase.dataBaseDao
import com.example.labo5.viewModels.QuestionsViewModel

class QuestionViewModelFactory (
    private val dataSource: dataBaseDao,
    private val application: Application) : ViewModelProvider.Factory {
        @Suppress("unchecked_cast")
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(QuestionsViewModel::class.java)) {
                return QuestionsViewModel(dataSource, application) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
