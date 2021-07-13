package com.example.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contactapp.databinding.ActivityMainBinding

class ContactProfile : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var profile: ContactProfile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}