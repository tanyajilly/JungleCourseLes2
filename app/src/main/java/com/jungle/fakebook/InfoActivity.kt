package com.jungle.fakebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class InfoActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvDescription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        tvTitle = findViewById(R.id.title)
        tvDescription = findViewById(R.id.description)

        val title = intent.getStringExtra(TITLE_EXTRA).toString()
        val description = intent.getStringExtra(DESCR_EXTRA).toString()

        tvTitle.text = title
        tvDescription.text = description

    }
}