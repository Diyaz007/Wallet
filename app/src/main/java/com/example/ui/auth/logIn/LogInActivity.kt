package com.example.ui.auth.logIn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.signIn.CreateAccountActivity
import com.example.wallet.R

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_back_altynai)
    }
    fun onClickGoToPassResetAlt(view : View) {
        val intent = Intent(this, PassworReset::class.java)
        startActivity(intent)
    }
    fun onClickGoToCreateAccount(view : View) {
        val intent = Intent(this, CreateAccountActivity::class.java)
        startActivity(intent)
    }
}