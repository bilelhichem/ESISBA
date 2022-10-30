package com.example.esisba.Model;

public class User {

    public String cremail ;
    public String crname ;
    public String imgprofil ;


    public User() {
    }


    public User(String cremail, String crname, String imgprofil) {
        this.cremail = cremail;
        this.crname = crname;
        this.imgprofil = imgprofil;
    }


    public String getCremail() {
        return cremail;
    }

    public void setCremail(String cremail) {
        this.cremail = cremail;
    }

    public String getCrname() {
        return crname;
    }

    public void setCrname(String crname) {
        this.crname = crname;
    }

    public String getImgprofil() {
        return imgprofil;
    }

    public void setImgprofil(String imgprofil) {
        this.imgprofil = imgprofil;
    }
}
