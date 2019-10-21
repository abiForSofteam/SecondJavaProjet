package org.eclipse.model;

import java.util.GregorianCalendar;

public class MaDate {
	private int jour;
	private int mois;
	private int annee;

	public void ajouterUnJour() {
		GregorianCalendar cal = new GregorianCalendar();

		if ((this.getMois() == 1 || this.getMois() == 3 || this.getMois() == 5 || this.getMois() == 7
				|| this.getMois() == 8 || this.getMois() == 10) && getJour() == 31) {
			mois++;
			jour = 1;

		} 
		else if ((this.getMois() == 4 || this.getMois() == 6 || this.getMois() == 9 || this.getMois() == 11
			) && getJour() == 30) {
			mois++;
			jour = 1;
			
		} 
		else if (this.getMois() == 12 && getJour() == 31) {
			jour = 1;
			mois = 1;
			annee++;
		}
		else if(cal.isLeapYear(getAnnee()) && getMois() == 2 && getJour() == 29 ) {// Annee bissextile
			mois++;
			jour = 1;			
		}
		else if(!cal.isLeapYear(getAnnee()) && getMois() == 2 && getJour() == 28 ) {// Annee non bissextile
			mois++;
			jour = 1;			
		}
		else jour++;
		

	}

	@Override
	public String toString() {
		// return "MaDate [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
		return jour + "/" + mois + "/" + annee;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public MaDate(int jour, int mois, int annee) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

}
