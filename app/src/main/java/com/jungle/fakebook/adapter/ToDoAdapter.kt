package com.jungle.fakebook.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.jungle.fakebook.R
import com.jungle.fakebook.data.ToDoItemModel

class ToDoAdapter(
    val ToDoList: List<ToDoItemModel>
): RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {
    inner class ToDoViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val toDoItem: CheckBox = view.findViewById(R.id.checkBox)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        return ToDoViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.checkbox_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        val item = ToDoList[position]
        holder.toDoItem.isChecked = item.state
        holder.toDoItem.text = item.title
    }

    override fun getItemCount(): Int {
        return ToDoList.size
    }
}