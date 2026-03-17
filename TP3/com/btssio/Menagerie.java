package com.btssio;

import java.util.ArrayList;
import java.util.List;
/**
 * Classe Menagerie
 * @author Christine Balard
 *
 */
public class Menagerie {
	
	List<Animal> lesAnimaux = new ArrayList<Animal>();
	
	
/**
 * Obtient le nombre d'animaux présents dans la ménagerie
 * @return nombre d'animaux
 */

	public int getNombreAnimaux() {
		return lesAnimaux.size();
	}
/**
 *  Présente l'ensemble des animaux de la ménagerie
 */
	public void presenter() {
		System.out.println("****    PRESENTATION DE LA MENAGERIE     ****");
		
		for(Animal animalLu : lesAnimaux) {
			
			animalLu.sePresenter();
		}
	}
	
	/**
	 * Enregistre l'arrivée d'un animal dans la ménagerie
	 * @param nouveau : animal à ajouter
	 */
		public void arriver(Animal nouveau) {
			lesAnimaux.add(nouveau);
		}
		
		
		/**
		 * Enregistre le départ d'un animal de la ménagerie
		 * @param ancien animal à sortir
		 */
		public void partir(Animal ancien) {
			lesAnimaux.remove(ancien);
		}
		
		
	}
	


