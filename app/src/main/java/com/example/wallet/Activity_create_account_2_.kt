package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Activity_create_account_2_ : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account2)
    }
    fun onClickGoEmail(view: View) {
        val intent = Intent(this, Activity_Email_Confirmation::class.java)
        startActivity(intent)
    }
    fun onClickGobackacccreate(view: View){
        val intent=Intent(this,Activity_Create_Account::class.java)
        startActivity(intent)

    }
    }