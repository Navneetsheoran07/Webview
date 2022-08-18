package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class fifth extends AppCompatActivity {
    WebView webView4;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);


        webView4=findViewById(R.id.webview4);
        progressBar=findViewById(R.id.pgbar4);
        webView4.loadUrl("https://youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q");

        webView4.setWebViewClient(new WebViewClient(){
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
        webView4.getSettings().setJavaScriptEnabled(true);

        webView4.getSettings().setLoadsImagesAutomatically(true);
    }


    @Override
    public void onBackPressed() {

        if(webView4.canGoBack()){
            webView4.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
