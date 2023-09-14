package com.sleep.android_playground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sleep.android_playground.databinding.ActivityMainBinding
import com.sleep.android_playground.notification.NotificationActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNotification.setOnClickListener { startActivity(Intent(this, NotificationActivity::class.java)) }
    }
}