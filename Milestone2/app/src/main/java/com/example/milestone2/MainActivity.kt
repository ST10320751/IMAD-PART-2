package com.example.milestone2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Initialize UI elements
        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)

        // Set a click listener for the login button
        loginButton.setOnClickListener(View.OnClickListener {
            // Handle login logic here
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Perform authentication and navigate to the next screen if successful
            if (authenticateUser(username, password)) {
                // Redirect to the next activity
                // Example: startActivity(Intent(this, NextActivity::class.java))
            } else {
                // Display an error message or handle authentication failure
            }
        })
    }

    // Implement your authentication logic here
    private fun authenticateUser(username: String, password: String): Boolean {
        // Replace this with your actual authentication mechanism
        // Example: Check credentials against a database or API
        return username == "demo" && password == "password"
    }
}
