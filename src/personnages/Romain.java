package personnages;

public class Romain

{

	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		
	}

	public static void main(String[] args) {
		Romain minus;
		minus = new Romain("Minus", 6);
		System.out.println(minus.getNom());
		minus.recevoirCoup(8);
		minus.prendreParole();
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}

	public void sEquiper(Equipement equipement1) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat" + Romain.getNom() + "est déjà bien protégé !");
			break ;
		case 1  :
			System.out.println("Le soldat" + Romain.getNom() + "possède déja " + equipement);
			break ;
		case 0 :
			System.out.println("Le soldat" + Romain.getNom() + "s’équipe avec un » " + equipement);

		}
	}

}
