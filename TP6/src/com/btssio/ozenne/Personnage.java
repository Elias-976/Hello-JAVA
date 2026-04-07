package com.btssio.ozenne;

public class Personnage {
    private String nom;
    private int PointsDeVie;
    private int positionX, positionY;
    private Arme arme;
    private static int nbPointsDeVieDeBase = 100;


    /**
     * Constructeur de la classe Personnage
     * @param p_nom
     * @param p_arme
     */
    public Personnage(String p_nom, Arme p_arme) {
        this.nom = p_nom;
        this.PointsDeVie = Personnage.nbPointsDeVieDeBase;
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
    public int getNbPointsDeVieDeBase(){
        return this.nbPointsDeVieDeBase;
    }

    public String setNom(String nom) {
        this.nom = nom;
        return nom;
    }

    public Arme setArme(Arme arme) {
        this.arme = arme;
        return arme;
    }

    public int setNbPointsDeVieDeBase(int nbPointsDeVieDeBase){
        this.nbPointsDeVieDeBase = nbPointsDeVieDeBase;
        return nbPointsDeVieDeBase;
    }


    /**
     *
     * @return
     */
    public boolean envie(){
        if (this.PointsDeVie > 0){
            System.out.println(this.nom + " est toujours en vie");
            return true;
        }

        return false;
    }

    /**
     * modifie le nombre de points de vie du personnage
     * @param des valeurs du dé lancé lors du jeu
     * @param multiplicateur nombre de point de dégats
     */
    public void recevoirDesDegats(int des, int multiplicateur){
        this.PointsDeVie -= des * multiplicateur;
        System.out.println(this.nom + "viens de perdre " + des * multiplicateur + " de points");
    }


        /**
     * description : attaque un adversaire
     * @param victime victime de l'attaque
     * @param des valeurs du dé lancé
     * @param multiplicateur
     */
    public void attaquerAdversaire(Personnage victime, int des, int multiplicateur){
        victime.recevoirDesDegats(des, multiplicateur);
        System.out.println(this.nom + " attaque " + victime.getNom());
    }

    

    /**
     *
     */
    public void seDeplacer(){

    }

    /**
     *
     */
    public void sePresenter(){
        System.out.println("Nom : " + this.nom +"\n" + "Arme : " + this.arme.getNom());
    }


}
