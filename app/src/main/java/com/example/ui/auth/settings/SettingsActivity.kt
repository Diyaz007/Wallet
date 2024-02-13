package com.example.ui.auth.settings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.home.HomeActivity
import com.example.wallet.R

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anvar_crypto_main3)
    }

    fun onClickGoBackToMainAnvarFromMainAnvar3(view: View) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}
