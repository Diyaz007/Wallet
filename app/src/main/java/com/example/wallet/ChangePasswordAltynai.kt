package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ChangePasswordAltynai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password_altynai)
    }
    fun onClickGoMainAlt4(view : View) {
        val intent = Intent(this, IslamConvert::class.java)
        startActivity(intent)
    }
}