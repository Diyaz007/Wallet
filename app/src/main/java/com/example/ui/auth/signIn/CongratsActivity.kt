package com.example.ui.auth.signIn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.logIn.LogInActivity
import com.example.wallet.R

class CongratsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats_altynai)
    }
    fun onClickGoBackToWelcomeBackFromCongrats(view : View) {
        val intent = Intent(this, LogInActivity::class.java)
        startActivity(intent)
    }
}