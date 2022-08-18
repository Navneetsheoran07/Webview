package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class app extends AppCompatActivity {

    WebView app;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        app = findViewById(R.id.app);
        progressBar = findViewById(R.id.pgapp);
        app.loadUrl("https://youtube.com/playlist?list=PLjVLYmrlmjGdDps6HAwOOVoAtBPAgIOXL");

        app.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                progressBar.setVisibility(View.VISIBLE);
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                progressBar.setVisibility(View.GONE);
                super.onPageFinished(view, url);
            }
        });
        app.getSettings().setJavaScriptEnabled(true);

        app.getSettings().setLoadsImagesAutomatically(true);
    }

    @Override
    public void onBackPressed() {

            if (app.canGoBack()) {
                app.goBack();
            } else {
                super.onBackPressed();
            }
        }
    }