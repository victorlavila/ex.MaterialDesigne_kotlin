package com.example.aula25materialdesigne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class Second_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_)

        val actionBar = supportActionBar
        actionBar!!.title = "activity_main"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

}