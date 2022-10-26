package personnages;

public class Gaulois {
	// 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
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];
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

	// private String prendreParole() {
	// 	return "Le gaulois " + nom + ": ";
	//
	// }

	private String prendreParole()
	 {
		 	String texte = "Le gaulois " + nom + " : ";
			return texte;
}


	// public void frapper(Romain romain) {
	// 	System.out.println(nom + "envoie un grand coup dans la machoire de " + romain.getNom());
	// 	romain.recevoirCoup(force / 3);
	// }

	public void frapper(Romain romain)
	{
		System.out.println(nom + " envoie un grand coup dans la
		mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,	nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
	return;
	}


	public String toString() {

		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetpotion + "]";


	}

	public static void main(String[] args) {
		Gaulois asterix;
		Romain c�sar;
		asterix = new Gaulois("Ast�rix", 8);
		c�sar = new Romain("c�sar", 5);

		System.out.println(asterix.getNom());
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.frapper(c�sar);
	}

}
