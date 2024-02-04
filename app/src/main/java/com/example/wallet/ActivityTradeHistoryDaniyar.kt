package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityTradeHistoryDaniyar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trade_history_daniyar)
    }
    fun onClickGoToBackToAddPayment(view: View){
        val intent= Intent(this,ActivityAddPaymentMethodDaniyar::class.java)
        startActivity(intent)

    }

    fun onClickGoToCreatePassword(view: View){
        val intent= Intent(this,ActivityCreatePasswordDaniyar::class.java)
        startActivity(intent)

    }
}