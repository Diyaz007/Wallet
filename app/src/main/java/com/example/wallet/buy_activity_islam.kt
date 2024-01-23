package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class buy_activity_islam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_islam)
    }

    fun onClickGoMain(view : View) {
        val intent = Intent(this, convert_islam::class.java)
        startActivity(intent)
    }
}