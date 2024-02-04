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

    fun onClickGoToMainActivity4Anvar(view: View) {
        val intent = Intent(this, AnvarCryptoMainActivity4::class.java)
        startActivity(intent)
    }

    fun onClickGoToMainActivity3Anvar(view: View) {
        val intent = Intent(this, AnvarCryptoMainActivity3::class.java)
        startActivity(intent)
    }

    fun onClickGoToMainActivity2Anvar(view: View) {
        val intent = Intent(this, AnvarCryptoMainActivity2::class.java)
        startActivity(intent)
    }

    fun onClickGoToProfilePageFromMainAnvar(view: View) {
        val intent = Intent(this, ActivityProfilePageDaniyar::class.java)
        startActivity(intent)
    }

    fun onClickGoToSendPageFromMainAnvar(view: View) {
        val intent = Intent(this, IslamSend::class.java)
        startActivity(intent)
    }

    fun onClickGoToReceivePageFromMainAnvar(view: View) {
        val intent = Intent(this, IslamGet::class.java)
        startActivity(intent)
    }

    fun onClickGoToBuyPageFromMainAnvar(view: View) {
        val intent = Intent(this, IslamBuy::class.java)
        startActivity(intent)
    }

    fun onClickGoToConvertPageFromMainAnvar(view: View) {
        val intent = Intent(this, IslamConvert::class.java)
        startActivity(intent)
    }
}