package com.example.contactapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class ContactViewModel: ViewModel() {

    fun addContactItems(
        contactItem: ContactModel,
        database: ContactDatabase){

        database.contactDao().addContactItems(contactItem)
    }

    fun getAllContactItems(database: ContactDatabase)
            : LiveData<List<ContactModel>> {
        return database.contactDao().getAllContactItems()
    }




}
