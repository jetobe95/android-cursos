package com.nextu_curso_android;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  static  final String STATE_MESSAGE = "Estado mensaje";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.wtf("Ciclo de vida","onCreate");


    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf("Ciclo de vida","onStart");
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf("Ciclo de vida","onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf("Ciclo de vida","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf("Ciclo de vida","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf("Ciclo de vida","onDestroy");
    }

    public void navegar(View view ){
        Intent intent =  new Intent(this,Navegacion.class);

        startActivity(intent);
    }


    public void mostrarTexto(View view ){

    }



    @Override
    public void onSaveInstanceState( Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        //outState.putString(STATE_MESSAGE);

    }
}
