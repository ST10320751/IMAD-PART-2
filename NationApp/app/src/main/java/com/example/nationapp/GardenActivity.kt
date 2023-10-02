package com.example.nationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GardenActivity : AppCompatActivity() {
    lateinit var btnPrev6: Button
    lateinit var btnNext6: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garden)

        btnPrev6 = findViewById(R.id.prev6)
        btnPrev6.setOnClickListener{
            val intent = Intent(this, CookingActivity::class.java)

            startActivity(intent)
        }
        btnNext6 = findViewById(R.id.next6)
        btnNext6.setOnClickListener{
            val intent = Intent(this, ContactActivity::class.java)

            startActivity(intent)
        }
    }
}