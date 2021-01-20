package com.pru_mis_2020.e_menuandorderforrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Sandwichs extends AppCompatActivity {
    public ImageView imageView36;
    public ImageView imageView37;
    public ImageView imageView38;
    public ImageView imageView40;
    public ImageView Sandwichs_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwichs);
        Sandwichs_back = findViewById(R.id.Sandwichs_back);
        Sandwichs_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sandwichs_menu = new Intent(Sandwichs.this, MenuHomePage.class);
                startActivity(sandwichs_menu);
            }
        });
        imageView36 = findViewById(R.id.imageView36);
        imageView36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sandwichs_menu = new Intent(Sandwichs.this, Order.class);
                startActivity(sandwichs_menu);
            }
        });
        imageView37 = findViewById(R.id.imageView37);
        imageView37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sandwichs_menu = new Intent(Sandwichs.this, Order.class);
                startActivity(sandwichs_menu);
            }
        });
        imageView38 = findViewById(R.id.imageView38);
        imageView38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sandwichs_menu = new Intent(Sandwichs.this, Order.class);
                startActivity(sandwichs_menu);
            }
        });

        imageView40 = findViewById(R.id.imageView40);
        imageView40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sandwichs_menu = new Intent(Sandwichs.this, Order.class);
                startActivity(sandwichs_menu);
            }
        });

    }
}