package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.view.View
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    lateinit var num1: EditText
    lateinit var num2: EditText
    lateinit var op: EditText
    lateinit var display: TextView

    fun cal(view: View?) {
        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        op = findViewById(R.id.op)
        display = findViewById(R.id.display)

        var inputnum1 = num1.text.toString().toDouble()
        var inputnum2 = num2.text.toString().toDouble()
        var operator = op.text.toString()

        if (operator == "+") {
            var result = inputnum1 + inputnum2
            display.text = result.toString()
        }
        if (operator == "-") {
            var result = inputnum1 - inputnum2
            display.text = result.toString()
        }
        if (operator == "*") {
            var result = inputnum1 * inputnum2
            display.text = result.toString()
        }
        if (operator == "/") {
            var result = inputnum1 / inputnum2
            display.text = result.toString()
        }

    }
}
