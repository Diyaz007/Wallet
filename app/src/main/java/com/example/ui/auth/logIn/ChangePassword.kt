package com.example.ui.auth.logIn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.signIn.CongratsActivity
import com.example.ui.auth.signIn.ConfirmationCodeActivity
import com.example.wallet.R

class ChangePassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password_altynai)
    }
    fun onClickGoToCongrats(view : View) {
        val intent = Intent(this, CongratsActivity::class.java)
        startActivity(intent)
    }

    fun onClickGoBackToConfCode(view : View) {
        val intent = Intent(this, ConfirmationCodeActivity::class.java)
        startActivity(intent)
    }
}