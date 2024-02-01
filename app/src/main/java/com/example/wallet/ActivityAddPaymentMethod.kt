package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityAddPaymentMethod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_payment_method)
    }

    fun onClickGoTradeHistoryActivity(view: View){
        val intent= Intent(this,Activity_Trade_History::class.java)
        startActivity(intent)

    }

    fun onClickGoBackProfilePAgeActivity(view: View){
        val intent= Intent(this,Activity_profile_Page_daniyar::class.java)
        startActivity(intent)

    }

}