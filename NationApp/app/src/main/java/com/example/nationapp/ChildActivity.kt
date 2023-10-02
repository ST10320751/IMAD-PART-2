package com.example.nationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ChildActivity : AppCompatActivity() {
    lateinit var btnPrev4: Button
    lateinit var btnNext4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)

        btnPrev4 = findViewById(R.id.prev4)
        btnPrev4.setOnClickListener{
            val intent = Intent(this, LifeSkillsActivity::class.java)

            startActivity(intent)
        }
        btnNext4 = findViewById(R.id.next4)
        btnNext4.setOnClickListener{
            val intent = Intent(this, CookingActivity::class.java)

            startActivity(intent)
        }
    }
}