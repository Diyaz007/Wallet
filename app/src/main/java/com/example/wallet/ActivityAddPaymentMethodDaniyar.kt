package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityAddPaymentMethodDaniyar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_payment_method)
    }

    fun onClickGoTradeHistoryActivity(view: View){
        val intent= Intent(this,ActivityTradeHistoryDaniyar::class.java)
        startActivity(intent)

    }

    fun onClickGoBackProfilePAgeActivity(view: View){
        val intent= Intent(this,ActivityProfilePageDaniyar::class.java)
        startActivity(intent)

    }

}