package com.example.nationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstAidActivity : AppCompatActivity() {
    lateinit var btnPrev: Button
    lateinit var btnForward: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)

        btnPrev = findViewById(R.id.prev)

        btnPrev.setOnClickListener {
            val intent = Intent(this, CourseActivity:: class.java)

            startActivity(intent)
        }
        btnForward = findViewById(R.id.next)

        btnForward.setOnClickListener{
            val intent = Intent(this, SewingActivity:: class.java)

            startActivity(intent)
        }
    }
}