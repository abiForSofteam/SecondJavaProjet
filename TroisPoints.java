package org.eclipse.model;

public class TroisPoints {
	private Point premier;	
	private Point deuxieme;	
	private Point troisieme;
	
	
	public Point getPremier() {
		return premier;
	}
	public void setPremier(Point premier) {
		this.premier = premier;
	}
	public Point getDeuxieme() {
		return deuxieme;
	}
	public void setDeuxieme(Point deuxieme) {
		this.deuxieme = deuxieme;
	}
	public Point getTroisieme() {
		return troisieme;
	}
	public void setTroisieme(Point troisieme) {
		this.troisieme = troisieme;
	}
	public TroisPoints(Point premier, Point deuxieme, Point troisieme) {
		super();
		this.premier = premier;
		this.deuxieme = deuxieme;
		this.troisieme = troisieme;
	}
	
	
	public boolean testerAlignement() {
		double distAB;
		double distAC;
		double distBC;
		
		distAB = premier.calculerDistance(deuxieme);
		distAC = premier.calculerDistance(troisieme);
		distBC = deuxieme.calculerDistance(troisieme);
		
		if(
			distAB == (distAC + distBC) ||
			distAC == (distAB + distBC) ||  
			distBC == (distAC + distAB)) {
			return true;
		}
		else return false;
	}
	
	public boolean estTriangleEquilateral() {
		double distAB;
		double distAC;
		double distBC;
		
		distAB = premier.calculerDistance(deuxieme);
		distAC = premier.calculerDistance(troisieme);
		distBC = deuxieme.calculerDistance(troisieme);
		
		if(distAB == distAC && distAC == distBC) {					
			return true;
		}
		else return false;
	}
	
}
