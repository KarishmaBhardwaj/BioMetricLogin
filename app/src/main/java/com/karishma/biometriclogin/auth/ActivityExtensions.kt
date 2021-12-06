package com.karishma.biometriclogin.auth

import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

fun AppCompatActivity.showToast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}