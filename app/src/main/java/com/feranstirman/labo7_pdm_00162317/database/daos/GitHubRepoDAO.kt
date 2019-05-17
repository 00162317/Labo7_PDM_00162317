package com.feranstirman.labo7_pdm_00162317.database.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import com.feranstirman.labo7_pdm_00162317.database.entities.GitHubRepo

@Dao
interface GitHubRepoDAO{

    fun getAll():LiveData<List<GitHubRepo>>

    fun insert(repo:GitHubRepo)

    fun nukeTable()
}