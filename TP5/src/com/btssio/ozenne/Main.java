package com.btssio.ozenne;

public class Main {
    public static void main(String[] args) {
        Automobile auto1 = new Automobile("Clio", "Renault", 15000.0, "Neuf", "Essence", 0, 2026, "90ch");
        Automobile auto2 = new Automobile("208", "Peugeot", 16500.0, "Occasion", "Diesel", 45000, 2022, "100ch");

        System.out.println(auto1.toString());
        System.out.println(auto2.toString());

        Equipement eq1 = new Equipement("GPS Intégré", 800.0, false);
        Equipement eq2 = new Equipement("Tapis de sol", 50.0, true);
        Equipement eq3 = new Equipement("Toit Panoramique", 1200.0, false);
        Equipement eq4 = new Equipement("Roue de secours", 150.0, true);

        System.out.println(eq1.toString());
        System.out.println(eq2.toString());
        System.out.println(eq3.toString());
        System.out.println(eq4.toString());

        // Ajout d'équipements aux automobiles
        auto1.ajouterUnEquipement(eq1);
        auto1.ajouterUnEquipement(eq2);
        auto1.ajouterUnEquipement(eq3);

        // Affichage des équipements de auto1
        auto1.afficherLesEquipements();

        // Affichage des équipements gratuits de auto1
        auto1.afficherLesEquipementsGratuits();

        auto1.supprimerUnEquipement(eq3);

    }

    // Test de la méthode mystère [cite: 155, 156]
    Equipement[] equipementTrouve = new Equipement[1];
    boolean trouve = auto1.MethodeMystere("GPS Intégré", equipementTrouve);

    if(trouve)
    {
        System.out.println("Équipement trouvé grâce à la méthode mystère : " + equipementTrouve[0].toString());
    }else
    {
        System.out.println("Équipement introuvable.");
    }

}
