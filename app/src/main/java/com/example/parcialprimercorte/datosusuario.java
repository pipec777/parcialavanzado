package com.example.parcialprimercorte;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class datosusuario extends AppCompatActivity {
    private TextView ne1;
    private TextView ne2;
    private TextView ae1;
    private datos registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datosusuario);
        ne1=findViewById(R.id.usuest);
        ne2=findViewById(R.id.contres);
        ae1=findViewById(R.id.nota);
        registro= new datos("Felipe","BOGOTA");
        datos nt = new datos();

        ne1.setText(datos.getNombre());

    }
}