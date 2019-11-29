package com.nextu_curso_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import  com.z.librerias.Promedio;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);



        setContentView(R.layout.combinando_layout_ejer2);
        final Promedio prome = new Promedio();
        Log.i("TAG",prome.calavg());


    }
}
