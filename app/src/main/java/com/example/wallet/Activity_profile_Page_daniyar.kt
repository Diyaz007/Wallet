package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Activity_profile_Page_daniyar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page_daniyar)
    }

    fun onClickGoAddPaymentActivity(view: View){
        val intent= Intent(this,ActivityAddPaymentMethod::class.java)
        startActivity(intent)

    }

    fun onClickGoBackActivity(view: View){
        val intent= Intent(this,Activity_go_back_daniyar::class.java)
        startActivity(intent)

    }

}