package io.math.shapes._2d;

import java.util.HashMap;
import java.util.Map;

import io.math.algebra.DetailType;
import io.math.algebra.Point;
import io.math.algebra.ShapeInformationType;

public class Trapezoid extends Shape2D {

	private ShapeInformationType shapeInformationType;

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;

	private double side1;
	private double side2;
	private double side3;
	private double side4;

	private double base1;
	private double base2;
	private double height;

	public Trapezoid(Point pointA, Point pointB, Point pointC, Point pointD) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
		this.shapeInformationType = ShapeInformationType.POINT;
	}

	public Trapezoid(double side1, double side2, double side3, double side4) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
		this.shapeInformationType = ShapeInformationType.SIDE_MEASURE;
	}

	public Trapezoid(double base1, double base2, double height) {
		super();
		this.base1 = base1;
		this.base2 = base2;
		this.height = height;
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

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
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

	public double getSide4() {
		return side4;
	}

	public void setSide4(double side4) {
		this.side4 = side4;
	}

	public double getBase1() {
		return base1;
	}

	public void setBase1(double base1) {
		this.base1 = base1;
	}

	public double getBase2() {
		return base2;
	}

	public void setBase2(double base2) {
		this.base2 = base2;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public Map<DetailType, Object> getDetails() {
		Double[] sideMeasure = { new Double(side1),new Double(side2),new Double(side3),new Double(side4)};
		Double[] commonMeasure = { new Double(base1) ,new Double(base2),new Double(height)};
		Point[] points = { pointA, pointB, pointC ,pointD};
		Map<DetailType, Object> map = new HashMap<>();
		map.put(DetailType.POINT, points);
		map.put(DetailType.SIDE_MEASURE, sideMeasure);
		map.put(DetailType.COMMON_MEASURE, commonMeasure);
		return map;
	}

	@Override
	public ShapeInformationType getShapeInformationType() {
		return shapeInformationType;
	}

	@Override
	public String toString() {
		return "Trapezoid [shapeInformationType=" + shapeInformationType + ", pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + ", pointD=" + pointD + ", side1=" + side1 + ", side2=" + side2 + ", side3="
				+ side3 + ", side4=" + side4 + ", base1=" + base1 + ", base2=" + base2 + ", height=" + height + "]";
	}

}
