package com.example.esisba.ViewHorder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esisba.R;
public class moduleviewhorder extends RecyclerView.ViewHolder {
    public ImageView picmodule ;
    public   TextView namemodule ;


    public moduleviewhorder(@NonNull View itemView) {
        super(itemView);
        picmodule = itemView.findViewById(R.id.picmodule);
        namemodule = itemView.findViewById(R.id.namemodule);
    }
}
