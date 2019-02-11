package ua.univer.figures.figure.base;

import ua.univer.figures.figure.IFigure;

public class Line implements IFigure{
	private Point start;
	private Point end;

	public Line(Point start, Point end) {
		this.start = start;
		this.end = end;
	}

	public Line(int x1, int y1, int x2, int y2) {
		this.start = new Point(x1, y1);
		this.end = new Point(x2, y2);
	}

	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}
	
	public double getLength() {
		Point p1 = this.start;
		Point p2 = this.end;
		int AX = p1.getX();
		int AY = p1.getY();
		int BX = p2.getX();
		int BY = p2.getY();
		return Math.sqrt((Math.pow((BX-AX), 2))+(Math.pow((BY-AY), 2)));
	}

	@Override
	public String toString() {
		return "Line [start=" + start + ", end=" + end + "]";
	}

}
