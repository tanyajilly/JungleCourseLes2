package com.jungle.fakebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jungle.fakebook.adapter.NoteAdapter
import com.jungle.fakebook.data.NoteModel
import com.jungle.fakebook.data.ToDoItemModel

class InfoActivity : AppCompatActivity() {

    private lateinit var rvNotes: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        rvNotes = findViewById(R.id.rvNotes)

        val toDoList1 = listOf(
            ToDoItemModel("Milk", true),
            ToDoItemModel("Cheese", false),
            ToDoItemModel("Meat", false),
        )

        rvNotes.adapter = NoteAdapter(
            listOf(
                NoteModel( "Shopping", null, toDoList1),
                NoteModel( "Films for evening", "Film1, Film2, Film3"),
                NoteModel( "Books from Mike", "Book1, Book2, Book3"),
                NoteModel( "My top 3 laptops", "Lenovo, HP, Macbook"),
                NoteModel( "Note 1", "Milk, cheese, meat"),
                NoteModel("Films for evening", "Film1, Film2, Film3"),
                NoteModel( "Books from Mike", "Book1, Book2, Book3"),
                NoteModel( "My top 3 laptops", "Lenovo, HP, Macbook"),
                NoteModel( "Note 1", "Milk, cheese, meat"),
                NoteModel( "Films for evening", "Film1, Film2, Film3"),
                NoteModel( "Books from Mike", "Book1, Book2, Book3"),
                NoteModel( "My top 3 laptops", "Lenovo, HP, Macbook"),
                NoteModel( "Note 1", "Milk, cheese, meat"),
                NoteModel("Films for evening", "Film1, Film2, Film3"),
                NoteModel("Books from Mike", "Book1, Book2, Book3"),
                NoteModel("My top 3 laptops", "Lenovo, HP, Macbook"),
            )
        )

        rvNotes.layoutManager = GridLayoutManager(this,2)

    }
}