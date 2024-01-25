package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivityProfilePageSeven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anvar_profile_page_seven)
    }
    fun onClickGoMainAnvarCryptoMainAct (view: View) {
        val intent = Intent(this, AnvarCryptoMainActivity::class.java)
        startActivity(intent)
    }
    fun onClickGoMain (view: View) {
        val intent = Intent(this, MainActivityProfilePageFive::class.java)
        startActivity(intent)
    }
}
