package com.btssio.ozenne;

import java.util.ArrayList;

public class Automobile {
    private String modele;
    private String marque;
    private double prix;
    private String etat; // neuf ou occasion
    private String carburant;
    private int kmCompteur;
    private int annee;
    private String puissance;
    private ArrayList<Equipement> lesEquipements;

    public Automobile(String modele, String marque, double prix, String etat, String carburant, int kmCompteur,
            int annee, String puissance) {
        this.modele = modele;
        this.marque = marque;
        this.prix = prix;
        this.etat = etat;
        this.carburant = carburant;
        this.kmCompteur = kmCompteur;
        this.annee = annee;
        this.puissance = puissance;
        this.lesEquipements = new ArrayList<Equipement>();
    }

    public String getModele() {
        return this.modele;
    }

    public String getMarque() {
        return this.marque;
    }

    public double getPrix() {
        return prix;
    }

    public String getEtat() {
        return this.etat;
    }

    public String getCarburant() {
        return this.carburant;
    }

    public int getKmCompteur() {
        return this.kmCompteur;
    }

    public int getAnnee() {
        return this.annee;
    }

    public String getPuissance() {
        return this.puissance;
    }

    public String setModele(String modele) {
        return this.modele;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public void setKmCompteur(int kmCompteur) {
        this.kmCompteur = kmCompteur;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "prix=" + prix +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                '}';
    }

    // Méthode pour ajouter un équipement
    public boolean ajouterUnEquipement(Equipement equipementAAjouter) {
        if (this.lesEquipements.contains(equipementAAjouter)) {
            System.out.println("L'equipement " + equipementAAjouter.getDesignation() + " est déjà enregistré");
            return false;
        } else {
            this.lesEquipements.add(equipementAAjouter);

            if (!equipementAAjouter.isGratuit()) {
                this.prix += equipementAAjouter.getPrix();
            }

            System.out.println("L'equipement " + equipementAAjouter.getDesignation()
                    + " vient d'être ajouté au véhicule " + this.toString());
            return true;
        }
    }

    // Méthode pour supprimer un équipement
    public boolean supprimerUnEquipement(Equipement equipementASupprimer) {
        if (this.lesEquipements.contains(equipementASupprimer)) {
            this.lesEquipements.remove(equipementASupprimer);

            if (!equipementASupprimer.isGratuit()) {
                this.prix -= equipementASupprimer.getPrix();
            }
            System.out.println("Équipement supprimé. Nouveau tarif du véhicule : " + this.prix + " €");
            return true;
        }
        return false;
    }

    // Affichage de tous les équipements de l'automobile
    public void afficherLesEquipements() {
        System.out.println(this.toString());
        System.out.println("Les équipements sont :");
        for (Equipement equipementLu : this.lesEquipements) {
            System.out.println(equipementLu);
        }
    }

    // Affiche les équipements gratuits
    public void afficherLesEquipementsGratuits() {
        System.out.println("Les équipements gratuits pour " + this.toString() + " :");
        for (Equipement equipementLu : this.lesEquipements) {
            System.out.println(equipementLu);
        }
    }

    // Calcul du coût total de tous les équipements
    public double getTotalEquipements() {
        double total = 0;
        for (Equipement equipementLu : this.lesEquipements) {
            total += equipementLu.getPrix();
        }
        return total;
    }

    // Cherche un équipement par sa désignation et le stocke dans le tableau passé
    // en paramètre.
    public boolean MethodeMystere(String designationRecherchee, Equipement[] params) {
        boolean ok = false;
        int i = 0;

        while (i < this.lesEquipements.size() && !ok) {
            if (this.lesEquipements.get(i).getDesignation().equals(designationRecherchee)) {
                params[0] = (lesEquipements.get(i));
                ok = true;
            }
            i++;
        }
        return ok;
    }

}
