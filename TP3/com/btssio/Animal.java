package com.btssio;
/**
 * Classe Animal
 * @author Christine Balard
 *
 */
public class Animal {
private String nom;
private String espece;
public String getNom() {
	return nom;
}


/**
 * modifie le nom de l'animal 
 * @param nom : nouveau nom
 */
public void setNom(String nom) {
	
	
	this.nom = nom;
}
/**
 * renvoie l'espece de l'animal
 * @return l'espece
 */

public String getEspece() {
	return espece;
}

/**
 * constructeur de la classe Animal
 * @param nom
 * @param espece
 */
public Animal(String nom, String espece) {
	super();
	this.nom = nom;
	this.espece = espece;
}


/**
 * l'animal dort
 */
public void dormir() {
	System.out.println("      Zzz Zzz Zzz... ("+ nom+" s'est endormi(e)) ");
	
}

/**
 * l'Animal mange
 */
public void manger() {
	
	
		System.out.println("      J'ai si faim ... Donne moi un biscuit ! ");

}
/**
 * l'animal parle
 * @param mot : dit par l'animal
 */
public void parler(String mot) {
	
	for(int i = 1 ; i<=4 ; i++)
	{
		System.out.print(mot+" !! ");
	}
	System.out.println("\n ");
	
}
/**
 * l'animal se presente
 */
public void sePresenter() {
	
	System.out.println("\nJe me présente : "+espece+ " "+ nom);
	if (nom =="Maurice") {
		System.out.println("... Il parait que je pousse le bouchon un peu trop loin...!!! ;-");
	}
	
}

}