package com.pru_mis_2020.e_menuandorderforrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Snacks extends AppCompatActivity {
    public ImageView imageView58;
    public ImageView imageView59;
    public ImageView imageView61;
    public ImageView imageView62;
    public ImageView imageView64;
    public ImageView Snacks_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);
        Snacks_back = findViewById(R.id.Snacks_back);
        Snacks_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent snacks_menu = new Intent(Snacks.this, MenuHomePage.class);
                startActivity(snacks_menu);
            }
        });

        imageView58 = findViewById(R.id.imageView58);
        imageView58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent snacks_menu = new Intent(Snacks.this, Order.class);
                startActivity(snacks_menu);
            }
        });
        imageView59 = findViewById(R.id.imageView59);
        imageView59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent snacks_menu = new Intent(Snacks.this, Order.class);
                startActivity(snacks_menu);
            }
        });

        imageView61 = findViewById(R.id.imageView61);
        imageView61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent snacks_menu = new Intent(Snacks.this, Order.class);
                startActivity(snacks_menu);
            }
        });
        imageView62 = findViewById(R.id.imageView62);
        imageView62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent snacks_menu = new Intent(Snacks.this, Order.class);
                startActivity(snacks_menu);
            }
        });
        imageView64 = findViewById(R.id.imageView64);
        imageView64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent snacks_menu = new Intent(Snacks.this, Order.class);
                startActivity(snacks_menu);
            }
        });
    }
}
