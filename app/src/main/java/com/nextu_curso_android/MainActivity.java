package com.nextu_curso_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numA;
    private EditText numB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numA = findViewById(R.id.numberA);
        numB = findViewById(R.id.numberB);

    }

    public  void navegar(View view){
        double txtA = Double.parseDouble(numA.getText().toString());
        double txtB = Double.parseDouble(numB.getText().toString());
        Intent intent = new Intent(this,Navegacion.class);
        intent.putExtra("a",txtA);
        intent.putExtra("b",txtB);


        startActivity(intent);
    }


}
