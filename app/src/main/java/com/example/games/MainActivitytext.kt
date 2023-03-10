package com.example.games

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivitytext : AppCompatActivity() {
    private var variable1="one"
    private var variable2="two"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitytext)
        val editText = findViewById<EditText>(R.id.editText)
        val button: Button =findViewById(R.id.submit)
        button.setOnClickListener {
            val text = editText.text
            val textstr=text.toString()
            when(textstr)
            {
                variable1->{
                    val `in` = Intent(this@MainActivitytext,Singleplayer::class.java)
                    startActivity(`in`)
                }
                variable2->{
                    val `in` = Intent(this@MainActivitytext,Doubleplayer::class.java)
                    startActivity(`in`)
                }

                else->{
                    val `in` = Intent(this@MainActivitytext,Multipleplayer::class.java)
                    startActivity(`in`)
                }

            }
        }

    }
}