package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class seventh extends AppCompatActivity {
    WebView webView6;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);


        webView6=findViewById(R.id.webview6);
        progressBar=findViewById(R.id.pgbar6);
        webView6.loadUrl("https://youtube.com/playlist?list=PLu0W_9lII9agICnT8t4iYVSZ3eykIAOME");

        webView6.setWebViewClient(new WebViewClient(){
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
        webView6.getSettings().setJavaScriptEnabled(true);

        webView6.getSettings().setLoadsImagesAutomatically(true);
    }


    @Override
    public void onBackPressed() {

        if(webView6.canGoBack()){
            webView6.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}


