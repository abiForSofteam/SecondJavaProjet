package org.eclipse.model;

/*public class ListePersonnes {
	Personne[] personnes = new Personne[10];

	public Personne findByNom(String s) {
		for (Personne p : personnes) {
			if (s == p.getNom())
				return p;
		}
		return null;
	}

	public boolean findByCodePostal(String cp) {
		for (Personne p : personnes) {
			for (Adresse adr : p.getAdresse())
				if (cp == adr.getCodePostal())
					return true;
		}
		return false;
	}

	public int countPersonneVille(String ville) {
		int count = 0;
		for (Personne p : personnes) {
			for (Adresse adr : p.getAdresse()) {
				if (ville == adr.getVille()) {
					count++;
				}
			}
		}
		return count;
	}

	public void editPersonneNom(String oldNom, String newNom) {
		for (Personne p : personnes) {
			if (oldNom == p.getNom()) {
				p.setNom(newNom);
			}
		}
	}

	public void editPersonneVille(String nom, String newVille) {
		for (Personne p : personnes) {
			for (Adresse adr : p.getAdresse()) {
				if (nom == p.getNom()) {
					adr.setVille(newVille);
				}
			}
		}
	}

	//
	public Personne[] getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Personne[] personnes) {
		this.personnes = personnes;
	}

	public ListePersonnes(Personne[] personnes) {
		super();
		this.personnes = personnes;
	}

}*/
