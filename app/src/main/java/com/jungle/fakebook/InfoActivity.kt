package com.jungle.fakebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InfoActivity : AppCompatActivity() {

    private lateinit var tvEmail: TextView
    private lateinit var tvPassword: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        tvEmail = findViewById(R.id.tvEmail)
        tvPassword = findViewById(R.id.tvPassword)

        val email = intent.getStringExtra("email").toString()
        tvEmail.text = email

        val password = intent.getStringExtra("password").toString()
        tvPassword.text = password
    }
}