package com.example.ui.auth.logIn

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.widget.AppCompatButton
import com.example.ui.auth.home.HomeActivity
import com.example.ui.auth.signIn.CreateAccountActivity
import com.example.wallet.R
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider

class LogInActivity : AppCompatActivity() {
    private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    private lateinit var auth: FirebaseAuth
    private lateinit var googleSignInClient: GoogleSignInClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_back_altynai)

        auth = FirebaseAuth.getInstance();

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        googleSignInClient = GoogleSignIn.getClient(this,gso)

        findViewById<Button>(R.id.SignInWithGoogleButtonWBAlt).setOnClickListener {
            googleSignIn();
        }

        val signInEmail: EditText = findViewById(R.id.EditTextEmailWelcomeBackAlt)
        val signInPassword: EditText = findViewById(R.id.EditTextPasswordWelcomeBackAlt)
        val signInBtn: Button = findViewById(R.id.ButtonLogInWelcomeBackAlt)

        signInBtn.setOnClickListener {
            val email=signInEmail.text.toString()
            val password=signInPassword.text.toString()

            if(email.isEmpty() || password.isEmpty()){
                if(email.isEmpty()){
                    signInEmail.error = "Write email"
                }
                if(password.isEmpty()){
                    signInPassword.error = "Write password"
                }
                Toast.makeText(this,"Enter your details",Toast.LENGTH_LONG).show()
            }
            else if(!email.matches(emailPattern.toRegex())){
                signInEmail.error="Enter a valid email"
                Toast.makeText(this,"Invalid email",Toast.LENGTH_LONG).show()
            }else if (password.length < 8){
                signInPassword.error = "The password must be more than 8 characters"
                Toast.makeText(this,"The password must be more than 8 characters",Toast.LENGTH_LONG).show()
            }else{
                auth.signInWithEmailAndPassword(email,password).addOnCompleteListener{
                    if(it.isSuccessful){
                        val intent=Intent(this,HomeActivity::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this,"Something went wrong",Toast.LENGTH_LONG).show()

                    }
                }
            }
        }

    }

    private fun googleSignIn() {

        val signInClient = googleSignInClient.signInIntent
        launcher.launch(signInClient)
    }

    private val launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result ->
        if (result.resultCode == Activity.RESULT_OK){
            val task = GoogleSignIn.getSignedInAccountFromIntent(result.data)
            manageResults(task);
        }


    }

    private fun manageResults(task: Task<GoogleSignInAccount>) {
        val account : GoogleSignInAccount? = task.result

        if(account != null){
            val credential = GoogleAuthProvider.getCredential(account.idToken,null)
            auth.signInWithCredential(credential).addOnCanceledListener {
                if(task.isSuccessful){
                    val intent = Intent(this,HomeActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(this,"Account created",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,task.exception.toString(),Toast.LENGTH_SHORT).show()

                }
            }
        }
        else{
            Toast.makeText(this,task.exception.toString(),Toast.LENGTH_SHORT).show()

        }
    }
    fun onClickGoToCreateAccount(view : View) {
        val intent = Intent(this, CreateAccountActivity::class.java)
        startActivity(intent)
    }
    fun onClickGoToForgotPassword(view : View) {
        val intent = Intent(this, PassworReset::class.java)
        startActivity(intent)
    }

}