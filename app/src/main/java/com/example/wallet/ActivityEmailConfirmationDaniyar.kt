package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityEmailConfirmationDaniyar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_confirmation_daniyar)
    }
    fun onClickGoBackCreateAccount2(view: View){
        val intent= Intent(this,ActivityCreateAccountSecondDaniyar::class.java)
        startActivity(intent)

    }
    fun onClickGoBackActivity(view: View){
        val intent= Intent(this,ActivityGoBackDaniyar::class.java)
        startActivity(intent)

    }
}