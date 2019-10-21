package org.eclipse.model;

public class Formation {
	private String intitule;
	private int nbrJours;
	private Stagiaire[] stagiaires;

	public float calculerMoyenneFormation() {
		int SommeDesmoyennesDesStagiares = 0;
		for (Stagiaire s : stagiaires) {
			SommeDesmoyennesDesStagiares += s.calculerMoyenne();
		}
		return SommeDesmoyennesDesStagiares / stagiaires.length;
	}

	public int getIndexMax() {
		int indexMax = 0;
		float moyenneMax = stagiaires[0].calculerMoyenne();
		for (Stagiaire s : stagiaires) {
			if (s.calculerMoyenne() > moyenneMax) {
				moyenneMax = s.calculerMoyenne();
				indexMax++;
			}
		}
		return indexMax;
	}

	public String afficherNomMax() {
		return this.stagiaires[this.getIndexMax()].getNom();
	}

	public int getIndexMin() {
		int indexMin = 0;
		float moyenneMin = stagiaires[0].calculerMoyenne();
		for (Stagiaire s : stagiaires) {
			if (s.calculerMoyenne() < moyenneMin) {
				moyenneMin = s.calculerMoyenne();
				indexMin++;
			}
		}
		return indexMin;
	}

	public String afficherNomMin() {
		return this.stagiaires[this.getIndexMin()].getNom();
	}

	public float trouverMoyenneParNom(String nom) {
		for (Stagiaire s : stagiaires) {
			if (nom == s.getNom()) {
				return s.calculerMoyenne();
			}
		}
		return -1;
	}

	//
	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public int getNbrJours() {
		return nbrJours;
	}

	public void setNbrJours(int nbrJours) {
		this.nbrJours = nbrJours;
	}

	public Stagiaire[] getStagiaires() {
		return stagiaires;
	}

	public void setStagiaires(Stagiaire[] stagiaires) {
		this.stagiaires = stagiaires;
	}

	//
	public Formation(String intitule, int nbrJours, Stagiaire[] stagiaires) {
		super();
		this.intitule = intitule;
		this.nbrJours = nbrJours;
		this.stagiaires = stagiaires;
	}

	//

}
