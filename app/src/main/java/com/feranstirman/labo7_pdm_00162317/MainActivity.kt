package com.feranstirman.labo7_pdm_00162317

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.feranstirman.labo7_pdm_00162317.database.adapters.ReposAdapter
import com.feranstirman.labo7_pdm_00162317.database.entities.GitHubRepo
import com.feranstirman.labo7_pdm_00162317.database.viewmodels.GitHupRepoViewModel
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ReposAdapter
    lateinit var viewModel:GitHupRepoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun bind(){
        adapter= ReposAdapter(ArrayList())
        viewModel=ViewModelProviders.of(this).get(GitHupRepoViewModel::class.java)
        recyclerid.apply {
            adapter=this@MainActivity.adapter
            layoutManager=LinearLayoutManager(this@MainActivity)
        }
        viewModel.getAll().observe(this, Observer {
            adapter.updateList(it)
        })
        btn_add.setOnClickListener {
            viewModel.insert(GitHubRepo(et_repo_name.text.toString()))
        }
    }
}
