package com.example.esisba.Model;

import com.example.esisba.moduleannes;

public class modelmodule extends moduleannes {
    public   String picmodule ;
    public   String namemodule ;

    public modelmodule(String picmodule, String namemodule) {
        this.picmodule = picmodule;
        this.namemodule = namemodule;
    }

    public modelmodule() {
    }


    public String getPicmodule() {
        return picmodule;
    }

    public void setPicmodule(String picmodule) {
        this.picmodule = picmodule;
    }

    public String getNamemodule() {
        return namemodule;
    }

    public void setNamemodule(String namemodule) {
        this.namemodule = namemodule;
    }
}
