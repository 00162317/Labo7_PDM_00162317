package com.feranstirman.labo7_pdm_00162317.database.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.feranstirman.labo7_pdm_00162317.database.RoomDB
import com.feranstirman.labo7_pdm_00162317.database.entities.GitHubRepo
import com.feranstirman.labo7_pdm_00162317.database.repositories.GitHubRepoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Appendable

class GitHupRepoViewModel(app:Application):AndroidViewModel(app){

    private val repository:GitHubRepoRepository

    init {
        val repoDao=RoomDB.getInstance(app).repoDAO()
        repository= GitHubRepoRepository(repoDao)
    }

    fun getAll():LiveData<List<GitHubRepo>> = repository.getAll()

    fun insert(repo: GitHubRepo)=viewModelScope.launch (Dispatchers.IO){
        repository.insert(repo)

    }

}