package com.example.fibonacciapp;

public class Pais {

    String nombre;
    String capital;
    String nombreI;
    String sigla;

    public String getNombreI()
    {
        return nombreI;
    }

    public void setNombreI(String nombreI) {
        this.nombreI = nombreI;
    }

    public String getSigla()
    {
        return sigla;
    }

    public void setSigla(String sigla)
    {
        this.sigla = sigla;
    }

    public Pais(String nombre, String capital, String nombreI, String sigla)
    {
        this.capital = capital;
        this.nombre = nombre;
        this.nombreI = nombreI;
        this.sigla = sigla;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getCapital()
    {
        return capital;
    }

    public void setCapital(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public String toString()
    {
        return nombre;
    }


}
