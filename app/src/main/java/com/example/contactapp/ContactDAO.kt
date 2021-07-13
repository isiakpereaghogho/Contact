package com.example.contactapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ContactDAO {
    @Insert
    fun addContactItems(contactItem: ContactModel)

    @Query("SELECT * from contactmodel")
    fun getAllContactItems(): LiveData<List<ContactModel>>

    @Delete
    fun delete(contactItem: ContactModel)
}