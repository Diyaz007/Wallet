package com.example.ui.auth.signIn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.wallet.R

class ActivityCreateAccountSecondDaniyar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account_second_daniyar)
    }
    fun onClickGoToEmail(view: View) {
        val intent = Intent(this, EmailConfirmActivity::class.java)
        startActivity(intent)
    }
    fun onClickGoBackAccCreate(view: View){
        val intent= Intent(this, CreateAccountActivity::class.java)
        startActivity(intent)

    }
}