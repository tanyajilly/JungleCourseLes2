package com.jungle.fakebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jungle.fakebook.adapter.NoteAdapter
import com.jungle.fakebook.data.NoteModel

class MainActivity : AppCompatActivity() {

    private lateinit var rvNotes: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNotes = findViewById(R.id.rvNotes)

        rvNotes.adapter = NoteAdapter(
            listOf(
                NoteModel("yesterday", "Note 1", "Milk, cheese, meat"),
                NoteModel("today", "Films for evening", "Film1, Film2, Film3"),
                NoteModel("yesterday", "Books from Mike", "Book1, Book2, Book3"),
                NoteModel("yesterday", "My top 3 laptops", "Lenovo, HP, Macbook"),
                NoteModel("yesterday", "Note 1", "Milk, cheese, meat"),
                NoteModel("today", "Films for evening", "Film1, Film2, Film3"),
                NoteModel("yesterday", "Books from Mike", "Book1, Book2, Book3"),
                NoteModel("yesterday", "My top 3 laptops", "Lenovo, HP, Macbook"),
                NoteModel("yesterday", "Note 1", "Milk, cheese, meat"),
                NoteModel("today", "Films for evening", "Film1, Film2, Film3"),
                NoteModel("yesterday", "Books from Mike", "Book1, Book2, Book3"),
                NoteModel("yesterday", "My top 3 laptops", "Lenovo, HP, Macbook"),
                NoteModel("yesterday", "Note 1", "Milk, cheese, meat"),
                NoteModel("today", "Films for evening", "Film1, Film2, Film3"),
                NoteModel("yesterday", "Books from Mike", "Book1, Book2, Book3"),
                NoteModel("yesterday", "My top 3 laptops", "Lenovo, HP, Macbook"),
            )
        )

        rvNotes.layoutManager = GridLayoutManager(this,2)

    }
}