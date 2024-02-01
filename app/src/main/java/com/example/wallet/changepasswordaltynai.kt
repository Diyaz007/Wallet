package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class changepasswordaltynai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_changepasswordaltynai)
    }

    fun onClickGoMainAlt4(view : View) {
        val intent = Intent(this, congratsaltynai::class.java)
        startActivity(intent)
    }
}