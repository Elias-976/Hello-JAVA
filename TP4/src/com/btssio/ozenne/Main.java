package com.btssio.ozenne;
public class Main{

public static void main(String[] args) throws InterruptedException {
    Arme weapon001 = new Arme("Excalibur", 50);
    Personnage user001 = new Personnage("Sultana", weapon001);
    Arme gumgum = new Arme("fruit de l'élastique", 100);
    Personnage user002 = new Personnage("Monkey D.Luffy", gumgum);
    Jeu chogi = new Jeu(user001, user002);
    user001.sePresenter();
    user002.sePresenter();
    user001.recevoirDesDegats(10);
    user001.envie();
    chogi.lancerLeDe();
    chogi.lancerLeJeu();
}}
