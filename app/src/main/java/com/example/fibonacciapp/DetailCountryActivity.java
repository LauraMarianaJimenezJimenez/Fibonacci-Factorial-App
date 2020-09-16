package com.example.fibonacciapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailCountryActivity extends AppCompatActivity {

    TextView txtNombre, txtCapital, txtNombreI, txtSiglas;
    ImageView imgPais;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_country);

        txtNombre = findViewById(R.id.txtNombre);
        txtCapital = findViewById(R.id.txtCapital);
        txtNombreI = findViewById(R.id.txtNombreI);
        txtSiglas = findViewById(R.id.txtSiglas);
        imgPais = findViewById(R.id.imgPais);

        String nombre = getIntent().getStringExtra("nombre");
        String capital = getIntent().getStringExtra("capital");
        String nombreI = getIntent().getStringExtra("nombreI");
        String siglas = getIntent().getStringExtra("sigla");
        url = "https://www.countryflags.io/" + siglas + "/flat/64.png";
        Picasso.get().load(url).resize(500,450).into(imgPais);

        txtNombre.setText(nombre);
        txtNombre.setTextSize(20);
        txtCapital.setText(capital);
        txtCapital.setTextSize(20);
        txtNombreI.setText(nombreI);
        txtNombreI.setTextSize(20);
        txtSiglas.setText(siglas);
        txtSiglas.setTextSize(20);





    }
}