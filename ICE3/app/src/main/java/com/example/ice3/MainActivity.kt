package com.example.ice3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val priceEditText = findViewById<EditText>(R.id.priceEditText)
        val quantityEditText = findViewById<EditText>(R.id.quantityEditText)
        val studentSwitch = findViewById<Switch>(R.id.studentSwitch)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        calculateButton.setOnClickListener {
            val price = priceEditText.text.toString().toFloatOrNull() ?: 0f
            val quantity = quantityEditText.text.toString().toIntOrNull() ?: 0
            val isStudent = studentSwitch.isChecked

            val discount = if (quantity > 10 || isStudent) 0.05f else 0f
            val totalAmount = price * quantity
            val discountAmount = totalAmount * discount
            val amountDue = totalAmount - discountAmount

            val formattedAmount = String.format(Locale.getDefault(), "ZAR %.2f", amountDue)

            resultTextView.text = "Amount due: $formattedAmount"
        }
    }
}
