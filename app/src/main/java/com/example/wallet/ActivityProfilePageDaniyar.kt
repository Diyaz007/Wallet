package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityProfilePageDaniyar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page_daniyar)
    }

    fun onClickGoAddPaymentActivity(view: View){
        val intent= Intent(this,ActivityAddPaymentMethodDaniyar::class.java)
        startActivity(intent)

    }

    fun onClickGoBackActivity(view: View){
        val intent= Intent(this,ActivityGoBackDaniyar::class.java)
        startActivity(intent)

    }

}