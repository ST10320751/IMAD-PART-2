package com.example.numbercomparison

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var number1EditText: EditText
    private lateinit var number2EditText: EditText
    private lateinit var compareButton: Button
    private lateinit var clearButton: Button
    private lateinit var exitButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1EditText = findViewById(R.id.number1EditText)
        number2EditText = findViewById(R.id.number2EditText)
        compareButton = findViewById(R.id.compareButton)
        clearButton = findViewById(R.id.clearButton)
        exitButton = findViewById(R.id.exitButton)
        resultTextView = findViewById(R.id.resultTextView)

        compareButton.setOnClickListener {
            compareNumbers()
        }

        clearButton.setOnClickListener {
            clearFields()
        }

        exitButton.setOnClickListener {
            finish()
        }
    }

    private fun compareNumbers() {
        val number1Str = number1EditText.text.toString()
        val number2Str = number2EditText.text.toString()

        if (number1Str.isEmpty() || number2Str.isEmpty()) {
            resultTextView.text = "Please enter both numbers."
        } else {
            val number1 = number1Str.toInt()
            val number2 = number2Str.toInt()

            when {
                number1 > number2 -> resultTextView.text = "Number 1 is bigger than Number 2."
                number2 > number1 -> resultTextView.text = "Number 2 is bigger than Number 1."
                else -> resultTextView.text = "Number 1 is equal to Number 2."
            }
        }
    }

    private fun clearFields() {
        number1EditText.text.clear()
        number2EditText.text.clear()
        resultTextView.text = ""
    }
}
