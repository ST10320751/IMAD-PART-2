package com.example.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnToast = findViewById(R.id.Toast) as Button
        var aSwitch = findViewById(R.id.Switch) as Switch

        btnToast.setOnClickListener {
            Toast.makeText(this, "Hi there! Let's Toast", Toast.LENGTH_LONG).show()
        }
        aSwitch.setOnCheckedChangeListener { compoundButton, b ->

            if (b) {
                Toast.makeText(this, "Wi-Fi ON", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Wi-Fi OFF", Toast.LENGTH_SHORT).show()
            }
        }

    }
}




