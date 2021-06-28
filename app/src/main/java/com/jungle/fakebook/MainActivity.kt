package com.jungle.fakebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var signInBtn: Button
    private var editTextEmail: EditText? = null
    private var editTextPass: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signInBtn = findViewById(R.id.btnSignIn)
        editTextEmail = findViewById(R.id.etEmail)
        editTextPass = findViewById(R.id.etPassword)

        signInBtn.setOnClickListener {
            val email = editTextEmail?.text.toString()
            val password = editTextPass?.text.toString()
            if (email.isEmpty()) {
                Toast.makeText(this, "Enter email", Toast.LENGTH_SHORT).show()
            }

            if (password.isEmpty()) {
                Toast.makeText(this, "Enter your password", Toast.LENGTH_SHORT).show()
            }

            if(email.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, InfoActivity::class.java)
                intent.putExtra("email", email)
                intent.putExtra("password", password)
                startActivity(intent)
            }
        }
    }
}