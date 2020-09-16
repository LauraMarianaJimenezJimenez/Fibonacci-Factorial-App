package com.example.fibonacciapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DetailCountryActivity extends AppCompatActivity {

    TextView txtNombre, txtCapital, txtNombreI, txtSiglas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_country);

        txtNombre = findViewById(R.id.txtNombre);
        txtCapital = findViewById(R.id.txtCapital);
        txtNombreI = findViewById(R.id.txtNombreI);
        txtSiglas = findViewById(R.id.txtSiglas);

        String nombre = getIntent().getStringExtra("nombre");
        String capital = getIntent().getStringExtra("capital");
        String nombreI = getIntent().getStringExtra("nombreI");
        String siglas = getIntent().getStringExtra("sigla");

        txtNombre.setText(nombre);
        txtNombre.setTextSize(15);
        txtCapital.setText(capital);
        txtCapital.setTextSize(15);
        txtNombreI.setText(nombreI);
        txtNombreI.setTextSize(15);
        txtSiglas.setText(siglas);
        txtSiglas.setTextSize(15);




    }
}