package com.btssio.ozenne;
public class Main{

public static void main(String[] args) throws InterruptedException {
    Arme weapon001 = new Arme("Excalibur", 25);
    Personnage user001 = new Personnage("Sultana", weapon001);
    Arme gumgum = new Arme("fruit de l'élastique", 15);
    Personnage user002 = new Personnage("Monkey D.Luffy", gumgum);
    Jeu chogi = new Jeu(user001, user002);
    //user001.sePresenter();
    //System.out.println("");
    //user002.sePresenter();
    //System.out.println("");
    //chogi.lancerLeJeu();
    Parametres.intParametres(200, 5);
}}
