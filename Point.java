package org.eclipse.model;

public class Point {
	private double abs;
	private double ord;
	
	
	
	
	public double getAbs() {
		return abs;
	}
	public void setAbs(double abs) {
		this.abs = abs;
	}
	public double getOrd() {
		return ord;
	}
	public void setOrd(double ord) {
		this.ord = ord;
	}
	public Point(double abs, double ord) {
		super();
		this.abs = abs;
		this.ord = ord;
	}
	
	public double calculerDistance(Point p) {
		  return Math.sqrt(Math.pow((this.abs-p.getAbs()),2) + Math.pow((this.ord-p.getOrd()),2));				
	}
	
	public Point calculerMilieu(Point p) {
		  double Xm = (this.abs+p.getAbs())/2 ;
		  double Ym = (this.ord+p.getOrd())/2;
		  return new Point(Xm,Ym);
	}	
	
	
	@Override
	public String toString() {
		return "Point [abs=" + abs + ", ord=" + ord + ", getAbs()=" + getAbs() + ", getOrd()=" + getOrd() + "]";
	}


}
