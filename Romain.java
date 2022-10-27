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

	public int getForce() {
		return force;
	}

	public void parler(String texte) {

		System.out.println(prendreParole() + "� " + texte + "�");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	/*
	 * public void recevoirCoup(int forceCoup) { force -= forceCoup; if (force > 0)
	 * { parler("A�e"); } else { parler("J'abandonne..."); } }
	 */

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
	}

	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += " \nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;i++) {
				if (equipement[i] != null && equipement[i].equals(Equipement.bouclier)) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			texte += + resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + toString() + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipement[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipement[i];
				nbEquipementEjecte++;
				equipement[i] = null;
			}
		}
		return equipementEjecte;
	}

	public void sEquiper(Equipement equipement1) {
		switch (nbEquipement) {
		case 2:
			System.out.println ("Le soldat" + this.getNom() + "est d�j� bien prot�g� !");
			break;
		case 1:
			if (equipement1 == equipement[0]) {
				System.out.println("Le soldat" + this.getNom() + "poss�de d�ja " + equipement);
			} else {
				equipement[1] = equipement1;
				nbEquipement = nbEquipement + 1;
				System.out.println("Le soldat" + this.getNom() + "s'équipe avec " + equipement);
			}
			break;
		default:
			equipement[0] = equipement1;
			nbEquipement = nbEquipement + 1;
			System.out.println("Le soldat" + this.getNom() + "s'équipe avec " + equipement);
			break;

		}
	}

}
