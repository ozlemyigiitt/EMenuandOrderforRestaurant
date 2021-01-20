package com.pru_mis_2020.e_menuandorderforrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Salads extends AppCompatActivity {
    public ImageView imageView41;
    public ImageView imageView42;
    public ImageView imageView43;
    public ImageView imageView44;
    public ImageView Salads_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salads);
        Salads_back = findViewById(R.id.Salads_back);
        Salads_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salads_menu = new Intent(Salads.this, MenuHomePage.class);
                startActivity(salads_menu);
            }
        });

        imageView41 = findViewById(R.id.imageView41);
        imageView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salads_menu = new Intent(Salads.this, Order.class);
                startActivity(salads_menu);
            }
        });
        imageView42 = findViewById(R.id.imageView42);
        imageView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salads_menu = new Intent(Salads.this, Order.class);
                startActivity(salads_menu);
            }
        });
        imageView43 = findViewById(R.id.imageView43);
        imageView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salads_menu = new Intent(Salads.this, Order.class);
                startActivity(salads_menu);
            }
        });
        imageView44 = findViewById(R.id.imageView44);
        imageView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salads_menu = new Intent(Salads.this, Order.class);
                startActivity(salads_menu);
            }
        });
    }
}
