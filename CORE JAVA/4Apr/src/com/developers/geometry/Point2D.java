package com.developers.geometry;

public class Point2D {
	private int x;
	private int y;

	public Point2D(int X, int Y) {
		this.x = X;
		this.y = Y;
	}

	public String show() {
		return ("(" + this.x + ", " + this.y + ")");
	}

	public boolean isEqual(Point2D p2) {
		if (this.x == p2.x && this.y == p2.y)
			return true;

		return false;
	}

	public double calculateDistance(Point2D p2) {
		return Math.sqrt(Math.pow((p2.x - this.x), 2) + Math.pow((p2.y - this.y), 2));
	}
}