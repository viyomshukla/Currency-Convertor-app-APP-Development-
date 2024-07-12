package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText amt=findViewById(R.id.amt);
                String s=amt.getText().toString();
                int rs=Integer.parseInt(s);
                double dollar = rs*0.012;
                String dollar2=String.valueOf(dollar);
                Toast.makeText(MainActivity.this, dollar2, Toast.LENGTH_SHORT).show();

            }
        });
    }
}