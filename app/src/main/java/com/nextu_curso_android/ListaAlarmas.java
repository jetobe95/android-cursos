package com.nextu_curso_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.nextu_curso_android.adapter.AlarmaAdapter;
import com.nextu_curso_android.modelo.Alarma;

import java.util.ArrayList;
import java.util.List;

public class ListaAlarmas extends AppCompatActivity {

    private ListView listView;
    private List<Alarma> alarmas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alarmas);
        listView = findViewById(R.id.alarmas);
        String [] alarmasString = getResources().getStringArray(R.array.alarmas);

        alarmas = new ArrayList<>();

        for (int i=0 ;i <alarmasString.length;i++){
            alarmas.add(new Alarma(alarmasString[i],getResources().getString(R.string.activado)));
        }


        AlarmaAdapter alarmaAdapter = new AlarmaAdapter(this,alarmas);
        listView.setAdapter(alarmaAdapter);
    }
}
