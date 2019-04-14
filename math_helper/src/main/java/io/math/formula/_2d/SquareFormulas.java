package io.math.formula._2d;

import io.math.algebra.Point;
import io.math.shapes._2d.Square;
import io.math.shapes._2d.Triangle;

public class SquareFormulas {

	public static double findPerimeter(Point a,Point b,Point c,Point d) {
		return 0;
		
	}
	
	public static double findArea(Point a,Point b,Point c,Point d) {
		return 0;
	}
	
	public static double findPerimeter(double base) {
		return 4*base;
		
	}
	
	public static double findArea(double base) {
		return base*base;
	}
	
	public static double findPerimeter(Square square) {
		return 4*square.getBase();
		
	}
	
	public static double findArea(Square square) {
		return square.getBase()*square.getBase();
	}
}
