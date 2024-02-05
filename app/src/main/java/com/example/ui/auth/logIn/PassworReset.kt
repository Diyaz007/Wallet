package com.example.ui.auth.logIn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.signIn.ConfirmationCodeActivity
import com.example.wallet.R

class PassworReset : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_altynai)
    }
    fun onClickGoToConfCodeAlt(view : View) {
        val intent = Intent(this, ConfirmationCodeActivity::class.java)
        startActivity(intent)
    }
    fun onClickGoBackToWelcomeBack(view : View) {
        val intent = Intent(this, LogInActivity::class.java)
        startActivity(intent)
    }
}