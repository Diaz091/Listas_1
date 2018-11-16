package com.example.dm2.listas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejer1(View view) {
        Intent pais = new Intent(this , Paises.class);
        startActivity( pais );
    }

    public void ejer2(View view) {
        Intent webs = new Intent(this , Webs.class);
        startActivity( webs );
    }

    public void salir(View view) {
        finish();
    }
}
