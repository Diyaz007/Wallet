package com.example.ui.auth.signIn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import com.example.ui.auth.logIn.LogInActivity
import com.example.ui.auth.other.GoBackScreen
import com.example.wallet.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import java.util.Calendar

class CreateAccountActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var database: FirebaseDatabase
    private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account_daniyar)
        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()
        val signUpName: EditText = findViewById(R.id.editText_your_name_daniyar)
        val signUpNumber: EditText = findViewById(R.id.editText_phone_number)
        val signUpYearOfBorn: DatePicker = findViewById(R.id.date_picker_year_of_born)
        val signUpEmail: EditText = findViewById(R.id.editText_email)
        val signUpPassword: EditText = findViewById(R.id.password_edittext)
        val signUpCPassword: EditText = findViewById(R.id.edittext_confirm_password)

        val signUpBtn: Button = findViewById(R.id.button_singup)

        signUpBtn.setOnClickListener {
            val name = signUpName.text.toString()
            val phoneNumber = signUpNumber.text.toString()
            val date = Calendar.getInstance().set(signUpYearOfBorn.year,signUpYearOfBorn.month,signUpYearOfBorn.dayOfMonth)
            val dateToday = Calendar.getInstance().set(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH)
            val email = signUpEmail.text.toString()
            val password = signUpPassword.text.toString()
            val cpassword = signUpCPassword.text.toString()
            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || cpassword.isEmpty() || phoneNumber.isEmpty()) {
                if (name.isEmpty()) {
                    signUpName.error = "Enter your name"
                }
                if (email.isEmpty()) {
                    signUpEmail.error = "Enter the correct email address"
                }
                if (password.isEmpty()) {
                    signUpPassword.error = "The password must not be empty"
                }
                if (cpassword.isEmpty()) {
                    signUpCPassword.error = "Passwords don't match"
                }
                if (phoneNumber.isEmpty()) {
                    signUpCPassword.error = "Enter your phone number"
                }
                Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show()
            } else if (!email.matches(emailPattern.toRegex())) {
                signUpEmail.error = "Incorrect email address"
            } else if (password.length < 8) {
                signUpPassword.error = "The password must be more than 8 characters"
                Toast.makeText(this, "The password must be more than 8 characters", Toast.LENGTH_LONG)
                    .show()

            } else if (password != cpassword) {
                signUpCPassword.error = "The password doesn't match"
                Toast.makeText(this, "The password doesn't match", Toast.LENGTH_LONG).show()

            } else {
                auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val database =
                            database.reference.child("users").child(auth.currentUser!!.uid)
                        val users: Users = Users(name, phoneNumber, date, email, auth.currentUser!!.uid)
                        database.setValue(users).addOnCompleteListener {
                            if (it.isSuccessful) {
                                val intent = Intent(this, GoBackScreen::class.java)
                                startActivity(intent)
                            } else {
                                Toast.makeText(
                                    this,
                                    "Something went wrong, try again",
                                    Toast.LENGTH_LONG
                                ).show()
                            }
                        }
                    }
                }
            }
        }
    }
    fun onClickGoError(view: View) {
        val intent = Intent(this, ActivityCreateAccountSecondDaniyar::class.java)
        startActivity(intent)
    }

    fun onClickGoBackToWelcomeBackFromCreateAcc(view: View) {
        val intent = Intent(this, LogInActivity::class.java)
        startActivity(intent)
    }
}