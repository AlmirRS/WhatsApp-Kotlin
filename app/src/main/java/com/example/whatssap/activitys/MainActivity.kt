package com.example.whatssap.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whatssap.R
import com.example.whatssap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}