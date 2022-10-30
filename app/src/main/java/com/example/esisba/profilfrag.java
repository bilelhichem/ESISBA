package com.example.esisba;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class profilfrag extends Fragment {
    ImageView imgpr ;
    TextView namepr ;
    View mview  ;
    FirebaseAuth mauth ;
    DatabaseReference prdb ;
    SharedPreferences myshered ;
    SharedPreferences jibmlsheared ;
    SharedPreferences.Editor  editor ;
    String y ,x;
    Button logoout ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.fragment_profilfrag, container, false) ;

        myshered = getActivity().getSharedPreferences("myshered", Context.MODE_PRIVATE);
        jibmlsheared =getActivity().getSharedPreferences("myshered",0);
        editor = myshered.edit();
        mauth = FirebaseAuth.getInstance();
        prdb = FirebaseDatabase.getInstance(getContext().getString(R.string.db_url)).getReference().child("users").child(mauth.getCurrentUser().getUid());
        imgpr = mview.findViewById(R.id.imgpr);
        namepr = mview.findViewById(R.id.namepr);
        logoout = mview.findViewById(R.id.logout);

        y = jibmlsheared.getString("imgpr" , null);

        if (y == null) {
            prdb.child("imgprofil")
                    .addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            editor.putString("imgpr",snapshot.getValue().toString());
                            editor.commit();
                            y = jibmlsheared.getString("imgpr",null);
                            Picasso.get().load(y)
                                    .into(imgpr);
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
        }else {

            y = jibmlsheared.getString("imgpr",null);
            Picasso.get().load(y)
                    .into(imgpr);

        }



        x = jibmlsheared.getString("name",null) ;
        if (x== null){
            prdb.child("crname").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    editor.putString("name",snapshot.getValue().toString());
                    editor.commit();
                    x = jibmlsheared.getString("name",null);
                    namepr.setText(x);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }else {
            x = jibmlsheared.getString("name",null);
            namepr.setText(x);
        }





        logoout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mauth.signOut();
                editor.clear();
                editor.commit();
                signoutuser();

            }
        });





        return mview;
    }




    public  void signoutuser() {
        Intent i = new Intent(getActivity(), Activity1.class);
        startActivity(i);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i);
    }






}