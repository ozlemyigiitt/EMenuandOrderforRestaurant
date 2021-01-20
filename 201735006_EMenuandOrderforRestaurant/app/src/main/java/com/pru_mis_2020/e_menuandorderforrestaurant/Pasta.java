package com.pru_mis_2020.e_menuandorderforrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Pasta extends AppCompatActivity {

    public ImageView imageView27;
    public ImageView imageView28;
    public ImageView imageView29;
    public ImageView imageView30;
    public ImageView Pasta_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta);
        Pasta_back = findViewById(R.id.Pasta_back);
        Pasta_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasta_menu = new Intent(Pasta.this, MenuHomePage.class);
                startActivity(pasta_menu);
            }
        });

        imageView27 = findViewById(R.id.imageView27);
        imageView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasta_menu = new Intent(Pasta.this, Order.class);
                startActivity(pasta_menu);
            }
        });
        imageView28 = findViewById(R.id.imageView28);
        imageView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent burgers_menu = new Intent(Pasta.this, Order.class);
                startActivity(burgers_menu);
            }
        });
        imageView29 = findViewById(R.id.imageView29);
        imageView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent burgers_menu = new Intent(Pasta.this, Order.class);
                startActivity(burgers_menu);
            }
        });
        imageView30 = findViewById(R.id.imageView30);
        imageView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent burgers_menu = new Intent(Pasta.this, Order.class);
                startActivity(burgers_menu);
            }
        });


    }
}