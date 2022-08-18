package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class sixth extends AppCompatActivity {

    WebView webView5;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);


        webView5=findViewById(R.id.webview5);
        progressBar=findViewById(R.id.pgbar5);
        webView5.loadUrl("https://youtube.com/playlist?list=PLu0W_9lII9ahR1blWXxgSlL4y9iQBnLpR");

        webView5.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                progressBar.setVisibility(View.VISIBLE );
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                progressBar.setVisibility(View.GONE);
                super.onPageFinished(view, url);
            }
        });
        webView5.getSettings().setJavaScriptEnabled(true);

        webView5.getSettings().setLoadsImagesAutomatically(true);
    }


    @Override
    public void onBackPressed() {

        if(webView5.canGoBack()){
            webView5.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
