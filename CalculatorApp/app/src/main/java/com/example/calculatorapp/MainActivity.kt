package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.absoluteValue
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    private lateinit var number1EditText: EditText
    private lateinit var number2EditText: EditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1EditText = findViewById(R.id.number1EditText)
        number2EditText = findViewById(R.id.number2EditText)
        resultTextView = findViewById(R.id.resultTextView)

        val addButton: Button = findViewById(R.id.addButton)
        val subtractButton: Button = findViewById(R.id.subtractButton)
        val multiplyButton: Button = findViewById(R.id.multiplyButton)
        val divideButton: Button = findViewById(R.id.divideButton)
        val sqrtButton: Button = findViewById(R.id.sqrtButton)
        val powerButton: Button = findViewById(R.id.powerButton)

        addButton.setOnClickListener { performOperation("+") }
        subtractButton.setOnClickListener { performOperation("-") }
        multiplyButton.setOnClickListener { performOperation("*") }
        divideButton.setOnClickListener { performOperation("/") }
        sqrtButton.setOnClickListener { calculateSqrt() }
        powerButton.setOnClickListener { calculatePower() }
    }

    private fun performOperation(operator: String) {
        val num1Str = number1EditText.text.toString()
        val num2Str = number2EditText.text.toString()

        if (num1Str.isNotEmpty() && num2Str.isNotEmpty()) {
            val num1 = num1Str.toDouble()
            val num2 = num2Str.toDouble()
            var result = 0.0

            when (operator) {
                "+" -> result = num1 + num2
                "-" -> result = num1 - num2
                "*" -> result = num1 * num2
                "/" -> {
                    if (num2 != 0.0) {
                        result = num1 / num2
                    } else {
                        resultTextView.text = "Error: Division by zero"
                        return
                    }
                }
            }

            resultTextView.text = "$num1 $operator $num2 = $result"
        } else {
            resultTextView.text = "Please enter both numbers"
        }
    }

    private fun calculateSqrt() {
        val num1Str = number1EditText.text.toString()

        if (num1Str.isNotEmpty()) {
            val num1 = num1Str.toDouble()
            var result = 0.0

            if (num1 >= 0) {
                result = sqrt(num1)
            } else {
                resultTextView.text = "sqrt($num1) = ${sqrt(num1.absoluteValue)}i"
                return
            }

            resultTextView.text = "sqrt($num1) = $result"
        } else {
            resultTextView.text = "Please enter a number"
        }
    }

    private fun calculatePower() {
        val num1Str = number1EditText.text.toString()
        val num2Str = number2EditText.text.toString()

        if (num1Str.isNotEmpty() && num2Str.isNotEmpty()) {
            val num1 = num1Str.toDouble()
            val num2 = num2Str.toInt()
            var result = num1

            if (num2 >= 0) {
                for (i in 2..num2) {
                    result *= num1
                }
            } else {
                resultTextView.text = "$num1^$num2 = 1/${num1.toDouble().pow(num2.absoluteValue)}"
                return
            }

            resultTextView.text = "$num1^$num2 = $result"
        } else {
            resultTextView.text = "Please enter both numbers"
        }
    }
}


