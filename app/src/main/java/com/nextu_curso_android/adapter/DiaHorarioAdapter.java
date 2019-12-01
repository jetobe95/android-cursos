package com.nextu_curso_android.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.nextu_curso_android.R;
import com.nextu_curso_android.modelo.DiaHorario;

import java.util.List;

public class DiaHorarioAdapter extends ArrayAdapter<DiaHorario> {

    public DiaHorarioAdapter(Context context,List<DiaHorario> objetos) {
        super(context, R.layout.list_template,objetos);
    }


    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());

        View item = layoutInflater.inflate(R.layout.list_template,null);

        TextView titulo = item.findViewById(R.id.titulo);
        TextView subtitulo = item.findViewById(R.id.subtitulo);

        titulo.setText(getItem(position).getAsignatura());
        subtitulo.setText(getItem(position).getDia());

        return  item;
    }
}
