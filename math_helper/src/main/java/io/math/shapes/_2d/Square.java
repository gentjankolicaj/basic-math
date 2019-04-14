package io.math.shapes._2d;

import java.util.Map;

import io.math.algebra.DetailType;
import io.math.algebra.Point;

public class Square extends Shape2D {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	
	private double base;
		
	public Square(Point pointA, Point pointB, Point pointC, Point pointD) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
	}	

	public Square(double base) {
		super();
		this.base=base;

	}
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public Map<DetailType, Object> getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
