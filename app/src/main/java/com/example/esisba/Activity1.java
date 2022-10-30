package com.example.esisba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity1 extends AppCompatActivity {
    Button login , signup;
    ImageView bilinsta ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


        login = findViewById(R.id.login) ;
        signup = findViewById(R.id.signup) ;
        bilinsta = findViewById(R.id.bilinsta);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity1.this,loginact.class);
                startActivity(i);
                finish();
            }
        });



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity1.this,signupact.class);
                startActivity(i);
                finish();
            }
        });


        bilinsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.instagram.com/bilel_hichem/?hl=fr");
            }
        });



    }


    public void gotourl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }





}