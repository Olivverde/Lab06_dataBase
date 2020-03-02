package com.example.labo5.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//Database uses 3 tables (answer, survey and question)
@Database(entities = [answer::class, survey::class, question::class],
    version = 1, exportSchema = false)
abstract class dataBase : RoomDatabase() {

    //Refers to interface
    abstract val sleepDatabaseDao: dataBaseDao

    companion object {
        private var INSTANCE: dataBase? = null

        fun getInstance(context: Context): dataBase {
            //Call this function once at the time, waits to be free
            synchronized(this){
                //Use a local var in order to avoid the static var
                var instance =
                    INSTANCE
                // If it's null...
                if (instance == null){
                    instance = Room.databaseBuilder(
                        //Refers to the main context
                        context.applicationContext,
                        //Refers the class itself
                        dataBase::class.java,
                        //name .-.
                        "database"
                    )
                        //Used in case you modify the dataBase structure
                        //Instead of migrate, destroy and rebuild the dataBase
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }

}
