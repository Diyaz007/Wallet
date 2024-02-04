package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WelcomeBackAltynai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_back_altynai)
    }
    fun onClickGoToPassResetAlt(view : View) {
        val intent = Intent(this, PasswordAltynai::class.java)
        startActivity(intent)
    }
    fun onClickGoToCreateAccount(view : View) {
        val intent = Intent(this, ActivityCreateAccountDaniyar::class.java)
        startActivity(intent)
    }
}