package com.example.gitproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gitproject1.databinding.ActivityMainBinding
import java.util.*
import java.text.SimpleDateFormat

class MainActivity : AppCompatActivity() {

    lateinit var dateTime: String
    lateinit var calendar:Calendar
    lateinit var simpleDateFormat: SimpleDateFormat


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        calendar = Calendar.getInstance()
        simpleDateFormat = SimpleDateFormat("dd/MM/yyyy KK:mm:ss aaa z","Locale.US")
        dateTime = simpleDateFormat.format(calendar.time).toString()


    binding.localTime.text = dateTime

    }




}