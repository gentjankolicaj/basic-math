package io.math.shapes._2d;

import java.util.HashMap;
import java.util.Map;

import io.math.algebra.DetailType;
import io.math.algebra.Point;
import io.math.algebra.ShapeInformationType;

public class Triangle extends Shape2D {

	private ShapeInformationType shapeInformationType;

	private Point pointA;
	private Point pointB;
	private Point pointC;

	private double side1;
	private double side2;
	private double side3;

	private double height;
	private double base;

	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.shapeInformationType = ShapeInformationType.POINT;
	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.shapeInformationType = ShapeInformationType.SIDE_MEASURE;
	}

	public Triangle(double height, double base) {
		super();
		this.height = height;
		this.base = base;
		this.shapeInformationType = ShapeInformationType.COMMON_MEASURE;
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

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
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
		Double[] sideMeasure = { new Double(side1), new Double(side2), new Double(side3) };
		Double[] commonMeasure = { new Double(base), new Double(height) };
		Point[] points = { pointA, pointB, pointC };
		Map<DetailType, Object> map = new HashMap<>();
		map.put(DetailType.POINT, points);
		map.put(DetailType.COMMON_MEASURE, commonMeasure);
		map.put(DetailType.SIDE_MEASURE, sideMeasure);
		return map;

	}

	@Override
	public ShapeInformationType getShapeInformationType() {
		return shapeInformationType;
	}

	@Override
	public String toString() {
		return "Triangle [shapeInformationType=" + shapeInformationType + ", pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + ", side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", height="
				+ height + ", base=" + base + "]";
	}
	
	

}
