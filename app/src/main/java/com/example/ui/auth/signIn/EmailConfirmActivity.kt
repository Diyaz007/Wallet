package com.example.ui.auth.signIn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.other.GoBackScreen
import com.example.wallet.R

class EmailConfirmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_confirmation_daniyar)
    }
    fun onClickGoBackToCreateAccount2(view: View){
        val intent= Intent(this, ActivityCreateAccountSecondDaniyar::class.java)
        startActivity(intent)

    }
    fun onClickGoBackActivity(view: View){
        val intent= Intent(this, GoBackScreen::class.java)
        startActivity(intent)

    }
}