package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivityProfilePageFive : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anvar_profile_page_five)
    }
    fun onClickGoMainAnvarCryptoMainAct (view: View) {
        val intent = Intent(this, MainActivityProfilePageSeven::class.java)
        startActivity(intent)
    }
    fun onClickGoMain (view: View) {
        val intent = Intent(this, MainActivityProfilePageSix::class.java)
        startActivity(intent)
    }
}