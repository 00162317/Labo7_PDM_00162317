package com.feranstirman.labo7_pdm_00162317.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.feranstirman.labo7_pdm_00162317.database.daos.GitHubRepoDAO
import com.feranstirman.labo7_pdm_00162317.database.entities.GitHubRepo

@Database(entities = [GitHubRepo::class],version = 1,exportSchema = false)
public abstract class RoomDB:RoomDatabase(){

    abstract fun repoDAO():GitHubRepoDAO

    companion object {
        @Volatile
        private var INSTANCE:RoomDB?=null

        fun getInstance(context: Context):RoomDB{
            val temInstance = INSTANCE
            if(temInstance!=null){
                return temInstance
            }
            synchronized(this){
                val instance= Room.databaseBuilder(context,RoomDB::class.java,"Repo_DB").build()

                INSTANCE = instance
                return instance
            }
        }
    }

}