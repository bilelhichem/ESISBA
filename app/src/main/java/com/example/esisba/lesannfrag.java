package com.example.esisba;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class lesannfrag extends Fragment {
    View mview;
    Button cpi1, cpi2, cs1 ,Concours;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.fragment_lesannfrag, container, false);

        init();
        cpi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), semestre.class);
                i.putExtra("annes", "cpi1");
                startActivity(i);

            }
        });


        cpi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), semestre.class);
                i.putExtra("annes", "cpi2");
                startActivity(i);

            }
        });


        cs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), semestre.class);
                i.putExtra("annes", "cs1");
                startActivity(i);

            }
        });


        Concours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), semestre.class);
                i.putExtra("annes", "concour");
                startActivity(i);

            }
        });


        return mview;
    }


    public void init() {
        cpi1 = mview.findViewById(R.id.cpi1);
        cpi2 = mview.findViewById(R.id.cpi2);
        cs1 = mview.findViewById(R.id.cs1);
        Concours = mview.findViewById(R.id.concour);


    }


}
