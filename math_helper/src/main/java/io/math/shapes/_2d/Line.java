package io.math.shapes._2d;

import java.util.HashMap;
import java.util.Map;

import io.math.algebra.DetailType;
import io.math.algebra.Point;
import io.math.algebra.ShapeInformationType;

public class Line extends Shape2D{
	
	private ShapeInformationType shapeInformationType;
	
	private Point pointA;
	private Point pointB;
	
	private double a;
	private double b;
	
	private double length;
	
	public Line(Point pointA, Point pointB) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.shapeInformationType=ShapeInformationType.POINT;
	}

	public Line(double a, double b) {
		super();
		this.a = a;
		this.b = b;
		this.shapeInformationType=ShapeInformationType.SIDE_MEASURE;
	}
	

	public Line(double length) {
		super();
		this.length=length;
		this.shapeInformationType=ShapeInformationType.COMMON_MEASURE;
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
		Double[] measures= {new Double(a),new Double(b)};
		Point[] points= {pointA,pointB};
		Map<DetailType,Object> map= new HashMap<>();
		map.put(DetailType.POINT, points);
		map.put(DetailType.COMMON_MEASURE,measures);
		return map;
	}

	@Override
	public ShapeInformationType getShapeInformationType() {
	    return shapeInformationType;
	}

	@Override
	public String toString() {
		return "Line [shapeInformationType=" + shapeInformationType + ", pointA=" + pointA + ", pointB=" + pointB
				+ ", a=" + a + ", b=" + b + ", length=" + length + "]";
	}

}
