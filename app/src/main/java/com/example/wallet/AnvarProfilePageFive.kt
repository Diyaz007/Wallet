package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnvarProfilePageFive : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anvar_profile_page_five)
    }
    fun onClickGoProfileSixAnvar(view : View) {
        val intent = Intent(this,AnvarProfilePageSix::class.java)
        startActivity(intent)
    }

    fun onClickGoProfileSevenAnvar(view : View) {
        val intent = Intent(this,AnvarProfilePageSeven::class.java)
        startActivity(intent)
    }

    fun onClickGoBackToCreatePass(view : View) {
        val intent = Intent(this,ActivityCreatePasswordDaniyar::class.java)
        startActivity(intent)
    }
    fun onClickGoBackToProfile5FromProfile7(view: View) {}
    fun onClickGoToMainActivityAnvar(view: View) {}
}