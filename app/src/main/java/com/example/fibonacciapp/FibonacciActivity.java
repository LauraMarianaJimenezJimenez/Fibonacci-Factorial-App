package com.example.fibonacciapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FibonacciActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

            String numFibo = getIntent().getStringExtra("numFibo");
            Long n = Long.parseLong(numFibo);

            Fibo(n);
            ImageButton btnImageFibo;
            btnImageFibo = findViewById(R.id.imgFibo);
            btnImageFibo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(),WebFiboActivity.class);
                    startActivity(intent);
                }
            });

        }




    public void Fibo(Long n)
    {
        int t1 = 0, t2 = 1;
        String num;
        num = Long.toString(t1);
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
            num = Long.toString(t1);
            TextView textViewNum2 = new TextView(this);
            textViewNum2 .setText(num);
            textViewNum2.setTextSize(25);
            llFibo.addView(textViewNum2);
        }

    }

}