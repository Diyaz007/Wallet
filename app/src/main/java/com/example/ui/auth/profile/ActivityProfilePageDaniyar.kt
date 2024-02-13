package com.example.ui.auth.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.logIn.LogInActivity
import com.example.ui.auth.other.AddPaymentScreen
import com.example.wallet.R

class ActivityProfilePageDaniyar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page_daniyar)
    }
    fun onClickGoToAddPayment(view: View){
        val intent= Intent(this, AddPaymentScreen::class.java)
        startActivity(intent)

    }

    fun onClickGoBackToWelcomeBackFromProfPage(view: View){
        val intent= Intent(this, LogInActivity::class.java)
        startActivity(intent)

    }

}