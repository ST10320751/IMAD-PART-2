package com.example.nationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LifeSkillsActivity : AppCompatActivity() {
    lateinit var btnPrev3: Button
    lateinit var btnNext3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_skills)

        btnPrev3 = findViewById(R.id.prev3)
        btnPrev3.setOnClickListener{
            val intent = Intent (this, LandActivity::class.java)

            startActivity(intent)
        }
        btnNext3 = findViewById(R.id.next3)
        btnNext3.setOnClickListener{
            val intent = Intent(this, ChildActivity::class.java)

            startActivity(intent)
        }
    }
}