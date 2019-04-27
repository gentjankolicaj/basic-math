package io.math.shapes._2d;

import java.util.HashMap;
import java.util.Map;

import io.math.algebra.DetailType;
import io.math.algebra.Point;
import io.math.algebra.ShapeInformationType;

public class Hexagram extends Shape2D {
	
	private ShapeInformationType shapeInformationType;

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	private Point pointE;
	private Point pointF;
	
	private double side1;
	private double side2;
	private double side3;
	private double side4;
	private double side5;
	private double side6;
	
	
	public Hexagram(Point pointA, Point pointB, Point pointC, Point pointD, Point pointE, Point pointF) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
		this.pointE = pointE;
		this.pointF = pointF;
		this.shapeInformationType = ShapeInformationType.POINT;
	}

	
	public Hexagram(double side1, double side2, double side3, double side4, double side5, double side6) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
		this.side5 = side5;
		this.side6 = side6;
		this.shapeInformationType = ShapeInformationType.SIDE_MEASURE;
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


	public Point getPointE() {
		return pointE;
	}


	public void setPointE(Point pointE) {
		this.pointE = pointE;
	}


	public Point getPointF() {
		return pointF;
	}


	public void setPointF(Point pointF) {
		this.pointF = pointF;
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


	public double getSide5() {
		return side5;
	}


	public void setSide5(double side5) {
		this.side5 = side5;
	}


	public double getSide6() {
		return side6;
	}


	public void setSide6(double side6) {
		this.side6 = side6;
	}


	@Override
	public Map<DetailType, Object> getDetails() {
		Double[] sideMeasure = { new Double(side1),new Double(side2),new Double(side3),new Double(side4),new Double(side5),new Double(side6)};
		Point[] points = { pointA, pointB, pointC ,pointD,pointE,pointF};
		Map<DetailType, Object> map = new HashMap<>();
		map.put(DetailType.POINT, points);
		map.put(DetailType.SIDE_MEASURE, sideMeasure);
		return map;
	}

	@Override
	public ShapeInformationType getShapeInformationType() {
		return shapeInformationType;
	}


	@Override
	public String toString() {
		return "Hexagram [shapeInformationType=" + shapeInformationType + ", pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + ", pointD=" + pointD + ", pointE=" + pointE + ", pointF=" + pointF + ", side1="
				+ side1 + ", side2=" + side2 + ", side3=" + side3 + ", side4=" + side4 + ", side5=" + side5 + ", side6="
				+ side6 + "]";
	}

}
