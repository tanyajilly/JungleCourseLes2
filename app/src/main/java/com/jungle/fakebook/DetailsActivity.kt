package com.jungle.fakebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jungle.fakebook.adapter.ToDoAdapter
import com.jungle.fakebook.data.NoteModel

class DetailsActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvDescription: TextView
    private lateinit var rvToDoList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        tvTitle = findViewById(R.id.title)
        tvDescription = findViewById(R.id.description)
        rvToDoList = findViewById(R.id.rvToDoList)

        val note = intent.getParcelableExtra<NoteModel>(NOTE)
        val description = note?.description

        tvTitle.text = note?.title
        if (description.isNullOrBlank()) {
            tvDescription.visibility = View.GONE
        }
        else {
            // Лучше использовать переменную description
            tvDescription.text = description
        }

        val toDoList = note?.list
        if (toDoList !== null) {
            rvToDoList.adapter = ToDoAdapter(toDoList)
            rvToDoList.layoutManager = LinearLayoutManager(this)
            rvToDoList.isNestedScrollingEnabled = false
        }
    }
}