package com.example.youtubebottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.youtubebottomnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNav.background = null
        binding.bottomNav.menu.getItem(2).isEnabled = false

        binding.add.setOnClickListener {
            Toast.makeText(this, "ADD", Toast.LENGTH_SHORT).show()
            binding.bottomNav.selectedItemId = R.id.placeholder
        }

        binding.bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.search -> {
                    Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.profile -> {
                    Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> {
                    Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
                    true
                }
            }
        }
    }
}