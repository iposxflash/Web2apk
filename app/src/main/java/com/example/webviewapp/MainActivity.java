package com.example.webviewapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;
    // GANTI DENGAN URL WEBSITE ANDA YANG SUDAH DI-HOSTING
    private final String WEB_URL = "https://ojgrup.com"; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = findViewById(R.id.webView_main);

        // Pengaturan wajib untuk WebView
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true); 

        // Memastikan navigasi link tetap di dalam aplikasi
        myWebView.setWebViewClient(new WebViewClient());

        // Memuat URL dari hosting
        myWebView.loadUrl(WEB_URL);
    }
    
    // Fungsi untuk tombol 'Back'
    @Override
    public void onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
