package com.example.mainactivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import java.io.Serializable
import java.util.*
import java.time.LocalDate


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    class Profile (var nom: String, var prenom:String, var dateNaissance: Date, var iDUL: String ): Serializable
    val myProfile = Profile("Rochette Laplante", "Philippe", Date(99,2,12),"PHROL3" )
    var UrlToLoad = ("http://www.google.com")


    fun ulavalPage(view: View) {
        val intent = Intent(this, UlavalActivity::class.java).apply {
        }
        startActivity(intent)
    }

    fun googlePage(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(UrlToLoad));
        startActivity(browserIntent);
    }

    fun webViewGooglePage(view: View) {
        val webIntent = Intent(this, WebViewGoogle::class.java).apply {
            putExtra("EXTRA_URL",UrlToLoad)
        }
        startActivity(webIntent)
    }

    fun profilePage(view: View) {
        val intent = Intent(this, ProfileDescription::class.java).apply {
            putExtra("EXTRA_PROFILE", myProfile)

        }
        startActivity(intent)
    }
}
