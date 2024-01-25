package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class IslamGet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_islam_get)
    }

    fun onClickGoMain(view : View) {
        val intent = Intent(this, IslamSend::class.java)
        startActivity(intent)
    }
}