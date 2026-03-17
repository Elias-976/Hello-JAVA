package com.btssio.ozenne;

public class Arme {
    private String nom;
    private int degats;

    public Arme(String p_nom, int p_degats) {
        this.nom = p_nom;
        this.degats = p_degats;
    }

    public String getNom() {
        return nom;
    }

    public int getDegats() {
        return degats;
    }

    public String setNom(String nom) {
        this.nom = nom;
        return nom;
    }

    public int setDegats(int degats) {
        this.degats = degats;
        return degats;
    }
}
