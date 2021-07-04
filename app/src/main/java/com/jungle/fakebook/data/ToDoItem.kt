package com.jungle.fakebook.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ToDoItemModel(
    val title: String,
    val state: Boolean
) : Parcelable
