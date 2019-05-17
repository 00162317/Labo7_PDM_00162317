package com.feranstirman.labo7_pdm_00162317.database.repositories

import androidx.lifecycle.LiveData
import com.feranstirman.labo7_pdm_00162317.database.daos.GitHubRepoDAO
import com.feranstirman.labo7_pdm_00162317.database.entities.GitHubRepo

class GitHubRepoRepository(private val repoDAO: GitHubRepoDAO){

    fun getAll():LiveData<List<GitHubRepo>> = repoDAO.getAll()

    fun nuke()=repoDAO.nukeTable()

    suspend fun insert(repo:GitHubRepo){
        repoDAO.insert(repo)
    }
}