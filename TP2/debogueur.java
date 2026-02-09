public class Main {

    public static void main(String[] args) {
        int[] notes = {12, 15, 10, 8, 18, 14};

        int somme = calculerSomme(notes);
        double moyenne = calculerMoyenne(notes);

        System.out.println("Somme des notes : " + somme);
        System.out.println("Moyenne : " + moyenne);
    }

    // Méthode qui calcule la somme des valeurs d'un tableau
    public static int calculerSomme(int[] t) {
        int somme = 0;
        for (int i = 0; i < t.length; i++) {
            somme += t[i];
        }
        return somme;
    }

    // ⚠️ Méthode volontairement erronée
    public static double calculerMoyenne(int[] t) {
        int somme = calculerSomme(t);
        return somme / t.length; // division entière (bug !)
    }
}