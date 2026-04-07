package com.btssio.ozenne;

import java.util.Random;
import java.util.Scanner;

public class Jeu {
    private Personnage joueur1;
    private Personnage joueur2;

    public Jeu(Personnage p_joueur1, Personnage p_joueur2) {
        this.joueur1 = p_joueur1;
        this.joueur2 = p_joueur2;
    }
    public Personnage getJoueur1(){
        return joueur1;
    }

    public Personnage getJoueur2(){
        return joueur2;
    }

    public Personnage setJoueur1(Personnage joueur1){
        this.joueur1 = joueur1;
        return joueur1;
    }
    public Personnage setJoueur2(Personnage joueur2){
        this.joueur2 = joueur2;
        return joueur2;
    }

    /**
     * @description : Vérifie si l'un des deux joueurs est mort pour finir le jeu
     * @return : Boolean True or False
     */
    public boolean finDePartie() {
        if ((!this.joueur1.envie()) || (this.joueur2.envie() == false)){
            return true;
    }
        return false;
    }
    public void lancerLeJeu() throws InterruptedException {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Que la partie commence!");
        //lancement des 2 dés et récupération des valeurs des variables
        //et présentation des personnages

        joueur1.sePresenter();
        int de_perso1 = lancerLeDe();

        joueur2.sePresenter();
        int de_perso2 = this.lancerLeDe();
        //déclaration et initialisation d'une variable i permettant de determiner
        //le joueur
        int i = 0;
        //gestion du choix de jouer
        if(de_perso1 > de_perso2)
            i = 1;

        //tant que la partie n'est pas finie
        while(!finDePartie())
        {
            //tour du joueur1
            if (i==1)
            {
                System.out.println("-------------------- C'est au tour de " + joueur1.getNom() + " tapez sur la touche Entrée --------------------");
                clavier.nextLine();
                joueur1.attaquerAdversaire(joueur2, lancerLeDe());
                i = 0;

            }
            else //tour du joueur2
            {
                System.out.println("-------------------- C'est au tour de " + joueur2.getNom() + " tapez sur la touche Entrée --------------------");
                clavier.nextLine();
                joueur2.attaquerAdversaire(joueur1, lancerLeDe());
                i = 1;

            }
        }
        System.out.println("Fin de partie");

    }

    /**
     * @description : donne un dé au hasard
     * @return : un entier int
     */
    public int lancerLeDe(){
        Random rd = new Random();
        //Thread.sleep(300);
        int retour = 1 + rd.nextInt(6);
        System.out.println(retour);
        return retour;
        }

}

