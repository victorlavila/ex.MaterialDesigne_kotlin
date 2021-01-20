package com.example.aula25materialdesigne

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initSistem()
    }

    private fun initSistem() {
        val floatButton = findViewById<FloatingActionButton>(R.id.foatButton)

        val editText = findViewById<AppCompatEditText>(R.id.input_text)
        floatButton.isEnabled = true

        floatButton.setOnClickListener {
            val text = editText.text.toString()
            if(text.length < 8){
                Snackbar.make(floatButton, "Texto inválido", Snackbar.LENGTH_INDEFINITE).setAction("fechar"
                ){
                    Toast.makeText(this, "Texto inválido", Toast.LENGTH_LONG).show()
                }.show()
            } else {
                Snackbar.make(floatButton, text, Snackbar.LENGTH_LONG).show()

                val intent = Intent(this, Second_Activity::class.java)
                startActivity(intent)
            }
        }
    }

}