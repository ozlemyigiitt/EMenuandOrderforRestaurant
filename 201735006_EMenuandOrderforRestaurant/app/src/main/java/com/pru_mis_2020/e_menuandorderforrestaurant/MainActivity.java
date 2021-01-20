package com.pru_mis_2020.e_menuandorderforrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button sign_in_button;
    public TextView sign_up_text;
    public TextView forgot_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sign_in_button=findViewById(R.id.sign_in_button);
        sign_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu =new Intent(MainActivity.this,MenuHomePage.class);
                startActivity(menu);
            }
        });
        sign_up_text=findViewById(R.id.sign_up_text);
        sign_up_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu =new Intent(MainActivity.this,sign_up_page.class);
                startActivity(menu);
            }
        });
        forgot_password=findViewById(R.id.forgot_password);
        forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu =new Intent(MainActivity.this,forgot_password.class);
                startActivity(menu);
            }
        });

    }
}