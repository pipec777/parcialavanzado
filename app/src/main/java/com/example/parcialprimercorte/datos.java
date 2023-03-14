package com.example.parcialprimercorte;

import java.io.Serializable;
public class datos implements Serializable {

    private String nombre;
    private String cuidad;


    datos()
    {
        this.nombre="";
        this.cuidad="";

    }

    datos(String nombre, String cuidad){

        this.nombre=nombre;
        this.cuidad=cuidad;
    }

    public static String getNombre() {


        return nombre;
    }

    public String getCuidad() {

        return cuidad;
    }

}

