package com.jungle.fakebook.adapter

import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.jungle.fakebook.*
import com.jungle.fakebook.data.NoteModel

class NoteAdapter (
    val noteList: List<NoteModel>
): RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    inner class NoteViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.title)
        val tvDescription: TextView = view.findViewById(R.id.description)
        val cvNote: CardView = view.findViewById(R.id.cvNote)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent, false))
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = noteList[position]
        holder.tvTitle.text = note.title
        holder.tvDescription.text = note.description

        val listOfColorIds = listOf(R.color.yellow, R.color.purple, R.color.light_blue, R.color.light_gray)

        val context = holder.itemView.context
        holder.cvNote.setCardBackgroundColor(ContextCompat.getColor(context, listOfColorIds.random()))

//        when((0..3).random()) {
//            0 -> holder.cvNote.setCardBackgroundColor(ContextCompat.getColor(context, R.color.yellow))
//            1 -> holder.cvNote.setCardBackgroundColor(Color.parseColor("#E8DAEF"))
//            2 -> holder.cvNote.setCardBackgroundColor(Color.parseColor("#D6EAF8"))
//            3 -> holder.cvNote.setCardBackgroundColor(Color.parseColor("#F6F4F4"))
//        }

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra(NOTE, note)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return noteList.size
    }
}