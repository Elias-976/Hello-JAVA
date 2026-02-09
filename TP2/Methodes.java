public class Methodes {
public static int carre(int n){
    return n*n;
}

public static boolean estPair(int n){
    return n % 2 == 0;
}

public static void afficherParite(int n){
    if (estPair(n)){
        System.out.println(n + " estPair.");
        }
    else{
        System.out.println(n + " est impair.");
        }}

public static void afficherMessage(String message){
    System.out.println(message);
}

public static byte max(byte a, byte b){
    if (a > b){
        return a;
    } else
        return b;
}


public static void afficherComparaison(byte a, byte b){
    if (a > b){
        System.out.println("a est plus grand");
    } else if(a < b) {
        System.out.println("b est plus grand");
    } else if(a == b){
        System.out.println("Ils sont égaux");
    }
    byte valeurMax = max(a, b);
    afficherMessage("La valeur du plus grand est : " + valeurMax);
}


public static byte ajout(byte a, byte b){
    int somme;
    somme = (byte) (a + b);

    if (somme > Byte.MAX_VALUE || somme < Byte.MIN_VALUE - 1){
        afficherMessage("Error : dépassement de la mémoire pour un Byte");
        return 0;
    }
    byte resultat = (byte) somme;
    afficherMessage("ajout réussie : " + resultat);
    return resultat;
}


public static void main(String[]args){
    int nombre = 10;
    System.out.println("Carré de " + nombre + " = " + carre(nombre));
    afficherParite(nombre);
    byte b1 = 10;
    byte b2 = 20;
    System.out.println("Le max est : " + max(b1, b2));
    ajout((byte)50, (byte)10);
    afficherComparaison((byte)15, (byte)10);}
}