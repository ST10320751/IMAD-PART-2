package com.example.nationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        btnNext = findViewById(R.id.button)
        
            btnNext.setOnClickListener {
                val intent= Intent (this, AboutActivity::class.java)

                startActivity(intent)
            }
        }
    }




