package com.example.ui.auth.logIn

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.ui.auth.signIn.ConfirmationCodeActivity
import com.example.ui.auth.signIn.CongratsActivity
import com.example.wallet.R
import com.google.firebase.auth.FirebaseAuth

class PassworReset : AppCompatActivity() {
    private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_altynai)
        val userEmail = findViewById<EditText>(R.id.EditTextEmailPassAlt)
        findViewById<Button>(R.id.buttonSendCodePassword).setOnClickListener {
            compareEmail(userEmail)
        }
    }

    fun compareEmail(email: EditText) {
        auth = FirebaseAuth.getInstance();
        if (email.text.toString().isEmpty()) {
            return
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches()) {
            return
        }
        auth.sendPasswordResetEmail(email.text.toString()).addOnCompleteListener {
            if (it.isSuccessful) {
                Toast.makeText(this, "Check your email", Toast.LENGTH_LONG).show()
                val intent = Intent(this, CongratsActivity::class.java)
                startActivity(intent)
            }
        }

    }


    fun onClickGoBackToWelcomeBack(view: View) {
        val intent = Intent(this, LogInActivity::class.java)
        startActivity(intent)
    }
}