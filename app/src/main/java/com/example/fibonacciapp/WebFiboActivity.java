package com.example.fibonacciapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebFiboActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_fibo);


        WebView wbvFiboBiografia = findViewById(R.id.wbvFiboBiografia);
        wbvFiboBiografia.loadUrl("https://es.wikipedia.org/wiki/Leonardo_de_Pisa");
    }
}