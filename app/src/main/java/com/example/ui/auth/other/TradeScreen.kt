package com.example.ui.auth.other

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.signIn.CreatePasswordActivity
import com.example.wallet.R

class TradeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trade_history_daniyar)
    }
    fun onClickGoToBackToAddPayment(view: View){
        val intent= Intent(this, AddPaymentScreen::class.java)
        startActivity(intent)

    }

    fun onClickGoToCreatePassword(view: View){
        val intent= Intent(this, CreatePasswordActivity::class.java)
        startActivity(intent)

    }
}