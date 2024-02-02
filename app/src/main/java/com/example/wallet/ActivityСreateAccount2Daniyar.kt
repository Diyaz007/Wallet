package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityСreateAccount2Daniyar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account2)
    }
    fun onClickGoEmail(view: View) {
        val intent = Intent(this, ActivityEmailConfirmationDaniyar::class.java)
        startActivity(intent)
    }
    fun onClickGobackacccreate(view: View){
        val intent=Intent(this,ActivityCreateAccountDaniyar::class.java)
        startActivity(intent)

    }
    }