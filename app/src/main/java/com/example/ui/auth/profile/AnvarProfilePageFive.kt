package com.example.ui.auth.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.signIn.CreatePasswordActivity
import com.example.wallet.R

class AnvarProfilePageFive : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anvar_profile_page_five)
    }
    fun onClickGoProfileSixAnvar(view : View) {
        val intent = Intent(this, AnvarProfilePageSix::class.java)
        startActivity(intent)
    }

    fun onClickGoProfileSevenAnvar(view : View) {
        val intent = Intent(this, AnvarProfilePageSeven::class.java)
        startActivity(intent)
    }

    fun onClickGoBackToCreatePass(view : View) {
        val intent = Intent(this, CreatePasswordActivity::class.java)
        startActivity(intent)
    }
    fun onClickGoBackToProfile5FromProfile7(view: View) {}
    fun onClickGoToMainActivityAnvar(view: View) {}
}