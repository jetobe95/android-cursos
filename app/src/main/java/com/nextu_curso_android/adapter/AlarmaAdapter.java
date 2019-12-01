package com.nextu_curso_android.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.nextu_curso_android.R;
import com.nextu_curso_android.modelo.Alarma;

import java.util.List;

public class AlarmaAdapter extends ArrayAdapter<Alarma> {

    public AlarmaAdapter(Context context, List<Alarma> alarmas) {
        super(context, R.layout.alarma_template, alarmas);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater =  LayoutInflater.from(getContext());

        View itemAlarm = layoutInflater.inflate(R.layout.alarma_template,null);

        TextView tituloAlarma = itemAlarm.findViewById(R.id.alarm);
        final TextView estadoAlarma = itemAlarm.findViewById(R.id.estado);
        Switch alarmActive    = itemAlarm.findViewById(R.id.active);


        Alarma alarma = getItem(position);

        tituloAlarma.setText(alarma.getFecha());
        estadoAlarma.setText(R.string.desactivado);

        alarmActive.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    estadoAlarma.setText(R.string.activado);
                } else {
                    estadoAlarma.setText(R.string.desactivado);
                }
            }
        });


        return  itemAlarm;
    }
}
