package com.btssio.ozenne;

public class Parametres{
    public static void intParametres(int nbViePerso, int nvDegats){
        Personnage.setNbPointsDeVieDeBase(nbViePerso);
        Arme.setDegatsDeBase(nvDegats);
    }
}