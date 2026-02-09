import java.util.Scanner;
public class Main {
   static String matiere;
   static double tauxTVA;
   static double montantTHT;
   static double montantTTC;


   public static void main(String[] args) {
       System.out.printf("Hello and welcome!");
       for (int i = 1; i <= 5; i++) {
           matiere = "programmation avancées en bts sio à Ozenne";
           System.out.println("i = " + i);
       }


       tauxTVA = 0.2;


       Scanner scanner = new Scanner(System.in);
       System.out.println("Entrez un montant HT");


       montantTTC = montantTHT * (1 + tauxTVA);
       double valeur = 3.14159265359;


       System.out.printf("Vous avez saisi : %.2f%n", montantTHT);
       System.out.println("Vous avez saisi : " + montantTHT + "sans formalisme");
       System.out.printf("Vous avez saisi : %2f%n", montantTTC);
   }
}





public class Imc {
   static double poids;
   static double taille;
   static double imc;


   public static void main(String[] args){
       poids = 70;
       taille = 1.80;
       imc = (poids / (taille*taille));
       if (imc < 18.5){
           System.out.println("Migreur");
       } else if (imc >= 18.5 && imc < 25) {
           System.out.println("Corpulence normale");
       } else if (imc >= 25 && imc < 30) {
           System.out.println("Surpoids");
       } else if (imc >= 30 && imc < 35) {
           System.out.println("Obésité Modérée");
       }else if (imc >= 35 && imc < 40) {
           System.out.println("Obésitée sévère");
       }else if (imc >= 40) {
           System.out.println("Obésitée morbide");
       }
}}
