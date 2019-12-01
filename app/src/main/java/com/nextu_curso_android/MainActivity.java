package com.nextu_curso_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.nextu_curso_android.adapter.DiaHorarioAdapter;
import com.nextu_curso_android.modelo.DiaHorario;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private  static  final String STATE_MESSAGE = "Estado mensaje";

    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinners);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.horario_de_clases,android.R.layout.simple_spinner_item);
        List<DiaHorario> horarios = new ArrayList<>();

        horarios.add(new DiaHorario("Mater","Dia"));
        DiaHorarioAdapter diaHorarioAdapter = new DiaHorarioAdapter(this,horarios);
        spinner = findViewById(R.id.sp1);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);





    }



}
