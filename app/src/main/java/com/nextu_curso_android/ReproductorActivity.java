package com.nextu_curso_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.nextu_curso_android.adapter.SongsAdapter;
import com.nextu_curso_android.modelo.Song;

import java.util.ArrayList;
import java.util.List;

public class ReproductorActivity extends AppCompatActivity {

    private List<Song> songs;
    SongsAdapter songsAdapter;
    EditText songName,songArtist;
    TextView player;
    ListView songListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        songs = new ArrayList<>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);


        songListView = findViewById(R.id.songsList);
        songName = findViewById(R.id.songName);
        songArtist = findViewById(R.id.songArtist);
        player = findViewById(R.id.player);



        songsAdapter = new SongsAdapter(this,songs);

        songListView.setAdapter(songsAdapter);

        songListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Song song = songs.get(i);

                player.setText("Reproduciendo "+ song.getTitle());

            }
        });

    }

    public void addSong(View view){
        String name = songName.getText().toString();
        String artist = songArtist.getText().toString();

        if(name.isEmpty()|| artist.isEmpty()){
             Toast.makeText(this,"Campos vacíos",Toast.LENGTH_LONG).show();

        }else {
            songs.add(new Song(name,artist));
            songsAdapter.notifyDataSetChanged();
            songName.setText("");
            songArtist.setText("");
        }


    }


}
