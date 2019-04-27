package io.math.shapes._2d;

import java.util.HashMap;
import java.util.Map;

import io.math.algebra.DetailType;
import io.math.algebra.Point;
import io.math.algebra.ShapeInformationType;

public class Square extends Shape2D {
	
	private ShapeInformationType shapeInformationType;
	
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
		this.shapeInformationType = ShapeInformationType.POINT;
	}	

	public Square(double base) {
		super();
		this.base=base;
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

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public Map<DetailType, Object> getDetails() {
		Double[] commonMeasure = { new Double(base) };
		Point[] points = { pointA, pointB, pointC ,pointD};
		Map<DetailType, Object> map = new HashMap<>();
		map.put(DetailType.POINT, points);
		map.put(DetailType.COMMON_MEASURE, commonMeasure);
		return map;
	}

	@Override
	public ShapeInformationType getShapeInformationType() {
		return shapeInformationType;
	}

	@Override
	public String toString() {
		return "Square [shapeInformationType=" + shapeInformationType + ", pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + ", pointD=" + pointD +", base=" + base + "]";
	}	

}
