package com.example.esisba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class loginact extends AppCompatActivity {
    ImageView back;
    FirebaseAuth mauth ;
    EditText email , pass ;
    Button signin ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginact);
        init();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(loginact.this,Activity1.class);
                startActivity(i);
                finish();
            }
        });




        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().isEmpty()){
                    email.setError("please don't leave email empty");
                }else  if (pass.getText().toString().isEmpty()){
                    pass.setError("please don't leave password empty");
                } else {
                    signine();
                }
            }
        });



    }



    public  void init(){
        back = findViewById(R.id.back);
        mauth = FirebaseAuth.getInstance();
        email = findViewById(R.id.email) ;
        pass = findViewById(R.id.pass);
        signin = findViewById(R.id.login) ;

    }


    public void signine(){
        String my_email = email.getText().toString();
        String my_pass = pass.getText().toString();
        mauth.signInWithEmailAndPassword(my_email,my_pass)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Intent i = new Intent(loginact.this,lesannes.class);
                            startActivity(i);
                            finish();
                        }else {
                            Toast.makeText(loginact.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });


    }




}