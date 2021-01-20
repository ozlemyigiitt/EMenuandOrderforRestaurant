package com.pru_mis_2020.e_menuandorderforrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Pizza extends AppCompatActivity {
    public ImageView Pizza_back;
    public ImageView imageView49;
    public ImageView imageView50;
    public ImageView imageView51;
    public ImageView imageView52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        Pizza_back = findViewById(R.id.Pizza_back);
        Pizza_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pizza_menu = new Intent(Pizza.this, MenuHomePage.class);
                startActivity(pizza_menu);
            }
        });
        imageView49 = findViewById(R.id.imageView49);
        imageView49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pizza_menu = new Intent(Pizza.this, Order.class);
                startActivity(pizza_menu);
            }
        });
        imageView50 = findViewById(R.id.imageView50);
        imageView50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pizza_menu = new Intent(Pizza.this, Order.class);
                startActivity(pizza_menu);
            }
        });
        imageView51 = findViewById(R.id.imageView51);
        imageView51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pizza_menu = new Intent(Pizza.this, Order.class);
                startActivity(pizza_menu);
            }
        });
        imageView52 = findViewById(R.id.imageView52);
        imageView52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pizza_menu = new Intent(Pizza.this, Order.class);
                startActivity(pizza_menu);
            }
        });

    }
}
