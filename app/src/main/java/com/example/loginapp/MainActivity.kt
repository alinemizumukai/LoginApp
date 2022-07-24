package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editLogin: EditText
    private lateinit var editPassword: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editLogin = findViewById(R.id.editLogin)
        editPassword = findViewById(R.id.editPassword)
        button = findViewById(R.id.button)

        button.setOnClickListener{ validate() }
    }

    fun validate(){
        val login = editLogin.text.toString()
        val password = editPassword.text.toString()

        if (password == "1234"){
            val intent = Intent(this, AccessGrantedActivity::class.java)
            intent.putExtra("username", login)
            startActivity(intent)
        }else{
            val intent = Intent(this, AccessDeniedActivity::class.java)
            startActivity(intent)
        }
    }
}