package com.example.fibonacciapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FibonacciActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        String numFibo = getIntent().getStringExtra("numFibo");
        Log.i("Numero",numFibo);
        Integer n = Integer.parseInt(numFibo);

        Fibo(n);

    }

    public void Fibo(Integer n)
    {
        int t1 = 0, t2 = 1;
        String num;
        num = Integer.toString(t1);
        LinearLayout llFibo = (LinearLayout) findViewById(R.id.llFibo);
        TextView textViewNum = new TextView(this);
        textViewNum.setText(num);
        textViewNum.setTextSize(25);
        llFibo.addView(textViewNum);
        for (int i = 1; i <= n; ++i)
        {
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            num = Integer.toString(t1);
            TextView textViewNum2 = new TextView(this);
            textViewNum2 .setText(num);
            textViewNum2.setTextSize(25);
            llFibo.addView(textViewNum2);
        }

    }

}