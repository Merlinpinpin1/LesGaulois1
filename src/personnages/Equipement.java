package personnages;

public enum Equipement
{
	casque("casque"),bouclier("bouclier");
	
	private String nom ; 
	
	private Equipement (String nom )
	{
		
		this.nom=nom ;
		
		
	}
	
	public String toString ()
	{
		return nom;
		
	}
}
