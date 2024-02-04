package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnvarProfilePageSeven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anvar_profile_page_seven)
    }
    fun onClickGoBackToProfile5FromProfile7(view : View) {
        val intent = Intent(this,AnvarProfilePageFive::class.java)
        startActivity(intent)
    }

    fun onClickGoToMainActivityAnvar(view : View) {
        val intent = Intent(this,AnvarCryptoMainActivity::class.java)
        startActivity(intent)
    }

    fun onClickGoProfileSixAnvar(view: View) {}
    fun onClickGoProfileSevenAnvar(view: View) {}
}