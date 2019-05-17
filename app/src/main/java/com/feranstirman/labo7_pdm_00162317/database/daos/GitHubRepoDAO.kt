package com.feranstirman.labo7_pdm_00162317.database.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.feranstirman.labo7_pdm_00162317.database.entities.GitHubRepo

@Dao
interface GitHubRepoDAO{

    @Query("SELECT * FROM repos")
    fun getAll():LiveData<List<GitHubRepo>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(repo:GitHubRepo)

    @Query("DELETE FROM repos")
    fun nukeTable()
}