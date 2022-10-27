package personnages;

public class Gaulois {
	// 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
	private int force ;
	private int nbtrophees;
	private Equipement trophees[] = new Equipement[100];
	private String nom;

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
		 	return  "Le gaulois " + nom + " : " ;
	
}


	// public void frapper(Romain romain) {
	// 	System.out.println(nom + "envoie un grand coup dans la machoire de " + romain.getNom());
	// 	romain.recevoirCoup(force / 3);
	// }

	public void frapper(Romain romain)
	{
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetpotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,	nbtrophees++) {
			this.trophees[nbtrophees] = trophees[i];
		}

	}


	public String toString() {

		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetpotion + "]";


	}

	public static void main(String[] args) {
		Gaulois asterix;
		Romain cesar;
		asterix = new Gaulois("Ast�rix", 8);
		cesar = new Romain("cesar", 5);

		System.out.println(asterix.getNom());
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.frapper(cesar);
	}
	 public void boirePotion (int forcedelapotion)
	 {
		 effetpotion = forcedelapotion ; 
		 System.out.println(" Merci Druide, je sens que ma force est " + effetpotion +" fois décuplée. ") ; 
	 }
	 
	 

}