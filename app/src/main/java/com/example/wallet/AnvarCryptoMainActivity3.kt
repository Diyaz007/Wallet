package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnvarCryptoMainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anvar_crypto_main3)
    }
    fun onClickGoMainAnvarMainAct(view : View) {
        val intent = Intent(this,AnvarCryptoMainActivity::class.java)
        startActivity(intent)
    }
}