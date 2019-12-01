package com.nextu_curso_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private  static  final String STATE_MESSAGE = "Estado mensaje";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_adapter_1);





    }

    public void irAlarmas(View view){
        Intent intent = new Intent(this,ListaAlarmas.class);
        startActivity(intent);
    }

    public void irReproctor(View view){
        Intent intent = new Intent(this,ReproductorActivity.class);
        startActivity(intent);
    }

}
