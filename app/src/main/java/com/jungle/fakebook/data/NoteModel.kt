package com.jungle.fakebook.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NoteModel(
    val title: String,
    val description: String?,
    val list: List<ToDoItemModel>? = null
) : Parcelable
