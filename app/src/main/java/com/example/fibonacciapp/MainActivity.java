package com.example.fibonacciapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button btnFibo, btnFact, btnPaises;
    Spinner spnNumeros;
    EditText edtFiboNumber;
    TextView txtCountFacto, txtCountFibo, txtCountPaises, txtFechaFibo, txtFechaFacto, txtFechaPaises;
    boolean rFibonacci = false, rFactorial = false, rPaises = false;
    int countFibo = 0, countFacto = 0, countPaises = 0;
    String dtFibo, dtFacto, dtPaises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFact = findViewById(R.id.btbFact);
        btnFibo = findViewById(R.id.btnFibo);
        btnPaises = findViewById(R.id.btnPaises);
        edtFiboNumber = findViewById(R.id.edtFiboNumber);
        edtFiboNumber = findViewById(R.id.edtFiboNumber);
        spnNumeros = findViewById(R.id.spnNumeros);
        txtCountFacto = findViewById(R.id.txtCountFacto);
        txtCountFibo = findViewById(R.id.txtCountFibo);
        txtCountPaises = findViewById(R.id.txtCountPaises);
        txtFechaFibo = findViewById(R.id.txtFechaFibo);
        txtFechaFacto = findViewById( R.id.txtFechaFacto);
        txtFechaPaises = findViewById(R.id.txtFechaPaises);

        btnFibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                String num = edtFiboNumber.getText().toString();
                if(num.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Ingrese número Fibonacci", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(view.getContext(),FibonacciActivity.class);
                    intent.putExtra("numFibo", num);
                    startActivity(intent);
                }

            }
        });

        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),FactorialActivity.class);
                String factorialString = spnNumeros.getSelectedItem().toString();
                int factorial = Integer.parseInt(factorialString);
                i.putExtra("factorial", factorial);
                rFactorial = true;
                startActivity(i);
            }
        });

    }

    @Override
    protected void onResume(){
        super.onResume();
        if(rFibonacci == true){
            countFibo ++;
            Date cal = (Date) Calendar.getInstance().getTime();
            dtFibo = cal.toLocaleString();
            txtCountFibo.setText("# Fibonacci: " + countFibo);
            txtFechaFibo.setText("Última vez: " + dtFibo.toString());
            rFibonacci = false;
        }

        if(rFactorial == true){
            countFacto ++;
            Date cal = (Date) Calendar.getInstance().getTime();
            dtFacto = cal.toLocaleString();
            txtCountFacto.setText("# Factorial: " + countFacto);
            txtFechaFacto.setText("Última vez: " + dtFacto.toString());
            rFactorial = false;
        }

        if(rFibonacci == true){
            countPaises ++;
            Date cal = (Date) Calendar.getInstance().getTime();
            dtPaises = cal.toLocaleString();
            txtCountFibo.setText("# Países: " + countPaises);
            txtFechaPaises.setText("Última vez: "+ dtPaises);
            rPaises = false;
        }
    }
}