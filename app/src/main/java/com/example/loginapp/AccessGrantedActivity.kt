package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AccessGrantedActivity : AppCompatActivity() {

    private lateinit var textWelcome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_access_granted)

        textWelcome = findViewById(R.id.textWelcome)
        val username = intent.getStringExtra("username")

        textWelcome.text = "Welcome, ${username}!"
    }
}