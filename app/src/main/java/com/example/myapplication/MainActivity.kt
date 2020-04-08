package com.example.myapplication
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://5e8472abaaa290cd3beb0f19--determined-goldwasser-f059bf.netlify.com/"
//        val myWebView: WebView = findViewById(R.id.webview)
//        myWebView.settings.javaScriptEnabled = true
//        myWebView.loadUrl(url)
            val btn = findViewById<Button>(R.id.btn)
             btn.setOnClickListener {
            Intent(Intent.ACTION_VIEW, Uri.parse(url)).apply {
                startActivity(this)
            }
        }

    }
}
