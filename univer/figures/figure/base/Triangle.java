package ua.univer.figures.figure.base;

import ua.univer.figures.figure.IFigure;
//import ua.univer.figures.figure.base.Line;

public class Triangle implements IFigure {
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
		if (sideAB == null) {
			sideAB = new Line(apexA, apexB);
		}
		return sideAB;
	}

	public Line getSideBC() {
		if (sideBC == null) {
			sideAB = new Line(apexB, apexC);
		}
		return sideBC;
	}

	public Line getSideAC() {
		if (sideAC == null) {
			sideAB = new Line(apexA, apexC);
		}
		return sideAC;
	}

	public double getSideABLength() {
		return sideAB.getLength();
	}
	public double getSideBCLength() {
		return sideBC.getLength();
	}
	public double getSideACLength() {
		return sideAC.getLength();
	}

	public double getPerimeter() {

		// Line sideAB = this.sideAB;
		double lengthAB = this.getSideABLength();
		double lengthBC = this.getSideBCLength();
		double lengthAC = this.getSideACLength();
		return lengthAB + lengthBC + lengthAC;
	}

	public double getAreaTriangle() {
		double p = this.getPerimeter() / 2;
		return Math.sqrt(p * ((p - this.getSideABLength()) * (p - this.getSideBCLength())
				* (p - this.getSideACLength())));
	}

	@Override
	public String toString() {
		return "Triangle [apexA=" + apexA + ", apexB=" + apexB + ", apexC=" + apexC + ", sideAB=" + sideAB + ", sideBC="
				+ sideBC + ", sideAC=" + sideAC + "]";
	}

}
