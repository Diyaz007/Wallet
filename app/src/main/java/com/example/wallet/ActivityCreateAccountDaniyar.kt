package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityCreateAccountDaniyar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
    }

    fun onClickGoError(view: View){
        val intent=Intent(this,ActivityСreateAccount2Daniyar::class.java)
        startActivity(intent)

    }


}