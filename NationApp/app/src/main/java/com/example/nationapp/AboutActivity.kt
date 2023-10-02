package com.example.nationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
    lateinit var btnCourses: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        btnCourses = findViewById(R.id.button2)
        btnCourses.setOnClickListener {
            val intent = Intent(this, CourseActivity::class.java)

            startActivity(intent)
        }
    }
}