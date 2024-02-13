package com.example.ui.auth.signIn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.logIn.LogInActivity
import com.example.wallet.R

class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account_daniyar)
    }
    fun onClickGoError(view: View) {
        val intent = Intent(this, ActivityCreateAccountSecondDaniyar::class.java)
        startActivity(intent)
    }

    fun onClickGoBackToWelcomeBackFromCreateAcc(view: View) {
        val intent = Intent(this, LogInActivity::class.java)
        startActivity(intent)
    }
}