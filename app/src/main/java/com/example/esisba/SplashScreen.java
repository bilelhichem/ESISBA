package com.example.esisba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;

public class SplashScreen extends AppCompatActivity {
    FirebaseAuth mauth ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        mauth = FirebaseAuth.getInstance();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                if (mauth.getCurrentUser() != null){
                    Intent i = new Intent(SplashScreen.this,lesannes.class);
                    startActivity(i);
                    finish();

                }else {

                    Intent i = new Intent(SplashScreen.this,Activity1.class);
                    startActivity(i);
                    finish();}
            }
        },800);

    }
}