package com.example.nationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SewingActivity : AppCompatActivity() {
    lateinit var btnPrev1: Button
    lateinit var btnNext1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewing)

        btnPrev1 = findViewById(R.id.prev1)
        btnPrev1.setOnClickListener{
            val intent = Intent(this, FirstAidActivity::class.java)

            startActivity(intent)
        }
        btnNext1 = findViewById(R.id.next1)
        btnNext1.setOnClickListener{
            val intent = Intent(this, LandActivity::class.java)

            startActivity(intent)
        }
    }
}