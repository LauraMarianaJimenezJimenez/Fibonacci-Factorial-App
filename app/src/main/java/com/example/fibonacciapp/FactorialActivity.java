package com.example.fibonacciapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class FactorialActivity extends AppCompatActivity {
    TextView txtOperacionF, txtResultadoF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);
        txtOperacionF = findViewById(R.id.txtOpreacionF);
        txtResultadoF = findViewById(R.id.txtResultadoF);
    }
}