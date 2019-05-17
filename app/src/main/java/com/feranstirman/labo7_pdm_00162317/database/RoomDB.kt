package com.feranstirman.labo7_pdm_00162317.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.feranstirman.labo7_pdm_00162317.database.entities.GitHubRepo

@Database(entities = [GitHubRepo::class],version = 1,exportSchema = false)
public abstract class RoomDB:RoomDatabase(){

}