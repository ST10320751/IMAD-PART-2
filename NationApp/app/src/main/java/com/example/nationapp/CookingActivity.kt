package com.example.nationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CookingActivity : AppCompatActivity() {
    lateinit var btnPrev5: Button
    lateinit var btnNext5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooking)

        btnPrev5 = findViewById(R.id.prev5)
        btnPrev5.setOnClickListener{
            val intent = Intent(this, ChildActivity::class.java)

            startActivity(intent)
        }
        btnNext5 = findViewById(R.id.next5)
        btnNext5.setOnClickListener{
            val intent = Intent(this, GardenActivity::class.java)

            startActivity(intent)
        }
    }
}