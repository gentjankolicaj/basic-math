package io.math.shapes._2d;

import java.util.Map;

import io.math.algebra.DetailType;
import io.math.algebra.Point;

public class Rectangle extends Shape2D {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
		
	private double sideA;
	private double sideB;
	private double sideD;
	private double sideC;
	
	private double height;
	private double base;
	
	public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
	}	

	public Rectangle(double sideA,double sideB,double sideC,double sideD) {
		super();
		this.sideA=sideA;
		this.sideB=sideB;
		this.sideC=sideC;
		this.sideD=sideD;
	}
	
	public Rectangle(double height,double base) {
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

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
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

	public double getSideD() {
		return sideD;
	}

	public void setSideD(double sideD) {
		this.sideD = sideD;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
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
