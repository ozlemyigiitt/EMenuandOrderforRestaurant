package com.pru_mis_2020.e_menuandorderforrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Burgers extends AppCompatActivity {
    public ImageView imageView;
    public ImageView imageView2;
    public ImageView imageView3;
    public ImageView imageView4;
    public ImageView imageView5;
    public ImageView Burgers_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burgers);
        Burgers_back = findViewById(R.id.Burgers_back);
        Burgers_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent burgers_menu = new Intent(Burgers.this, Order.class);
                startActivity(burgers_menu);
            }
        });
        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent burgers_menu = new Intent(Burgers.this, Order.class);
                startActivity(burgers_menu);
            }
        });
        imageView2 = findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent burgers_menu = new Intent(Burgers.this, Order.class);
                startActivity(burgers_menu);
            }
        });
        imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent burgers_menu = new Intent(Burgers.this, Order.class);
                startActivity(burgers_menu);
            }
        });
        imageView4 = findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent burgers_menu = new Intent(Burgers.this, Order.class);
                startActivity(burgers_menu);
            }
        });
        imageView5 = findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent burgers_menu = new Intent(Burgers.this, Order.class);
                startActivity(burgers_menu);
            }
        });


    }

}