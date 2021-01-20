package com.pru_mis_2020.e_menuandorderforrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class forgot_password extends AppCompatActivity {
    public Button forgot_password_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        forgot_password_button=findViewById(R.id.forgot_password_button);
        ((View) forgot_password_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main =new Intent(forgot_password.this,MainActivity.class);
                startActivity(main);
            }
        });
    }
}