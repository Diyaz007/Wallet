package com.example.ui.auth.signIn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.other.TradeScreen
import com.example.ui.auth.profile.AnvarProfilePageFive
import com.example.wallet.R

class CreatePasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_password_daniyar)
    }

    fun onClickGoToBackupOf(view: View){
        val intent= Intent(this, AnvarProfilePageFive::class.java)
        startActivity(intent)

    }

    fun onClickGoToBackToTradeHistory(view: View){
        val intent= Intent(this, TradeScreen::class.java)
        startActivity(intent)

    }
}