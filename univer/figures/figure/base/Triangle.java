package ua.univer.figures.figure.base;

import ua.univer.figures.figure.IFigure;
//import ua.univer.figures.figure.base.Line;

public class Triangle implements IFigure{
	Point apexA, apexB, apexC;
	Line sideAB, sideBC, sideAC;

	public Triangle(Point apexA, Point apexB, Point apexC) {
		super();
		this.apexA = apexA;
		this.apexB = apexB;
		this.apexC = apexC;
		sideAB = new Line(apexA, apexB);
		sideBC = new Line(apexB, apexC);
		sideAC = new Line(apexA, apexC);
	}
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		super();
		sideAB = new Line(x1, y1, x2, y2);
		sideBC = new Line(x2, y2, x3, y3);
		sideAC = new Line(x1, y1, x3, y3);
	}
	
	public Line getSideAB() {
		if(sideAB==null) {
			sideAB = new Line(apexA, apexB);
		}
		return sideAB;
	}
	

	public Line getSideBC() {
		if(sideBC==null) {
			sideAB = new Line(apexB, apexC);
		}
		return sideBC;
	}

	public Line getSideAC() {
		if(sideAC==null) {
			sideAB = new Line(apexA, apexC);
		}
		return sideAC;
	}
	public double getSideLength(Line line) {
		Line sideAB = this.sideAB;
		Line sideBC = this.sideBC;
		Line sideAC = this.sideAC;
		if(line.equals(sideAB)) {
			Point p1 = sideAB.getStart();
			Point p2 = sideAB.getEnd();
			int AX = p1.getX();
			int AY = p1.getY();
			int BX = p2.getX();
			int BY = p2.getY();
			return Math.sqrt((Math.pow((BX-AX), 2))+(Math.pow((BY-AY), 2)));
		}
		else if(line.equals(sideBC)) {
			Point p1 = sideBC.getStart();
			Point p2 = sideBC.getEnd();
			int AX = p1.getX();
			int AY = p1.getY();
			int BX = p2.getX();
			int BY = p2.getY();
			return Math.sqrt((Math.pow((BX-AX), 2))+(Math.pow((BY-AY), 2)));
		}
		else if(line.equals(sideAC)) {
			Point p1 = sideAC.getStart();
			Point p2 = sideAC.getEnd();
			int AX = p1.getX();
			int AY = p1.getY();
			int BX = p2.getX();
			int BY = p2.getY();
			return Math.sqrt((Math.pow((BX-AX), 2))+(Math.pow((BY-AY), 2)));
		}
		return 0;
	}

	public double getPerimeter() {

		//Line sideAB = this.sideAB;
		double lengthAB = this.getSideLength(this.sideAB);
		double lengthBC = this.getSideLength(this.sideBC);
		double lengthAC = this.getSideLength(this.sideAC);
		return lengthAB+lengthBC+lengthAC;
	}
	
	public double getAreaTriangle() {
		double p = this.getPerimeter()/2;
		return Math.sqrt(p*((p-this.getSideLength(sideAB))*(p-this.getSideLength(sideBC))*(p-this.getSideLength(sideAC))));
	}
	
	@Override
	public String toString() {
		return "Triangle [apexA=" + apexA + ", apexB=" + apexB + ", apexC=" + apexC + ", sideAB=" + sideAB + ", sideBC="
				+ sideBC + ", sideAC=" + sideAC + "]";
	}


	

}
