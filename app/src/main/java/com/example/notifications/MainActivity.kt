package com.example.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notifications.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttondurum.setOnClickListener {
            val intent=Intent(this, DurumaBagliBildirim::class.java)
            startActivity(intent)
        }
        binding.button2.setOnClickListener {
            val intent=Intent(this, InternetTabanliBildirim::class.java)
            startActivity(intent)
        }
        binding.button3.setOnClickListener {
            val intent=Intent(this, GeriSayimSayaci::class.java)
            startActivity(intent)
        }
    }
}