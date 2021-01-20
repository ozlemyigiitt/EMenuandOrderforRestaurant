package com.pru_mis_2020.e_menuandorderforrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Deserts extends AppCompatActivity {
    public ImageView imageView22;
    public ImageView imageView24;
    public ImageView imageView25;
    public ImageView deserts_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deserts);
        deserts_back = findViewById(R.id.deserts_back);
        deserts_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deserts_menu = new Intent(Deserts.this, MenuHomePage.class);
                startActivity(deserts_menu);
            }
        });

        imageView22 = findViewById(R.id.imageView22);
        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deserts_menu = new Intent(Deserts.this, Order.class);
                startActivity(deserts_menu);
            }
        });
        imageView24 = findViewById(R.id.imageView24);
        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deserts_menu = new Intent(Deserts.this, Order.class);
                startActivity(deserts_menu);
            }
        });
        imageView25 = findViewById(R.id.imageView25);
        imageView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deserts_menu = new Intent(Deserts.this, Order.class);
                startActivity(deserts_menu);
            }
        });

    }
}