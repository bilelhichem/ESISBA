package com.example.esisba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class semestre extends AppCompatActivity {
    Button semestre1 ;
    Button semestre2 ;
    String y ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semestre);
        semestre1 = findViewById(R.id.semestre1);
        semestre2 = findViewById(R.id.semestre2);
        y = getIntent().getStringExtra("annes");


        if (y.equals("concour")){
            Intent i = new Intent(semestre.this,moduleannes.class);
            i.putExtra("ann",y);
            startActivity(i);
            finish();

        }
        else {
            semestre1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(semestre.this,moduleannes.class);
                    i.putExtra("seman",y+"semestr1");
                    i.putExtra("ann",y);
                    startActivity(i);


                }
            });

            semestre2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(semestre.this,moduleannes.class);
                    i.putExtra("seman",y+"semestr2");
                    i.putExtra("ann",y);
                    startActivity(i);


                }
            });

        }





    }






}