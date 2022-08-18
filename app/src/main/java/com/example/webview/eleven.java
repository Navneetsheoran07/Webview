package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class eleven extends AppCompatActivity {

    WebView webView10;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);


        webView10=findViewById(R.id.webview10);
        progressBar=findViewById(R.id.pgbar10);
        webView10.loadUrl("https://youtube.com/playlist?list=PLu0W_9lII9aikXkRE0WxDt1vozo3hnmtR");

        webView10.setWebViewClient(new WebViewClient(){
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
        webView10.getSettings().setJavaScriptEnabled(true);

        webView10.getSettings().setLoadsImagesAutomatically(true);
    }


    @Override
    public void onBackPressed() {

        if(webView10.canGoBack()){
            webView10.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
