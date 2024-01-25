package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnvarCryptoMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anvar_crypto_main)
    }

    fun onClickGoMain(view: View) {
        val intent = Intent(this, AnvarCryptoMainActivity3::class.java)
        startActivity(intent)
    }
    fun onClickGoMainPage4 (view: View) {
        val intent = Intent(this, AnvarCryptoMainActivity4::class.java)
        startActivity(intent)
    }
    fun onClickGoMainPage2 (view: View) {
        val intent = Intent(this, AnvarCryptoMainActivity2::class.java)
        startActivity(intent)
    }
}