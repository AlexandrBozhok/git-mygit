package ua.univer.figures;

import ua.univer.figures.figure.IFigure;
import ua.univer.figures.figure.base.Line;
import ua.univer.figures.figure.base.Point;
import ua.univer.figures.figure.base.Triangle;
import ua.univer.figures.figure.color.ColorLine;
import ua.univer.figures.figure.color.ColorPoint;
import ua.univer.figures.figure.color.ColorTriangle;

public class Program {

	public static void main(String[] args) {
		OperationsWithFigures owf = new OperationsWithFigures();
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 4);
		Point p0 = new Point();
		Triangle tr1 = new Triangle(0,0,1,5,5,-1);
		ColorPoint cp1 = new ColorPoint(3, 3, "BLUE");
		Point p3 = new ColorPoint(4, 4, "Green");
		Line l1 = new Line(p1, p2);
		Line l2 = new Line(5, 5, 6, 6);
		Point p31 = l1.getStart();
		Point p32 = l1.getEnd();
		ColorLine cl1 = new ColorLine(p31, p32, "RED");
		IFigure [] arrFigures = new IFigure[7];
		arrFigures[0] = p1;
		arrFigures[1] = p2;
		arrFigures[2] = p3;
		arrFigures[3] = l1;
		arrFigures[4] = l2;
		arrFigures[5] = new Triangle(p1, p2, p3);
		arrFigures[6] = new ColorTriangle(new Point(2,2), new Point(5, 5), new Point(-4, 3), "BLACK");	
		Point p10 = new ColorPoint(0, 0, "RED");
		Point p20 = new ColorPoint(-10, -10, "RED");
		Point p30 = new ColorPoint(-10, 0, "RED");
		Triangle tr5 = new ColorTriangle(p10, p20, p30, "YELLOW");
		
		System.out.println(owf.HowManyFiguresInArray(arrFigures));
		System.out.println("Точек в списке: " + owf.arrayPoints.size());
		System.out.println("Линий в списке: " + owf.arrayLines.size());
		System.out.println("Треугольников в списке: " + owf.arrayTriangles.size());
		System.out.println("Длина стороны АВ: " + tr5.getSideABLength());
		System.out.println("Длина стороны ВС: " + tr5.getSideBCLength());
		System.out.println("Длина стороны АС: " + tr5.getSideACLength());
		System.out.println("Периметр треугольника: " + tr1.getPerimeter());
		System.out.println("Площадь треугольника: " + tr5.getAreaTriangle());
		
	}

}
