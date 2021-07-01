package com.jungle.fakebook.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jungle.fakebook.DESCR_EXTRA
import com.jungle.fakebook.InfoActivity
import com.jungle.fakebook.R
import com.jungle.fakebook.TITLE_EXTRA
import com.jungle.fakebook.data.NoteModel

class NoteAdapter (
    val noteList: List<NoteModel>
): RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    inner class NoteViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.title)
        val tvDescription: TextView = view.findViewById(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent, false))
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = noteList[position]
        holder.tvTitle.text = note.title
        holder.tvDescription.text = note.description

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, InfoActivity::class.java)
            intent.putExtra(TITLE_EXTRA, note.title)
            intent.putExtra(DESCR_EXTRA, note.description)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return noteList.size
    }
}