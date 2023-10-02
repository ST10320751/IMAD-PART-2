package com.example.mycalculatorapppoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var result: TextView
    private lateinit var num1: EditText
    private lateinit var num2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById(R.id.result)
        num1 = findViewById(R.id.editNum1)
        num2 = findViewById(R.id.editNum2)

        val addButton: Button = findViewById(R.id.button1)
        val subtractButton: Button = findViewById(R.id.button2)
        val multiplyButton: Button = findViewById(R.id.button3)
        val divideButton: Button = findViewById(R.id.button4)

        addButton.setOnClickListener { performOperation(Operation.ADD) }
        subtractButton.setOnClickListener { performOperation(Operation.SUBTRACT) }
        multiplyButton.setOnClickListener { performOperation(Operation.MULTIPLY) }
        divideButton.setOnClickListener { performOperation(Operation.DIVIDE) }
    }

    private fun performOperation(operation: Operation) {
        val num1 = input1.text.toString().toDouble()
        val num2 = input2.text.toString().toDouble()
        val operationResult = when (operation) {
            Operation.ADD -> num1 + num2
            Operation.SUBTRACT -> num1 - num2
            Operation.MULTIPLY -> num1 * num2
            Operation.DIVIDE -> num1 / num2
        }
        result.text = "$num1 ${operation.symbol} $num2 = $operationResult"
    }

    enum class Operation(val symbol: String) {
        ADD("+"),
        SUBTRACT("-"),
        MULTIPLY("*"),
        DIVIDE("/")
    }
}
