package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnvarCryptoMainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anvar_crypto_main4)
    }
    fun onClickGoBackToMainAnvarFromMainAnvar4(view: View) {
        val intent = Intent(this, AnvarCryptoMainActivity::class.java)
        startActivity(intent)
    }
}