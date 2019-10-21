package org.eclipse.model;

public class Personne {
	private int num;
	private String nom;
	private String prenom;
	private static int nbrPersonnes;
	private Adresse adresse;
	
	
	
	
	

	public Personne(int num, String nom, String prenom, Adresse adresse) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}


	public Personne(int num, String nom, String prenom) {
		super();
		nbrPersonnes++;
		if(num >= 1) {
			this.num = num;			
		}
		// Ou encore, on appelle le setter dans le constucteur
		//this.setNum(num);

		this.nom = nom;
		this.prenom = prenom;
	}


	public Personne() {
		nbrPersonnes++;
	}

	public String getNom() {
		return nom;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num >= 1) {
			this.num = num;
		}		
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

	public static int getNbrPersonnes() {
		return nbrPersonnes;
	}


	public static void setNbrPersonnes(int nbrPersonnes) {
		Personne.nbrPersonnes = nbrPersonnes;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public Adresse getAdresse() {
		return adresse;
	}
	
//	public static void afficherDetail() {
//		return 
//	}


	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}

}
