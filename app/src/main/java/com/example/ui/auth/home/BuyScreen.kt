package com.example.ui.auth.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.wallet.R

class BuyScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_islam)
    }

    fun onClickGoBackToMainAnvarFromBuy(view : View) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}