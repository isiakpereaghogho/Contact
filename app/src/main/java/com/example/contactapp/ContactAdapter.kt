package com.example.contactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactapp.databinding.ContactItemBinding

class ContactAdapter(
    val contactItems: List<ContactModel>,
    val clickerFnx: (ContactModel) -> Unit
) : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ContactItemBinding)
        : RecyclerView.ViewHolder(binding.root){

        fun bind(contactItems :ContactModel){
            binding.firstName.text = contactItems.firstName
            binding.lastName.text = contactItems.lastName
            binding.root.setOnClickListener {
                clickerFnx(contactItems)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ContactItemBinding = ContactItemBinding.inflate(LayoutInflater.from(parent.context))
    return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(contactItems.get(position))
    }

    override fun getItemCount(): Int {
        return contactItems.size
    }


}

