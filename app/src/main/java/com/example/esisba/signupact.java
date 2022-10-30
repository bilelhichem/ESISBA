package com.example.esisba;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


import com.example.esisba.Model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class signupact extends AppCompatActivity {
    ImageView back ;
    FirebaseAuth mauth ;
    DatabaseReference mudb ;
    StorageReference   mref ;
    EditText crname , cremail , crpass , confirmpass ;
    ImageView imgprofil ;
    Button  signup ;
    Uri ImageFIle ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupact);
        init();


        ActivityResultLauncher<Intent> openGalleryResult = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == Activity.RESULT_OK) {
                            // Here, no request code
                            Intent data = result.getData();
                            ImageFIle = data.getData();
                            imgprofil.setImageURI(ImageFIle);
                        }
                    }
                });





        imgprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGalleryResult.launch(opengallery());
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(signupact.this,Activity1.class);
                startActivity(i);
                finish();
            }
        });



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (crname.getText().toString().isEmpty()){
                    crname.setError("please don't leave name empty");
                } else if(cremail.getText().toString().isEmpty()){
                    cremail.setError("please don't leave email empty");
                }else if(crpass.getText().toString().isEmpty()){
                    crpass.setError("please don't leave password empty");
                }else if (confirmpass.getText().toString().isEmpty()){
                    confirmpass.setError("Errore");
                } else if (!confirmpass.getText().toString().equals(crpass.getText().toString())){
                    confirmpass.setError("Password incorrect");
                } else {
                    craccount();
                }

            }
        });




    }











    public  void init(){
        back = findViewById(R.id.back);
        mauth = FirebaseAuth.getInstance();
        mudb = FirebaseDatabase.getInstance(getString(R.string.db_url)).getReference().child("users");
        mref = FirebaseStorage.getInstance().getReference().child("PROFIL IMAGE");
        crname = findViewById(R.id.crname) ;
        cremail = findViewById(R.id.cremail);
        crpass = findViewById(R.id.crpass);
        confirmpass = findViewById(R.id.confirmepass) ;
        imgprofil = findViewById(R.id.imgprofil);
        signup = findViewById(R.id.signup) ;

    }

    public Intent opengallery(){
        Intent i  = new Intent(Intent.ACTION_GET_CONTENT);
        i.setType("image/*");
        return i;
    }


    public void craccount(){

        String cr_email = cremail.getText().toString() ;
        String cr_pass = crpass.getText().toString() ;

        mauth.createUserWithEmailAndPassword(cr_email,cr_pass)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            mref.child("image" + mauth.getCurrentUser().getUid())
                                    .putFile(ImageFIle)
                                    .addOnCompleteListener(new OnCompleteListener<UploadTask.TaskSnapshot>() {
                                        @Override
                                        public void onComplete(@NonNull Task<UploadTask.TaskSnapshot> task) {
                                            if (task.isSuccessful()){
                                                mref.child("image" + mauth.getCurrentUser().getUid())
                                                        .getDownloadUrl()
                                                        .addOnSuccessListener(new OnSuccessListener<Uri>() {
                                                            @Override
                                                            public void onSuccess(Uri uri) {
                                                                String y = uri.toString();
                                                                saveuserindb(new User(cr_email,crname.getText().toString(),y));
                                                            }
                                                        });


                                            }
                                        }
                                    });


                        }
                        else {
                            Toast.makeText(signupact.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });


    }









    public void saveuserindb(User user){
        mudb.child(mauth.getCurrentUser().getUid())
                .setValue(user)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                            Intent i = new Intent(signupact.this,lesannes.class);
                            startActivity(i);
                            finish();

                        }else {
                            Toast.makeText(signupact.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }



                    }
                });


    }









}




