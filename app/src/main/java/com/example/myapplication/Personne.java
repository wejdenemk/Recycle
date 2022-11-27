package com.example.myapplication;

public class Personne {

    private String name, phone, annee;Integer image;

    public Personne(String name, String phone, Integer image , String annee){
        this.name = name;
        this.phone = phone;
        this.image = image;
        this.annee = annee;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getImage() {
        return image;
    }

    public String getAnnee() {
        return annee;
    }


}