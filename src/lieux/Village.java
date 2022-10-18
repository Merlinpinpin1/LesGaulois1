package lieux;

import personnages.Chef;
import personnages.Gaulois;

public class Village {

	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois = nbVillageois + 1;

	}

	public Gaulois trouverHabitant(int refvillageois) {
		return villageois[refvillageois];
	}

	public void afficherVillageois() {
		System.out.println("On retrouve dans le village du chef " + chef.getNom() + "avec ses guerriers : \n");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("-" + villageois[i] + "\n");

		}

	}

	public static void main(String[] args) {

		Village village1 = new Village("VillagedesIrréductibles", 30);
		Chef abraracourcix = new Chef("Abraracourcix", 6, 1, village1);
		Gaulois astérix = new Gaulois("Astérix", 8);
		village1.ajouterHabitant(astérix);
		Gaulois Obélix = new Gaulois("Obélix", 8);
		village1.ajouterHabitant(Obélix);
		village1.afficherVillageois();
		// Gaulois gaulois = village.trouverHabitant(30); Erreur, car la liste n'est pas
		// aussi longue
		// Gaulois gaulois = village.trouverHabitant(1);
		// System.out.println(gaulois); return le astérix

	}

	

}
