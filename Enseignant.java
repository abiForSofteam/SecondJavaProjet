package org.eclipse.model;

public class Enseignant extends Personne {
	private float salaire ;

	public Enseignant(int num, String nom, String prenom, float salaire) {
		// ici on va chercher "num", "nom",et "prenom" depuis la classe mère "Personne"
		super(num, nom, prenom); // super est le constructeur de la classe mère (Personne)
		this.salaire = salaire;
	}
	
	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Enseignant [salaire=" + salaire + ", toString()=" + super.toString() + "]";
	}




}
