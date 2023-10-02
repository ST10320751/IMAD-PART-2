package com.example.nationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LandActivity : AppCompatActivity() {
    lateinit var btnPrev2: Button
    lateinit var btnNext2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_land)

        btnPrev2 = findViewById(R.id.prev2)

        btnPrev2.setOnClickListener{
            val intent = Intent(this, SewingActivity::class.java)

            startActivity(intent)
        }
        btnNext2 = findViewById(R.id.next2)

        btnNext2.setOnClickListener{
            val intent = Intent(this, LifeSkillsActivity::class.java)

            startActivity(intent)
        }
    }
}