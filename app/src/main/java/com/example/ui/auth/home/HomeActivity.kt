package com.example.ui.auth.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ui.auth.other.WalletsList
import com.example.ui.auth.other.ManageCryptoScreen
import com.example.ui.auth.profile.ActivityProfilePageDaniyar
import com.example.ui.auth.settings.SettingsActivity
import com.example.wallet.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anvar_crypto_main)
    }

    fun onClickGoToMainActivity4Anvar(view: View) {
        val intent = Intent(this, ManageCryptoScreen::class.java)
        startActivity(intent)
    }

    fun onClickGoToMainActivity3Anvar(view: View) {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }

    fun onClickGoToMainActivity2Anvar(view: View) {
        val intent = Intent(this, WalletsList::class.java)
        startActivity(intent)
    }

    fun onClickGoToProfilePageFromMainAnvar(view: View) {
        val intent = Intent(this, ActivityProfilePageDaniyar::class.java)
        startActivity(intent)
    }

    fun onClickGoToSendPageFromMainAnvar(view: View) {
        val intent = Intent(this, SendActivity::class.java)
        startActivity(intent)
    }

    fun onClickGoToReceivePageFromMainAnvar(view: View) {
        val intent = Intent(this, GetScreen::class.java)
        startActivity(intent)
    }

    fun onClickGoToBuyPageFromMainAnvar(view: View) {
        val intent = Intent(this, BuyScreen::class.java)
        startActivity(intent)
    }

    fun onClickGoToConvertPageFromMainAnvar(view: View) {
        val intent = Intent(this, ConvertScreen::class.java)
        startActivity(intent)
    }
}