package com.example.apirest;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PersonaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.persona_layout);

        TextView nombres = (TextView)findViewById(R.id.nombres);
        EditText txtNombres = (EditText) findViewById(R.id.txtNombres);
        TextView apellidos = (TextView)findViewById(R.id.apellidos);
        EditText txtApellidos = (EditText) findViewById(R.id.txtApellidos);
        
    }
}
