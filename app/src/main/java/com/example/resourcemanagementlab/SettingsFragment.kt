package com.example.resourcemanagementlab

import android.os.Bundle
import android.util.Log
import androidx.preference.PreferenceFragmentCompat

class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)

        // Listen to a specific preference change
        val notificationsPref = findPreference<androidx.preference.SwitchPreferenceCompat>("notifications")
        notificationsPref?.setOnPreferenceChangeListener { _, newValue ->
            val enabled = newValue as Boolean
            Log.d("SettingsFragment", "Notifications enabled: $enabled")
            true // accept the change
        }
    }
}
