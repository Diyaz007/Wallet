package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Activity_go_back_daniyar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_back_daniyar)
    }

    fun onClickGoprofileActivity(view: View){
        val intent= Intent(this,Activity_profile_Page_daniyar::class.java)
        startActivity(intent)

    }

}