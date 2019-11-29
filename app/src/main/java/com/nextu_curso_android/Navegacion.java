package com.nextu_curso_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Navegacion extends AppCompatActivity {

    private TextView mensaje2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegacion);
        mensaje2 = findViewById(R.id.mensaje2);
        double a = (double) getIntent().getDoubleExtra("a",0.0);
        double b = (double) getIntent().getDoubleExtra("b",0.0);

        mensaje2.setText("EL resultado es  "+ (a+b) );


    }
}
