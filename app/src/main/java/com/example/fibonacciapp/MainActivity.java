package com.example.fibonacciapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        spnNumeros = findViewById(R.id.spnNumeros);
        edtFiboNumber = findViewById(R.id.edtFiboNumber);

        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),FactorialActivity.class);
                String factorialString = spnNumeros.getSelectedItem().toString();
                int factorial = Integer.parseInt(factorialString);
                i.putExtra("factorial", factorial);
                startActivity(i);
            }
        });
    }
}