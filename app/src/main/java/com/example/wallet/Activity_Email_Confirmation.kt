package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Activity_Email_Confirmation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_confirmation)
    }
    fun onClickGobackCReateAcooun2(view: View){
        val intent= Intent(this,Activity_create_account_2_::class.java)
        startActivity(intent)

    }
}