package com.karishma.biometriclogin.auth
import android.os.Bundle
import android.preference.PreferenceFragment
import com.karishma.biometriclogin.R

class SettingsFragment : PreferenceFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addPreferencesFromResource(R.xml.preferences)

    }

}
