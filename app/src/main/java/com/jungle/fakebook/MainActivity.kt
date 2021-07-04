package com.jungle.fakebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ScrollView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var signInBtn: Button
    private lateinit var emailInputLayout: TextInputLayout
    private lateinit var emailEditText: EditText
    private lateinit var scrollView: ScrollView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signInBtn = findViewById(R.id.btnSignIn)
        emailInputLayout = findViewById(R.id.tilEmail)
        emailEditText = findViewById(R.id.etEmail)
        scrollView = findViewById(R.id.scrollView)

        emailEditText.setOnFocusChangeListener { v, hasFocus ->
            emailInputLayout.error = null
            scrollView.postDelayed({ scrollView.fullScroll(View.FOCUS_DOWN) }, 250)
        }

        emailEditText.setOnClickListener {
            emailInputLayout.error = null
            scrollView.postDelayed({ scrollView.fullScroll(View.FOCUS_DOWN) }, 250)
        }

        signInBtn.setOnClickListener {
            val email = emailEditText.text.toString()
            if (email.isBlank()) {
                emailInputLayout.error = getString(R.string.email_error)
            }
            else {
                val intent = Intent(this, InfoActivity::class.java)
                startActivity(intent)
            }
        }
    }
}