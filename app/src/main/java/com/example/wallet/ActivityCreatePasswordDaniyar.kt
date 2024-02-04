package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityCreatePasswordDaniyar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_password_daniyar)
    }

    fun onClickGoToBackupOf(view: View){
        val intent= Intent(this, AnvarProfilePageFive::class.java)
        startActivity(intent)

    }

    fun onClickGoToBackToTradeHistory(view: View){
        val intent= Intent(this,ActivityTradeHistoryDaniyar::class.java)
        startActivity(intent)

    }
}