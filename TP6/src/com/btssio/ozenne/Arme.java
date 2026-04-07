package com.btssio.ozenne;

public class Arme {
    private String nom;
    private int degats;
    private static int degatsDeBase;

    public Arme(String p_nom, int p_degats) {
        this.nom = p_nom;
        this.degats = Arme.degatsDeBase;
    }

    public String getNom() {
        return nom;
    }

    public int getDegats() {
        return degats;
    }

    public int getDegatsDeBase(){
        return this.degatsDeBase;
    }

    public String setNom(String nom) {
        this.nom = nom;
        return nom;
    }

    public int setDegats(int degats) {
        this.degats = degats;
        return degats;
    }

    public int setDegatsDeBase(int degatsDeBase){
        this.degatsDeBase = degatsDeBase;
        return this.degatsDeBase;
    }
}
