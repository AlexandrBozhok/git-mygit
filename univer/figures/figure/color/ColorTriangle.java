package ua.univer.figures.figure.color;

import ua.univer.figures.figure.base.Line;
import ua.univer.figures.figure.base.Point;
import ua.univer.figures.figure.base.Triangle;

public class ColorTriangle extends Triangle {
	private String colorTriangle;

	public ColorTriangle(Point apexA, Point apexB, Point apexC, Line sideAB, Line sideBC, Line sideAC,
			String colorTriangle) {
		super(apexA, apexB, apexC);
		this.colorTriangle = colorTriangle;
	}
	public ColorTriangle(Point apexA, Point apexB, Point apexC, String colorTriangle) {
		super(apexA, apexB, apexC);
		this.colorTriangle = colorTriangle;
		
	}

	public String getColorTriangle() {
		return colorTriangle;
	}

	public void setColorTriangle(String colorTriangle) {
		this.colorTriangle = colorTriangle;
	}

	@Override
	public String toString() {
		return "ColorTriangle [colorTriangle=" + colorTriangle + " " + super.toString() + "]";
	}
	

	
}
