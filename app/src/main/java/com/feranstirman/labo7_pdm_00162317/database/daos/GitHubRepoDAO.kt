package com.feranstirman.labo7_pdm_00162317.database.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.feranstirman.labo7_pdm_00162317.database.entities.GitHubRepo

@Dao
interface GitHubRepoDAO{

    @Query("SELECT * FROM repos")
    fun getAll():LiveData<List<GitHubRepo>>

    @Insert
    fun insert(repo:GitHubRepo)

    @Query("DELETE FROM repos")
    fun nukeTable()
}