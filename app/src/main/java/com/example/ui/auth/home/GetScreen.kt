package com.example.ui.auth.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.wallet.R

class GetScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_islam_get)
    }

    fun onClickGoBackToMainAnvarFromGet(view : View) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}