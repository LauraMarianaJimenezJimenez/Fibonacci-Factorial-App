package com.example.fibonacciapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class CountriesList extends AppCompatActivity {

    ArrayList<Pais> paises = new ArrayList<>();
    ListView lstPaises;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries_list);

        try {
            initArray(paises);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        ArrayAdapter<Pais> adapter = new ArrayAdapter<Pais>(this,
                android.R.layout.simple_list_item_1, paises);

        lstPaises = findViewById(R.id.lstPaises);
        lstPaises.setAdapter(adapter);
        lstPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(), DetailCountryActivity.class);
                startActivity(intent);
            }
        });

    }

    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = this.getAssets().open("paises.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    public void initArray(ArrayList<Pais> paises) throws JSONException {

        JSONObject json = new JSONObject(loadJSONFromAsset());
        JSONArray paisesJsonArray = json.getJSONArray("paises");
        for(int i=0;i<paisesJsonArray.length();i++) {
            JSONObject jsonObject = paisesJsonArray.getJSONObject(i);
            String nombre = jsonObject.getString("nombre_pais");
            String capital = jsonObject.getString("capital");
            String nombreI = jsonObject.getString("nombre_pais_int");
            String sigla = jsonObject.getString("sigla");

            Pais pais = new Pais (nombre, capital, nombreI, sigla);
            paises.add(pais);
        }
    }

}