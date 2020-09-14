package com.example.fibonacciapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        Intent intent = getIntent();
        int factorial = intent.getIntExtra("factorial",5);

        String operacion = obtenerOperacion(factorial);
        int resultado = calcularFactorial(factorial);

        String text = "Operación = " + operacion;
        txtOperacionF.setText(text);
        String text2 = "Resultado = " + String.valueOf(resultado);
        txtResultadoF.setText(text2);

    }

    public int calcularFactorial(int num){
        int res = 1;
        for (int i = 2; i<=num; i++){
            res *= i;
        }
        return res;
    }

    public String obtenerOperacion(int num){
        String ope = "1";
        for (int i = 2; i <= num; i++){
            ope += "*" + String.valueOf(i);
        }
        return ope;
    }
}