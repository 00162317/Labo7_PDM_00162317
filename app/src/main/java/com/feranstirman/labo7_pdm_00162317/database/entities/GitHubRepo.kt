package com.feranstirman.labo7_pdm_00162317.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "repos")
data class GitHubRepo(
    val name:String
){
    @PrimaryKey(autoGenerate = true)
    var id:Long=0
}