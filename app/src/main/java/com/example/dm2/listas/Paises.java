package com.example.dm2.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Paises extends AppCompatActivity {

    private Spinner cmbPais;
    private TextView txt , txt_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paises);

        cmbPais = (Spinner)  findViewById(R.id.cmbPaises);

        final String[] datos = new String[] {"Ninguno ","Alemania",
                "China","Brasil", "España", "Australia"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, datos);
        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        cmbPais.setAdapter( adaptador );

        txt     = (TextView) findViewById(R.id.txt1);
        txt_2   = (TextView) findViewById(R.id.txt2);

        cmbPais.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                if ( cmbPais.getSelectedItem().toString().equalsIgnoreCase("Alemania" ) ){
                    txt.setText( "Población:  82.605.000" );
                    txt_2.setText( "Superficie: 357.000 km²" );
                }

                if (cmbPais.getSelectedItem().toString().equalsIgnoreCase("China" ) ){
                    txt.setText( "Población:  1.380.996.000" );
                    txt_2.setText( "Superficie: 9.600.000 km²" );
                }

                if (cmbPais.getSelectedItem().toString().equalsIgnoreCase("Brasil" ) ){
                    txt.setText( "Población:  207.012.000" );
                    txt_2.setText( "Superficie: 8.515.000 km²" );
                }

                if (cmbPais.getSelectedItem().toString().equalsIgnoreCase("España" ) ){
                    txt.setText( "Población:  46.491.000" );
                    txt_2.setText( "Superficie: 505.400km²" );
                }

                if (cmbPais.getSelectedItem().toString().equalsIgnoreCase("Australia" ) ){
                    txt.setText( "Población:  24.260.000" );
                    txt_2.setText( "Superficie: 7.690.000 km²" );
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                txt.setText("No se ha realizado ninguna selección");
            }
        });

    }




   }
