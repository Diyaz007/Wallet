package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class
password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)
    }
    fun onClickGoMainAlt2(view : View) {
        val intent = Intent(this, confirmation_code::class.java)
        startActivity(intent)
    }
}