package com.example.ui.auth.signIn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.logIn.ChangePassword
import com.example.ui.auth.logIn.PassworReset
import com.example.wallet.R

class ConfirmationCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation_code_altynai)
    }
    fun onClickGoBackToPassReset(view : View) {
        val intent = Intent(this, PassworReset::class.java)
        startActivity(intent)
    }

    fun onClickGoToChangePass(view : View) {
        val intent = Intent(this, ChangePassword::class.java)
        startActivity(intent)
    }
}