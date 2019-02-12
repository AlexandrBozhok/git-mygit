package ua.univer.figures;

import java.util.ArrayList;

import ua.univer.figures.figure.IFigure;
import ua.univer.figures.figure.base.Point;
import ua.univer.figures.figure.base.Triangle;
import ua.univer.figures.figure.base.Line;

public class OperationsWithFigures {
	int numbPoints = 0;
	int numbLines = 0;
	int numbTriangles = 0;
	ArrayList<IFigure> arrayPoints = new ArrayList<>();
	ArrayList<IFigure> arrayLines = new ArrayList<>();
	ArrayList<IFigure> arrayTriangles = new ArrayList<>();
	
	public String HowManyFiguresInArray(IFigure[] figures) {  //метод считает, сколько в переданном массиве фигур разного типа, и создает однотипные коллекции
		for (int i = 0; i < figures.length; i++) {
			if (figures[i] instanceof Point) {
				numbPoints++;
				arrayPoints.add(figures[i]);
			}
			else if (figures[i] instanceof Line) {
				numbPoints += 2;
				numbLines++;
				arrayLines.add(figures[i]);
			}
			else if (figures[i] instanceof Triangle) {
				numbPoints += 3;
				numbLines += 3;
				numbTriangles++;
				arrayTriangles.add(figures[i]);
			}
		}
		return "Точек " + numbPoints + "; " + "Линий " + numbLines + "; " + "Треугольников " + numbTriangles+ ";";
	}
	
}