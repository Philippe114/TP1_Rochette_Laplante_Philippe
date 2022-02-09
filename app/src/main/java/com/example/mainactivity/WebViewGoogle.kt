package com.example.mainactivity

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import android.webkit.WebViewClient



class WebViewGoogle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_google)
        webViewSetup()

    }
    fun webViewSetup(){
        val myWebView: WebView = findViewById(R.id.webView1)
        myWebView.webViewClient = WebViewClient()
        myWebView.apply{
            val myURL = intent.getStringExtra("EXTRA_URL")
            if (myURL != null) {
                myWebView.loadUrl(myURL)
            }
        }
    }

    fun closeWebView(v: View) {
        this.finish()::class.java
    }
}
