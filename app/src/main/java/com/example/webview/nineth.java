package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class nineth extends AppCompatActivity {

    WebView webView8;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineth);


        webView8=findViewById(R.id.webview8);
        progressBar=findViewById(R.id.pgbar8);
        webView8.loadUrl("https://youtube.com/playlist?list=PLu0W_9lII9agx66oZnT6IyhcMIbUMNMdt");

        webView8.setWebViewClient(new WebViewClient(){
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
        webView8.getSettings().setJavaScriptEnabled(true);

        webView8.getSettings().setLoadsImagesAutomatically(true);
    }


    @Override
    public void onBackPressed() {

        if(webView8.canGoBack()){
            webView8.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
