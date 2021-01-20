package com.pru_mis_2020.e_menuandorderforrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Order extends AppCompatActivity {
    public Button button2;
    public ImageView order_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent order= new Intent(Order.this, Order_Complete.class);
                startActivity(order);
            }
        });
        order_back = findViewById(R.id.order_back);
        order_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent order= new Intent(Order.this, MenuHomePage.class);
                startActivity(order);
            }
        });
    }
}