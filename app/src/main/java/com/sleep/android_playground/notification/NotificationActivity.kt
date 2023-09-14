package com.sleep.android_playground.notification

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sleep.android_playground.databinding.ActivityNotificationBinding

class NotificationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNotificationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}