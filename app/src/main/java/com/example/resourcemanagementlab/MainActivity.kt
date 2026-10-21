package com.example.resourcemanagementlab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settingsButton = findViewById<Button>(R.id.settingsButton)
        settingsButton.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        // Read the username preference
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        val username = prefs.getString("username", getString(R.string.username_default))
        findViewById<TextView>(R.id.usernameDisplayTextView).text = username
    }
}
