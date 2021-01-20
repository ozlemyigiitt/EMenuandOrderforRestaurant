package com.pru_mis_2020.e_menuandorderforrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sign_up_page extends AppCompatActivity {
    public Button sign_up_button;
    public TextView sign_in_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        sign_up_button=findViewById(R.id.sign_up_button);
        sign_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu =new Intent(sign_up_page.this,MainActivity.class);
                startActivity(menu);
            }
        });
        sign_in_text=findViewById(R.id.sign_in_text);
        sign_in_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu =new Intent(sign_up_page.this,MainActivity.class);
                startActivity(menu);
            }
        });
    }
}