public class Debogueur {

    public static void main(String[] args) {
        int[] notes = {12, 15, 10, 8, 18, 14};

        int somme = calculerSomme(notes);
        double moyenne = calculerMoyenne(notes);

        System.out.println("Somme des notes : " + somme);
        System.out.println("Moyenne : " + moyenne);
    }

    public static int calculerSomme(int[] t) {
        int somme = 0;
        for (int i = 0; i < t.length; i++) {
            somme += t[i];
        }
        return somme;
    }

    public static double calculerMoyenne(int[] t) {
        if (t.length == 0) return 0.0; // Sécurité : éviter la division par zéro
        
        int somme = calculerSomme(t);
        
        return (double) somme / t.length; 
    }


    public static void testDebug() {
        int compteur = 0;
        for (int i = 0; i < 5; i++) {

            compteur += i;
            System.out.println("Itération " + i + " → compteur = " + compteur);
        }

        System.out.println("Valeur finale du compteur = " + compteur);}
    }
