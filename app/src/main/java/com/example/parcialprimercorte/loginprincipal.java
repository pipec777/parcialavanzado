package com.example.parcialprimercorte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class loginprincipal extends AppCompatActivity {


    private Button consulta;
    private EditText usu;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        consulta=findViewById(R.id.consulta);
        usu=findViewById(R.id.usuario);
        pass=findViewById(R.id.contrasena);
        consulta.setOnClickListener(view -> {



            Intent con = new Intent(loginprincipal.this, datosusuario.class);
            startActivity(con);
        });
    }

}