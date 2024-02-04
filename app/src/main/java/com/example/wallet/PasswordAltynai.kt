package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PasswordAltynai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_altynai)
    }
    fun onClickGoToConfCodeAlt(view : View) {
        val intent = Intent(this, ConfirmationCodeAltynai::class.java)
        startActivity(intent)
    }
    fun onClickGoBackToWelcomeBack(view : View) {
        val intent = Intent(this, WelcomeBackAltynai::class.java)
        startActivity(intent)
    }
}