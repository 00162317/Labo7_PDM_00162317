package com.feranstirman.labo7_pdm_00162317.database.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.feranstirman.labo7_pdm_00162317.database.RoomDB
import com.feranstirman.labo7_pdm_00162317.database.repositories.GitHubRepoRepository
import java.lang.Appendable

class GitHupRepoViewModel(app:Application):AndroidViewModel(app){

    private val repository:GitHubRepoRepository

    init {
        val repoDao=RoomDB.getInstance(app).repoDAO()
        repository=GitHubRepoRepository(repoDao)
    }


}