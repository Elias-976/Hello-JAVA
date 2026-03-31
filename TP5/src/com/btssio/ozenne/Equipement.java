package com.btssio.ozenne;

public class Equipement {
    private String designation;
    private double prix;
    private boolean gratuit;

    public Equipement(String designation, double prix, boolean gratuit) {
        this.designation = designation;
        this.prix = prix;
        this.gratuit = gratuit;
    }

    public String getDesignation() {
        return this.designation;
    }

    public double getPrix() {
        return this.prix;
    }

    public boolean isGratuit() {
        return this.gratuit;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setGratuit(boolean gratuit) {
        this.gratuit = gratuit;
    }

    @Override
    public String toString() {
        return "Equipement{" +
                "designation='" + designation + '\'' +
                ", prix=" + prix +
                ", gratuit=" + gratuit +
                '}' + "\n";
    }
}
