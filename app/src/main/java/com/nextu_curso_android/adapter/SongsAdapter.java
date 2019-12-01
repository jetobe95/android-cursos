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
import com.nextu_curso_android.modelo.Song;

import java.util.List;

public class SongsAdapter extends ArrayAdapter<Song> {

    public SongsAdapter(Context context, List<Song> songs) {
        super(context, R.layout.song_template, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());

        Song song = getItem(position);

        View songItem = layoutInflater.inflate(R.layout.song_template,null);

        TextView name = songItem.findViewById(R.id.title);
        TextView artist = songItem.findViewById(R.id.artist);

        name.setText(song.getTitle());
        artist.setText(song.getArtist());


        return songItem;
    }
}
