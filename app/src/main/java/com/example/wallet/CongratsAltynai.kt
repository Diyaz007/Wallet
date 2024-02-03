package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CongratsAltynai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats_altynai)
    }
    fun onClickGoMainAlt5(view : View) {
        val intent = Intent(this, ActivityCreateAccountDaniyar::class.java)
        startActivity(intent)
    }
}