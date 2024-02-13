package com.example.ui.auth.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.home.HomeActivity
import com.example.wallet.R

class AnvarProfilePageSeven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anvar_profile_page_seven)
    }
    fun onClickGoBackToProfile5FromProfile7(view : View) {
        val intent = Intent(this, AnvarProfilePageFive::class.java)
        startActivity(intent)
    }

    fun onClickGoToMainActivityAnvar(view : View) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

    fun onClickGoProfileSixAnvar(view: View) {}
    fun onClickGoProfileSevenAnvar(view: View) {}
    fun onClickGoBackToCreatePass(view: View) {}
}