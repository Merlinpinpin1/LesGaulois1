package personnages;

public class Gaulois {
	// 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

	private String nom;
	private int force;
	private int effetpotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + ": ";

	}

	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	public String toString() {

		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetpotion + "]";

	}

	public static void main(String[] args) {
		Gaulois asterix;
		Romain césar;
		asterix = new Gaulois("Astérix", 8);
		césar = new Romain("césar", 5);

		System.out.println(asterix.getNom());
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.frapper(césar);
	}

}
