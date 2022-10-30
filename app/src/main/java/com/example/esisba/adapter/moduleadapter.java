package com.example.esisba.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esisba.Model.modelmodule;
import com.example.esisba.R;
import com.example.esisba.ViewHorder.moduleviewhorder;
import com.example.esisba.moduleannes;

import java.util.ArrayList;

public class moduleadapter extends  RecyclerView.Adapter<moduleviewhorder> {
Context context ;
ArrayList<modelmodule> modelmodules;

    public moduleadapter(Context context, ArrayList<modelmodule> modelmodules) {
        this.context = context;
        this.modelmodules = modelmodules;
    }

    @NonNull
    @Override
    public moduleviewhorder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.module,parent,false);
        return new moduleviewhorder(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull moduleviewhorder holder, int position) {
        holder.namemodule.setText(modelmodules.get(position).getNamemodule());

        holder.picmodule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (modelmodules.get(position).getNamemodule().equals("ANA1")){
                    gotourl("https://drive.google.com/drive/folders/1iZuR38HOX3p8As-tAZv4fBJ0QprruHfK");
                } else if (modelmodules.get(position).getNamemodule().equals("Algèbre 1")){
                    gotourl("https://drive.google.com/drive/folders/1gYPw7KX5OKzY6D_ap6jIbwtBW2ylI1qA");
                } else if (modelmodules.get(position).getNamemodule().equals("ALSDS")) {
                    gotourl("https://drive.google.com/drive/folders/1JMdHtBTNN9kn3bzPxfFID_eCT3W3kFve");
                } else if (modelmodules.get(position).getNamemodule().equals("BWEB")){
                    gotourl("https://drive.google.com/drive/folders/1-hfGDNLTYLdo09JZDBzddlCXvrswQoqH");
                } else if (modelmodules.get(position).getNamemodule().equals("ELECT")){
                    gotourl("https://drive.google.com/drive/folders/1uYtJSesGf9iLIdlO98gMcng8JgL5nVoh");
                } else if (modelmodules.get(position).getNamemodule().equals("SYST1")){
                    gotourl("https://drive.google.com/drive/folders/1_gcj3jeYxvQYUFiiCQsPO6w7kh0H2p-k");
                }else if (modelmodules.get(position).getNamemodule().equals("TEE")){
                    gotourl("https://drive.google.com/drive/folders/1DMliwxMatroivYIeDimmvwM9H5dEgmul");
                }else if (modelmodules.get(position).getNamemodule().equals("ARCHI1")){
                    gotourl("https://drive.google.com/drive/folders/12jZLzde7lEnbDmhWa5bO2pqT9O0B0nrZ");
                } else if (modelmodules.get(position).getNamemodule().equals("ANA2")){
                    gotourl("https://drive.google.com/drive/folders/1H1AovChhsN-E_ZtuOOUXfxbIMGSvo2MA");
                } else if (modelmodules.get(position).getNamemodule().equals("Algèbre 2")){
                    gotourl("https://drive.google.com/drive/folders/1rFYCLBBUDXeDLQMN3xmdBnE7d80YlT0S");
                } else if (modelmodules.get(position).getNamemodule().equals("ALSDD")) {
                    gotourl("https://drive.google.com/drive/folders/1JqQnxkdFrF9lGpX6lhdHvAzQ1uPFbPMH");
                } else if (modelmodules.get(position).getNamemodule().equals("ANG1")){
                    gotourl("https://drive.google.com/drive/folders/1MZCcG2A60QLcO7Z2zveY8uWlFNKt6r32");
                } else if (modelmodules.get(position).getNamemodule().equals("ELECF1")){
                    gotourl("https://drive.google.com/drive/folders/163c8Pv4GUDhns5Hd6oJfuG-A7dLwEyEN");
                } else if (modelmodules.get(position).getNamemodule().equals("MECA")){
                    gotourl("https://drive.google.com/drive/folders/1hYmTRPFI19bPx8NiXyIqBLvTCkWlFAEK");
                }else if (modelmodules.get(position).getNamemodule().equals("SYST2")){
                    gotourl("https://drive.google.com/drive/folders/17heSpEyjLuOaS9epHIZfb5tbIk5n3pz-");
                }else if (modelmodules.get(position).getNamemodule().equals("TEO")){
                    gotourl("https://drive.google.com/drive/folders/1FDFZEUG4W58xl0oUwiAJRb-_ypgxQgUE");
                } else if (modelmodules.get(position).getNamemodule().equals("ANA3")){
                    gotourl("https://drive.google.com/drive/folders/1dGbU14LEC68xPYJI-pc5UBZSOwiK8e8h");
                } else if (modelmodules.get(position).getNamemodule().equals("Algèbre 3")) {
                    gotourl("https://drive.google.com/drive/folders/13sBrfzPYl7cWxcU_JDpP45CtQXxusnU4");
                } else if (modelmodules.get(position).getNamemodule().equals("ANG2")){
                    gotourl("https://drive.google.com/drive/folders/13nEVxVtvx8t9ClrWHb5iUTv2FA0bFLkj");
                } else if (modelmodules.get(position).getNamemodule().equals("PRST1")){
                    gotourl("https://drive.google.com/drive/folders/1fha4zXPlDwQEt_uK_0KQnZ0YtDVcGkda");
                } else if (modelmodules.get(position).getNamemodule().equals("ELECF2")){
                    gotourl("https://drive.google.com/drive/folders/1ka45Tv6vE-sEd0Zw2f9J84CyPq_F7WYu");
                }else if (modelmodules.get(position).getNamemodule().equals("SFSD")){
                    gotourl("https://drive.google.com/drive/folders/1IWOjQBM0eBMkH-9Gy11rQcZSMomQEega");
                }else if (modelmodules.get(position).getNamemodule().equals("ECON")){
                    gotourl("https://drive.google.com/drive/folders/1Ph5YKo2LBK9yu8LNpCt8O8juPinhXkmm");
                } else if (modelmodules.get(position).getNamemodule().equals("ARCHI2")){
                    gotourl("https://drive.google.com/drive/folders/15bCBZK9mo3OVHKmJk06iw_eViAazy7LJ");
                } else if (modelmodules.get(position).getNamemodule().equals("ANA4")){
                    gotourl("https://drive.google.com/drive/folders/18OK1wi24FzSQuaOYwpUJVt5wenPeWKT1");
                } else if (modelmodules.get(position).getNamemodule().equals("ANG3")) {
                    gotourl("https://drive.google.com/drive/folders/1jQ2ARe-EaT3qmKDhDEKJU2oNxjLhtA-I");
                } else if (modelmodules.get(position).getNamemodule().equals("ISI")){
                    gotourl("https://drive.google.com/drive/folders/19oI8MB8wCyf173lZE2aBzyNKAor1Q1u2");
                } else if (modelmodules.get(position).getNamemodule().equals("LOGM")){
                    gotourl("https://drive.google.com/drive/folders/1D4L4KXS3aZ_-ZkZCk7_nfE0X3gy0wPbq");
                } else if (modelmodules.get(position).getNamemodule().equals("OOE")){
                    gotourl("https://drive.google.com/drive/folders/14PkJ7DPhRowa-ngNCC3D2ciEjPKv-ZZk");
                }else if (modelmodules.get(position).getNamemodule().equals("POO")){
                    gotourl("https://drive.google.com/drive/folders/1mIOlacQWhX9iC6Dp0kMWE1PLVxco1oto");
                }else if (modelmodules.get(position).getNamemodule().equals("PRST2")){
                    gotourl("https://drive.google.com/drive/folders/1uU4MORfOXm3PcJrQ5BSIRWOjYMpDpQuL");
                } else if (modelmodules.get(position).getNamemodule().equals("Système d'Exploitation 1")){
                    gotourl("https://drive.google.com/drive/folders/1GZmuwCMCLTWUOfSShTHJUMAJp357KjE6");
                } else if (modelmodules.get(position).getNamemodule().equals("Réseaux 1")) {
                    gotourl("https://drive.google.com/drive/folders/1AsZvXi-p9xJTZEF9O-0ppvSleuSydrh7");
                } else if (modelmodules.get(position).getNamemodule().equals("Introduction au Génie Logiciel")){
                    gotourl("https://drive.google.com/drive/folders/1FMiL1GmtiPrL4OmAwzSkXVc6rOg59S0N");
                } else if (modelmodules.get(position).getNamemodule().equals("Bases de Données")){
                    gotourl("https://drive.google.com/drive/folders/1zE1iMbCRLi9gC4GJ9a6Ukw9oZihm2cdD");
                } else if (modelmodules.get(position).getNamemodule().equals("Théorie des Langages")){
                    gotourl("https://drive.google.com/drive/folders/1Y62x_ZqFHTVykYFTHKkY8dRMgjTL0aav");
                }else if (modelmodules.get(position).getNamemodule().equals("Analyse Numérique")){
                    gotourl("https://drive.google.com/drive/folders/1RQ04sDs9vdEoAsb_wGwWLNdh3dsGx5gW");
                }else if (modelmodules.get(position).getNamemodule().equals("Recherche Opérationnelle")){
                    gotourl("https://drive.google.com/drive/folders/1G22G9sntPv3AbRmKvbERSEp7QJyjh-Cx");
                }else if (modelmodules.get(position).getNamemodule().equals("Langue Anglaise 1")){
                    gotourl("https://drive.google.com/drive/folders/1xVxcCpk5J_csf8eXatzSTi8vQFzr_ILx");
                } else if (modelmodules.get(position).getNamemodule().equals("Système d'Exploitation 2")){
                    gotourl("https://drive.google.com/drive/folders/148URolWyEtwZ9tPb1yhr670wJISKXHJf");
                } else if (modelmodules.get(position).getNamemodule().equals("Réseaux 2")) {
                    gotourl("https://drive.google.com/drive/folders/1KUzPZu5MDpG3wEJ7qaYggY64egOXEEmR");
                } else if (modelmodules.get(position).getNamemodule().equals("Architectures Évoluées des Ordinateurs")){
                    gotourl("https://drive.google.com/drive/folders/1KUzPZu5MDpG3wEJ7qaYggY64egOXEEmR");
                } else if (modelmodules.get(position).getNamemodule().equals("Analyse et conception des Systèmes d’information")){
                    gotourl("https://drive.google.com/drive/folders/1OgeD75cPfTW8NSlG22XvcCGK6mAvauGD");
                } else if (modelmodules.get(position).getNamemodule().equals("Langages et Outils du Web")){
                    gotourl("https://drive.google.com/drive/folders/18d1UlW1LLTN8FlE0zT7TXwAkDI3lGzjY");
                }else if (modelmodules.get(position).getNamemodule().equals("Introduction à la Sécurité Informatique")){
                    gotourl("https://drive.google.com/drive/folders/1HNZXL6VOUYBFF7EhfpWti6WNqc5c0RVv");
                }else if (modelmodules.get(position).getNamemodule().equals("Gestion de Projets")){
                    gotourl("https://drive.google.com/drive/folders/1JLMKTk4wyMXRJvULjmvrncuDzxqeeDeW");
                }else if (modelmodules.get(position).getNamemodule().equals("Langue Anglaise 2")){
                    gotourl("https://drive.google.com/drive/folders/1clTvQu-ZOuwmT_Xt7QXG8T4zqq1CPM1E");
                } else if (modelmodules.get(position).getNamemodule().equals("2014")){
                    gotourl("https://drive.google.com/drive/folders/12i0dXvWmIRYRP3sh54s9Plsv20DTXdZo");
                }else if (modelmodules.get(position).getNamemodule().equals("2015")){
                    gotourl("https://drive.google.com/drive/folders/1LQiXMwFoEqfqTIKRsHBC7A7ElBYbYXJt");
                } else if (modelmodules.get(position).getNamemodule().equals("2016")){
                    gotourl("https://drive.google.com/drive/folders/1pP-H_xUeicyHb3kuTHZS0cz4hbGIImES");
                }else if (modelmodules.get(position).getNamemodule().equals("2017")){
                    gotourl("https://drive.google.com/drive/folders/1XTsMG_zrDh_yPqamHNITMK46k0kT-x8S");
                }else if (modelmodules.get(position).getNamemodule().equals("2018")){
                    gotourl("https://drive.google.com/drive/folders/1IAdxD44BV8dQcR0NJsM2tvSkN5VToFwP");
                }else if (modelmodules.get(position).getNamemodule().equals("2019")){
                    gotourl("https://drive.google.com/drive/folders/1ChA7gChrR_xMUbTNahMY1B5afyEQn5vd");
                }else if (modelmodules.get(position).getNamemodule().equals("2020")){
                    gotourl("https://drive.google.com/drive/folders/1b_9bqw9V4S3ny1oTWR2hrfmUZYYP6F2c");
                }else if (modelmodules.get(position).getNamemodule().equals("2021")){
                    gotourl("https://drive.google.com/drive/folders/1Mauu1rz79hSnsNJmZrI-_VxLIwyfx_IZ");
                }









            }
        });



    }

    @Override
    public int getItemCount() {
        return modelmodules.size();
    }






    public void gotourl(String s){
        Uri uri = Uri.parse(s);
        context.startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }






}
