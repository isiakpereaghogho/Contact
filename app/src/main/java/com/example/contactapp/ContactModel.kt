package com.example.contactapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ContactModel(
    val firstName: String,
    val lastName: String,

    @PrimaryKey(autoGenerate = true)
    val uid: Int = 0
)
