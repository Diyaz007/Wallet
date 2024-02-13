package com.example.ui.auth.other

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.profile.ActivityProfilePageDaniyar
import com.example.wallet.R

class AddPaymentScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_payment_method_daniyar)
    }
    fun onClickGoTradeHistoryActivity(view: View){
        val intent= Intent(this, TradeScreen::class.java)
        startActivity(intent)

    }

    fun onClickGoBackProfilePageActivity(view: View){
        val intent= Intent(this, ActivityProfilePageDaniyar::class.java)
        startActivity(intent)

    }
}