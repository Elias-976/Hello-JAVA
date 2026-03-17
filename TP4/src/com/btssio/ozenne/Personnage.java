package com.btssio.ozenne;

public class Personnage {
    private String nom;
    private int PointsDeVie;
    private int positionX, positionY;
    private Arme arme;

    /**
     * Constructeur de la classe Personnage
     * @param p_nom
     * @param p_arme
     */
    public Personnage(String p_nom, Arme p_arme) {
        this.nom = p_nom;
        this.PointsDeVie = 100;
        this.positionX = 0;
        this.positionY = 0;
        this.arme = p_arme;
    }
    public String getNom() {
        return nom;
    }
    public Arme getArme() {
        return arme;
    }

    public String setNom(String nom) {
        this.nom = nom;
        return nom;
    }

    public Arme setArme(Arme arme) {
        this.arme = arme;
        return arme;
    }

    public void attaquerAdversaire(Personnage victime, int des){
        victime.recevoirDesDegats(des);
        System.out.println(this.nom + " attaque " + victime.getNom());
    }
    public boolean envie(){
        if (this.PointsDeVie > 0){
            System.out.println(this.nom + " est toujours en vie");
            return true;
        }

        return false;
    }
    public void recevoirDesDegats(int valDé){
        if (this.PointsDeVie > 0) {
            this.PointsDeVie = this.PointsDeVie - valDé;
            System.out.println(this.nom + " reçoit " + valDé + " de dégats");
        }
    }
    public void seDeplacer(){

    }
    public void sePresenter(){
        System.out.println("Nom : " + this.nom +"\n" + "Arme : " + this.arme.getNom());
    }


}
