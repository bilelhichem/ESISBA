package com.example.esisba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.esisba.Model.modelmodule;
import com.example.esisba.adapter.moduleadapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class moduleannes extends AppCompatActivity {
    TextView numdeniv ;
    ImageView imgpr ;
    RecyclerView moduleliste ;
    SharedPreferences myshered ;
    SharedPreferences jibmlsheared ;
    SharedPreferences.Editor  editor ;
    DatabaseReference prdb ;
    FirebaseAuth mauth ;
    String y ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moduleannes);
        init();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        moduleliste.setLayoutManager(gridLayoutManager);
        numdeniv.setText(getIntent().getStringExtra("ann"));


        myshered = getSharedPreferences("myshered", Context.MODE_PRIVATE);
        jibmlsheared = getSharedPreferences("myshered",0);
        editor = myshered.edit();

        y = jibmlsheared.getString("imgpr" , null);

        if (y == null) {
            prdb.child("imgprofil")
                    .addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
        }else {



        }
















        if (getIntent().getStringExtra("ann").equals("cpi1")){
            if (getIntent().getStringExtra("seman").equals("cpi1semestr1")){
                    ArrayList<modelmodule> modulemodule = new ArrayList<>();
                modulemodule.add(new modelmodule(null,"ANA1"));
                modulemodule.add(new modelmodule(null,"Algèbre 1"));
                modulemodule.add(new modelmodule(null,"ALSDS"));
                modulemodule.add(new modelmodule(null,"BWEB"));
                modulemodule.add(new modelmodule(null,"ELECT"));
                modulemodule.add(new modelmodule(null,"SYST1"));
                modulemodule.add(new modelmodule(null,"TEE"));
                modulemodule.add(new modelmodule(null,"ARCHI1"));
                moduleadapter moduleadapter = new moduleadapter(this,modulemodule);
                moduleliste.setAdapter(moduleadapter);
            } else  if (getIntent().getStringExtra("seman").equals("cpi1semestr2")){
                ArrayList<modelmodule> modelmodules = new ArrayList<modelmodule>();
                modelmodules.add(new modelmodule(null,"ANA2"));
                modelmodules.add(new modelmodule(null,"Algèbre 2"));
                modelmodules.add(new modelmodule(null,"ALSDD"));
                modelmodules.add(new modelmodule(null,"ANG1"));
                modelmodules.add(new modelmodule(null,"ELECF1"));
                modelmodules.add(new modelmodule(null,"MECA"));
                modelmodules.add(new modelmodule(null,"SYST2"));
                modelmodules.add(new modelmodule(null,"TEO"));
                moduleadapter moduleadapter = new moduleadapter(this,modelmodules);
                moduleliste.setAdapter(moduleadapter);

            }


        }
        else if (getIntent().getStringExtra("ann").equals("cpi2")){
            if (getIntent().getStringExtra("seman").equals("cpi2semestr1")){
                ArrayList<modelmodule> modelmodules = new ArrayList<modelmodule>();
                modelmodules.add(new modelmodule(null,"ANA3"));
                modelmodules.add(new modelmodule(null,"Algèbre 3"));
                modelmodules.add(new modelmodule(null,"ANG2"));
                modelmodules.add(new modelmodule(null,"ARCHI2"));
                modelmodules.add(new modelmodule(null,"ELECF2"));
                modelmodules.add(new modelmodule(null,"PRST1"));
                modelmodules.add(new modelmodule(null,"SFSD"));
                modelmodules.add(new modelmodule(null,"ECON"));
                moduleadapter moduleadapter = new moduleadapter(this,modelmodules);
                moduleliste.setAdapter(moduleadapter);
            } else  if (getIntent().getStringExtra("seman").equals("cpi2semestr2")){
                ArrayList<modelmodule> modelmodules = new ArrayList<modelmodule>();
                modelmodules.add(new modelmodule(null,"ANA4"));
                modelmodules.add(new modelmodule(null,"ANG3"));
                modelmodules.add(new modelmodule(null,"ISI"));
                modelmodules.add(new modelmodule(null,"LOGM"));
                modelmodules.add(new modelmodule(null,"OOE"));
                modelmodules.add(new modelmodule(null,"POO"));
                modelmodules.add(new modelmodule(null,"PRST2"));
                moduleadapter moduleadapter = new moduleadapter(this,modelmodules);
                moduleliste.setAdapter(moduleadapter);
            }
        }



        else if (getIntent().getStringExtra("ann").equals("cs1")){
            if (getIntent().getStringExtra("seman").equals("cs1semestr1")){
                ArrayList<modelmodule> modelmodules = new ArrayList<modelmodule>();
                modelmodules.add(new modelmodule(null,"Système d'Exploitation 1"));
                modelmodules.add(new modelmodule(null,"Réseaux 1"));
                modelmodules.add(new modelmodule(null,"Introduction au Génie Logiciel"));
                modelmodules.add(new modelmodule(null,"Bases de Données"));
                modelmodules.add(new modelmodule(null,"Théorie des Langages"));
                modelmodules.add(new modelmodule(null,"Analyse Numérique"));
                modelmodules.add(new modelmodule(null,"Recherche Opérationnelle"));
                modelmodules.add(new modelmodule(null,"Langue Anglaise 1"));
                moduleadapter moduleadapter = new moduleadapter(this,modelmodules);
                moduleliste.setAdapter(moduleadapter);
            } else  if (getIntent().getStringExtra("seman").equals("cs1semestr2")){
                ArrayList<modelmodule> modelmodules = new ArrayList<modelmodule>();
                modelmodules.add(new modelmodule(null,"Système d'Exploitation 2"));
                modelmodules.add(new modelmodule(null,"Réseaux 2"));
                modelmodules.add(new modelmodule(null,"Architectures Évoluées des Ordinateurs"));
                modelmodules.add(new modelmodule(null,"Analyse et conception des Systèmes d’information"));
                modelmodules.add(new modelmodule(null,"Langages et Outils du Web"));
                modelmodules.add(new modelmodule(null,"introduction à la Sécurité Informatique"));
                modelmodules.add(new modelmodule(null,"Gestion de Projets"));
                modelmodules.add(new modelmodule(null,"Langue Anglaise 2"));
                moduleadapter moduleadapter = new moduleadapter(this,modelmodules);
                moduleliste.setAdapter(moduleadapter);
            }
        } else if (getIntent().getStringExtra("ann").equals("concour")){

            ArrayList<modelmodule> modelmodules = new ArrayList<modelmodule>();
            modelmodules.add(new modelmodule(null,"2014"));
            modelmodules.add(new modelmodule(null,"2015"));
            modelmodules.add(new modelmodule(null,"2016"));
            modelmodules.add(new modelmodule(null,"2017"));
            modelmodules.add(new modelmodule(null,"2018"));
            modelmodules.add(new modelmodule(null,"2019"));
            modelmodules.add(new modelmodule(null,"2020"));
            modelmodules.add(new modelmodule(null,"2021"));
            moduleadapter moduleadapter = new moduleadapter(this,modelmodules);
            moduleliste.setAdapter(moduleadapter);

        }









    }


    public void init(){
        numdeniv = findViewById(R.id.numdeniv);
        moduleliste = findViewById(R.id.modulelist);
        imgpr = findViewById(R.id.img);
         mauth = FirebaseAuth.getInstance();
        prdb = FirebaseDatabase.getInstance(getString(R.string.db_url)).getReference().child("users").child(mauth.getCurrentUser().getUid());

    }

}