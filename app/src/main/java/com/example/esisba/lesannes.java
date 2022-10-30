package com.example.esisba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class lesannes extends AppCompatActivity {
    ImageView home , profil ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesannes);
        home = findViewById(R.id.home);
        profil = findViewById(R.id.profil);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.FrameFragment,new lesannfrag())
                .commit();
        home.setColorFilter(getColor(R.color.orange));

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FrameFragment,new lesannfrag())
                        .commit();
                home.setColorFilter(getColor(R.color.orange));
                profil.setColorFilter(getColor(R.color.black));
            }
        });



        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FrameFragment,new profilfrag())
                        .commit();
                home.setColorFilter(getColor(R.color.black));
                profil.setColorFilter(getColor(R.color.orange));
            }
        });








    }
}