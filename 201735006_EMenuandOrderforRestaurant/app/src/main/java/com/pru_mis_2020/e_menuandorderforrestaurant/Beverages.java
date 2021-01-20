package com.pru_mis_2020.e_menuandorderforrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Beverages extends AppCompatActivity {
    public ImageView Beverages_back;
    public ImageView imageView7;
    public ImageView imageView8;
    public ImageView imageView13;
    public ImageView imageView14;
    public ImageView imageView16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);
        Beverages_back = findViewById(R.id.Beverages_back);
        Beverages_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beverages_menu = new Intent(Beverages.this, MenuHomePage.class);
                startActivity(beverages_menu);
            }
        });
        imageView7 = findViewById(R.id.imageView7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beverages_menu = new Intent(Beverages.this, Order.class);
                startActivity(beverages_menu);
            }
        });
        imageView8 = findViewById(R.id.imageView8);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beverages_menu = new Intent(Beverages.this, Order.class);
                startActivity(beverages_menu);
            }
        });
        imageView13 = findViewById(R.id.imageView13);
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beverages_menu = new Intent(Beverages.this, Order.class);
                startActivity(beverages_menu);
            }
        });
        imageView14 = findViewById(R.id.imageView14);
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beverages_menu = new Intent(Beverages.this, Order.class);
                startActivity(beverages_menu);
            }
        });
        imageView16 = findViewById(R.id.imageView16);
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beverages_menu = new Intent(Beverages.this, Order.class);
                startActivity(beverages_menu);
            }
        });

    }
}