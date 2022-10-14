package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcepotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	public void preparerpotion() {
		Random random = new Random();
		int force = random.nextInt(effetPotionMax - effetPotionMin) + effetPotionMin;
		if (force > 7) {
			System.out.println("J'ai pr�par� une super potion de force " + force);
		} else {
			System.out.println(
					"Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de niveau inf�rieur " + force);
		}
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public static void main(String[] args) {
		Druide Panoramix;
		Panoramix = new Druide("Panoramix", 5, 10);
		Panoramix.preparerpotion();
	}
}
