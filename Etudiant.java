package org.eclipse.model;

public class Etudiant extends Personne{
	private int niveau ;

	
	
	
	public Etudiant(int num, String nom, String prenom, int niveau) {
		super(num, nom, prenom);
		this.niveau = niveau;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
//	@Override
//	public static void afficherDetail() {
//		return 
//	}

	@Override
	public String toString() {
		return super.toString() + "Etudiant [niveau=" + niveau+ "]";
	}


	
}
