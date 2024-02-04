package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnvarProfilePageSix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anvar_profile_page_six)
    }
    fun onClickGoBackToProfile5(view : View) {
        val intent = Intent(this,AnvarProfilePageFive::class.java)
        startActivity(intent)
    }
}