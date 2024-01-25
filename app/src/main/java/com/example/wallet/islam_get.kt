package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class islam_get : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_islam_get)
    }

    fun onClickGoMain(view : View) {
        val intent = Intent(this, islam_send::class.java)
        startActivity(intent)
    }
}