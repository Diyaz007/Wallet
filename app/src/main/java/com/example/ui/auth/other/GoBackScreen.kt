package com.example.ui.auth.other

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.profile.ActivityProfilePageDaniyar
import com.example.wallet.R

class GoBackScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_back_daniyar)
    }
    fun onClickGoProfileActivity(view: View){
        val intent= Intent(this, ActivityProfilePageDaniyar::class.java)
        startActivity(intent)

    }
}