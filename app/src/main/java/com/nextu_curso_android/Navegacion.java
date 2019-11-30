package com.nextu_curso_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf("Ciclo de vida 2","onStart");
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf("Ciclo de vida 2","onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf("Ciclo de vida 2","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf("Ciclo de vida 2","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf("Ciclo de vida 2","onDestroy");
    }

}
