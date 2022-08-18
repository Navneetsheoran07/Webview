package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class computerlang extends AppCompatActivity {

    CardView cardView,cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,cardView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computerlang);


        cardView=findViewById(R.id.cdview);
        cardView1=findViewById(R.id.cdview2);
        cardView2=findViewById(R.id.cdview3);
        cardView3=findViewById(R.id.cdview4);
        cardView4=findViewById(R.id.cdview5);
        cardView5=findViewById(R.id.cdview6);
        cardView6=findViewById(R.id.cdview7);
        cardView7=findViewById(R.id.cdview8);
        cardView8=findViewById(R.id.cdview9);
        cardView9=findViewById(R.id.cdview10);
        cardView10=findViewById(R.id.cdview11);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(computerlang.this,first.class);
                startActivity(intent);
            }
        });
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(computerlang.this, sec.class);
                startActivity(intent1);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(computerlang.this, third.class);
                startActivity(intent2);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(computerlang.this, fourth.class);
                startActivity(intent3);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(computerlang.this, fifth.class);
                startActivity(intent4);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(computerlang.this, sixth.class);
                startActivity(intent5);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(computerlang.this, seventh.class);
                startActivity(intent6);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(computerlang.this, eigth.class);
                startActivity(intent7);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(computerlang.this, nineth.class);
                startActivity(intent8);
            }
        });
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(computerlang.this, tenth.class);
                startActivity(intent9);
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10 = new Intent(computerlang.this, eleven.class);
                startActivity(intent10);
            }
        });

    }
}