package com.canete.mascomponentes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Spinner lstColores = findViewById(R.id.lstColores);

        lstColores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                System.out.println("Posicion: " + position);
                System.out.println("Texto:  "+ item);

            }

            public void onNothingSelected(AdapterView<?> parent){
                System.out.println("No has seleccionado nada");
            }
        });
    }
}