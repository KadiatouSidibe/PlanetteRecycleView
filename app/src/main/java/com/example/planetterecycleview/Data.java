package com.example.planetterecycleview;

public class Data {
    int image;
    String Nom;
    int taille;

    public Data(int image, String nom, int taille) {
        this.image = image;
        Nom = nom;
        this.taille = taille;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
