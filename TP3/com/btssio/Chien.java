package com.btssio;

/**
 * Clase Chien
 * @author Christine Balard
 *
 */
public class Chien extends Animal{
	private int taille;
	private String race ;
	
	
	
	/**
	 * 
	 * @return la taille du chien
	 */
	public int getTaille() {
		return taille;
	}



/**
 * modifie la taille du chien 
 * @param taille � modifier
 */
	public void setTaille(int taille) {
		
		if( taille < 10)
		this.taille = 10;
		else
			this.taille = taille;
	}



/**
 * renvoie la race du chien
 * @return
 */
	public String getRace() {
		return race;
	}

/**
 * constructeur de la classe chien
 * @param nom du chien
 * @param race du chien
 * @param taille du chien
 */
	public Chien(String nom, String race, int taille) {
		super(nom, "Chien");
		this.setTaille(taille);
		this.race = race;
		
	}
	
	/**
	 * Le chien se presente 
	 */
	@Override
	public void sePresenter() {
		super.sePresenter();
		System.out.println("Je suis un "+ this.race+ " et je mesure "+ this.taille + " cm. ");
	}
	
	/**
	 * le chien aboye c'est �� fa�on de parler, cela d�pend de sa taille
	 */
	public void aboyer() {
		
		if (taille > 60)
			this.parler("Wouaf");
		else
			if( taille > 20)
				this.parler("Grrr");
			else
				this.parler("Kaii");
			
	}

}
