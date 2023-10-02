package com.example.nationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CourseActivity : AppCompatActivity() {
    lateinit var btnFirst: Button
    lateinit var btnSewing: Button
    lateinit var btnLand: Button
    lateinit var btnLife: Button
    lateinit var btnChild: Button
    lateinit var btnGarden: Button
    lateinit var btnCook: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        btnFirst = findViewById (R.id.firstaid)
        btnFirst.setOnClickListener {
            val intent = Intent(this, FirstAidActivity::class.java)

            startActivity(intent)
        }

        btnSewing = findViewById (R.id.sewing)
        btnSewing.setOnClickListener {
            val intent = Intent(this, SewingActivity::class.java)

            startActivity(intent)
        }

        btnLand = findViewById (R.id.land)
        btnLand.setOnClickListener {
            val intent = Intent(this, FirstAidActivity::class.java)

            startActivity(intent)
        }

        btnLife = findViewById (R.id.lifeskills)
        btnLife.setOnClickListener {
            val intent = Intent(this, FirstAidActivity::class.java)

            startActivity(intent)
        }

        btnChild = findViewById (R.id.child)
        btnChild.setOnClickListener {
            val intent = Intent(this, FirstAidActivity::class.java)

            startActivity(intent)
        }

        btnGarden = findViewById (R.id.garden)
        btnGarden.setOnClickListener {
            val intent = Intent(this, FirstAidActivity::class.java)

            startActivity(intent)
        }

        btnCook = findViewById (R.id.cook)
        btnCook.setOnClickListener {
            val intent = Intent(this, FirstAidActivity::class.java)

            startActivity(intent)
        }

    }
}