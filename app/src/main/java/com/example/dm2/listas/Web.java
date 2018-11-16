package com.example.dm2.listas;

import android.graphics.drawable.Drawable;

public class Web {


    Drawable img;
    String nombre,url;


    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }

    public Drawable getImg() {
        return img;
    }

    Web( Drawable i,String n, String u){
        img=i;
        nombre=n;
        url=u;

    }
}