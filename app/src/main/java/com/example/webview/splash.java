package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class splash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Window window=getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread splashThread=new Thread(){

            @Override
            public void run(){try{
                sleep(1000);
                startActivity(new Intent(splash.this,MainActivity.class));
                finish();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                super.run();   }
        };
        splashThread.start();
    }
}