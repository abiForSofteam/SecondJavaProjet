package org.eclipse.model;

public class Stagiaire {
	protected String nom;
	int [] notes = new int[3];
	
	
	//
	public float calculerMoyenne(){
		float sommeDesNotes = 0;
		for(int note : notes) {
			sommeDesNotes+=note;			
		}
		return sommeDesNotes/notes.length;
	}
	
	public float trouverMax(){
		int noteMax = notes[0];
		for(int note : notes) {
			if(note > noteMax) noteMax = note;			
		}
		return noteMax;
	}
	
	public float trouverMin(){
		int noteMin = notes[0];
		for(int note : notes) {
			if(note < noteMin) noteMin = note;			
		}
		return noteMin;
	}
	
	
	//
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int[] getNotes() {
		return notes;
	}
	public void setNotes(int[] notes) {
		this.notes = notes;
	}
	//
	public Stagiaire(String nom, int[] notes) {
		super();
		this.nom = nom;
		this.notes = notes;
	}
	

}
