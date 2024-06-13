package com.example.myapplication1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.content.ActivityNotFoundException;

public class Activity2 extends AppCompatActivity {

    Button btn1, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14,
        btn15, btn16, btn17, btn18, btn19;


    public void watchYoutubeVideo(String s) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(s));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse(s));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("https://www.youtube.com/watch?v=tUTu5clQGFw&list=PLsr4InzR8HwVuo0bzVH1SiGBgHeC_PlGz&index=4");
            }
        });
        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("https://www.youtube.com/watch?v=w8eccjOeotQ&list=PLsr4InzR8HwVuo0bzVH1SiGBgHeC_PlGz&index=1");
            }
        });
        btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, AccordActivity1.class);
                startActivity(intent);
            }
        });
        btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("https://www.youtube.com/watch?v=K0HnY22I8es&list=PLsr4InzR8HwVuo0bzVH1SiGBgHeC_PlGz&index=2");
            }
        });
        btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, AccordActivity2.class);
                startActivity(intent);
            }
        });
        btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("https://www.youtube.com/watch?v=qTJ6pwdYkyk&list=PLsr4InzR8HwVuo0bzVH1SiGBgHeC_PlGz&index=3");
            }
        });
        btn8 = (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, AccordActivity3.class);
                startActivity(intent);
            }
        });
        btn9 = (Button) findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("https://www.youtube.com/watch?v=zo2IinVDyXM&list=PLsr4InzR8HwVuo0bzVH1SiGBgHeC_PlGz&index=5");
            }
        });
        btn10 = (Button) findViewById(R.id.button10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, AccordActivity4.class);
                startActivity(intent);
            }
        });
        btn11 = (Button) findViewById(R.id.button11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("https://www.youtube.com/watch?v=7DD54t3p0-Y&list=PLsr4InzR8HwVuo0bzVH1SiGBgHeC_PlGz&index=6");
            }
        });
        btn12 = (Button) findViewById(R.id.button12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, AccordActivity5.class);
                startActivity(intent);
            }
        });
        btn13 = (Button) findViewById(R.id.button13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("https://www.youtube.com/watch?v=ZPDL5i5TS54&list=PLsr4InzR8HwVuo0bzVH1SiGBgHeC_PlGz&index=8");
            }
        });
        btn14 = (Button) findViewById(R.id.button14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, AccordActivity6.class);
                startActivity(intent);
            }
        });
        btn15 = (Button) findViewById(R.id.button15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("https://www.youtube.com/watch?v=pkKj_6jURdM&list=PLsr4InzR8HwVuo0bzVH1SiGBgHeC_PlGz&index=9");
            }
        });
        btn16 = (Button) findViewById(R.id.button16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, AccordActivity6.class);
                startActivity(intent);
            }
        });
        btn17 = (Button) findViewById(R.id.button17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("https://www.youtube.com/watch?v=MpnYAAiBPMc&list=PLsr4InzR8HwVuo0bzVH1SiGBgHeC_PlGz&index=10");
            }
        });
        btn18 = (Button) findViewById(R.id.button18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, AccordActivity7.class);
                startActivity(intent);
            }
        });

        btn19 = (Button) findViewById(R.id.button24);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}