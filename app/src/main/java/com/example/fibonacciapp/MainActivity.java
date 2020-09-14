package com.example.fibonacciapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btnFibo, btnFact, btnPaises;
    Spinner spnNumeros;
    EditText edtFiboNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFact = findViewById(R.id.btbFact);
        btnFibo = findViewById(R.id.btnFibo);
        btnPaises = findViewById(R.id.btnPaises);
    }
}