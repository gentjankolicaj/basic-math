package io.math.shapes._2d;

import java.util.Map;

import io.math.algebra.DetailType;
import io.math.algebra.Point;

public class Line extends Shape2D{
	
	private Point pointA;
	private Point pointB;
	private double a;
	private double b;
	
	private double length;
	
	public Line(Point pointA, Point pointB) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
	}

	public Line(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	

	public Line(double length) {
		super();
		this.length=length;
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

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public Map<DetailType, Object> getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
