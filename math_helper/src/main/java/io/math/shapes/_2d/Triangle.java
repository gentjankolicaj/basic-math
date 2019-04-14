package io.math.shapes._2d;

import java.util.Map;

import io.math.algebra.DetailType;
import io.math.algebra.Point;

public class Triangle extends Shape2D{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private double sideA;
	private double sideB;
	private double sideC;

	private double height;
	private double base;
	
	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}
	
	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public Triangle(double height, double base) {
		super();
		this.height=height;
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

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}


	@Override
	public Map<DetailType, Object> getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
