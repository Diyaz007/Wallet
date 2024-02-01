package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class confirmation_code : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation_code)
    }
    fun onClickGoMainAlt3(view : View) {
        val intent = Intent(this, changepasswordaltynai::class.java)
        startActivity(intent)
    }
}