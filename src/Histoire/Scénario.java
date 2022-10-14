package Histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scénario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		asterix.parler("Bonjour à tous");
		minus.parler(" UN GAU... UN GAUGAU...");
		for (int i = 1 ; i<3 ; i++ )
		{
			
			
			asterix.frapper(minus);			
			minus.parler("Aie !");
		}
		asterix.frapper(minus);			
		minus.parler("J'abandonne puissant GAUUlois ");
	}

}
