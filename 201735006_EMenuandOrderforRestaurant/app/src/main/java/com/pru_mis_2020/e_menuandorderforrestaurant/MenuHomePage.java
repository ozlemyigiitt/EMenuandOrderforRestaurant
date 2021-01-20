package com.pru_mis_2020.e_menuandorderforrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MenuHomePage extends AppCompatActivity {
    public Button Snacks;
    public Button Salads;
    public Button Burgers;
    public Button Deserts;
    public Button Pasta;
    public Button Pizza;
    public Button Sandwichs;
    public Button Beverages;
    public ImageView order_back2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_home_page);
        order_back2 = findViewById(R.id.order_back2);
        order_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MenuHomePage.this,MainActivity.class);
                startActivity(menu);
            }
        });
        Snacks = findViewById(R.id.Snacks);
        Snacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MenuHomePage.this, Snacks.class);
                startActivity(menu);
            }
        });
        Salads = findViewById(R.id.Salads);
        Salads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MenuHomePage.this, Salads.class);
                startActivity(menu);
            }
        });
        Burgers = findViewById(R.id.Burgers);
        Burgers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MenuHomePage.this, Burgers.class);
                startActivity(menu);
            }
        });
        Deserts = findViewById(R.id.Deserts);
        Deserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MenuHomePage.this, Deserts.class);
                startActivity(menu);
            }
        });
        Pasta = findViewById(R.id.Pasta);
        Pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MenuHomePage.this, Pasta.class);
                startActivity(menu);
            }
        });
        Pizza = findViewById(R.id.Pizza);
        Pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MenuHomePage.this, Pizza.class);
                startActivity(menu);
            }
        });
        Sandwichs = findViewById(R.id.Sandwichs);
        Sandwichs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MenuHomePage.this, Sandwichs.class);
                startActivity(menu);
            }
        });
        Beverages = findViewById(R.id.Beverages);
        Beverages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MenuHomePage.this, Beverages.class);
                startActivity(menu);
            }
        });
    }
}