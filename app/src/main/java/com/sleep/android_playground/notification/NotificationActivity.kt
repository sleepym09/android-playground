package com.sleep.android_playground.notification

import android.Manifest
import android.app.Notification
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationChannelCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.sleep.android_playground.R
import com.sleep.android_playground.databinding.ActivityNotificationBinding

class NotificationActivity : AppCompatActivity() {

    companion object {
        const val BASIC_CHANNEL_ID = "1"
        const val PROGRESS_CHANNEL_ID = "2"

        const val REQUEST_SHOW_BASIC_NOTIFICATION = 100

        const val REQUEST_SHOW_PROGRESS_NOTIFICATION = 101

        const val BASIC_NOTIFICATION_ID = 1

        const val PROGRESS_NOTIFICATION_ID = 2
    }

    private lateinit var binding: ActivityNotificationBinding

    private lateinit var notificationManager: NotificationManagerCompat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        notificationManager = NotificationManagerCompat.from(this)
        binding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val basicChannel = NotificationChannelCompat.Builder(BASIC_CHANNEL_ID, NotificationManagerCompat.IMPORTANCE_DEFAULT)
                .setName("Basic Channel Title")
                .setDescription("Basic Channel Desc")
                .build()
            notificationManager.createNotificationChannel(basicChannel)

            val progressChannel = NotificationChannelCompat.Builder(PROGRESS_CHANNEL_ID, NotificationManagerCompat.IMPORTANCE_DEFAULT)
                .setName("Progress Channel Title")
                .setDescription("Progress Channel Desc")
                .build()
            notificationManager.createNotificationChannel(progressChannel)
        }

        binding.btnBasic.setOnClickListener {
            showNotification(generateBasicNotification(), REQUEST_SHOW_BASIC_NOTIFICATION, BASIC_NOTIFICATION_ID)
        }

        binding.btnProgress.setOnClickListener {
            showNotification(generateProgressNotification(), REQUEST_SHOW_PROGRESS_NOTIFICATION, PROGRESS_NOTIFICATION_ID)
        }
    }

    private fun showNotification(notification: Notification, requestCode: Int, notificationId: Int) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU
            || ActivityCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED
        ) {
            notificationManager.notify(notificationId, notification)
            return
        }
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.POST_NOTIFICATIONS), requestCode)
    }

    private fun generateBasicNotification(): Notification {
        return NotificationCompat.Builder(this, BASIC_CHANNEL_ID).apply {
            setContentTitle("Basic Title")
            setContentText("Basic Content")
            setSmallIcon(R.mipmap.ic_launcher)
            priority = NotificationCompat.PRIORITY_DEFAULT
        }.build()
    }

    private fun generateProgressNotification(): Notification {
        return NotificationCompat.Builder(this, PROGRESS_CHANNEL_ID).apply {
            setContentTitle("Progress Title")
            setContentText("Progress Content")
            setSmallIcon(R.mipmap.ic_launcher)
            priority = NotificationCompat.PRIORITY_DEFAULT
            setProgress(100, 50, false)
        }.build()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {
            when (requestCode) {
                REQUEST_SHOW_BASIC_NOTIFICATION -> {
                    notificationManager.notify(BASIC_NOTIFICATION_ID, generateBasicNotification())
                }

                REQUEST_SHOW_PROGRESS_NOTIFICATION -> {
                    notificationManager.notify(PROGRESS_NOTIFICATION_ID, generateProgressNotification())
                }
            }
        }
    }
}