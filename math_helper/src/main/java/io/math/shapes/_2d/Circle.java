package io.math.shapes._2d;

import java.util.HashMap;
import java.util.Map;

import io.math.algebra.DetailType;
import io.math.algebra.Point;
import io.math.algebra.ShapeInformationType;

public class Circle extends Shape2D {
		
	private ShapeInformationType shapeInformationType;
	
	private Point pointA;
	private Point pointO;
	
	private double radius;
	
	public Circle(Point pointA, Point pointO) {
		super();
		this.pointA = pointA;
		this.pointO = pointO;
		this.shapeInformationType=ShapeInformationType.POINT;
	}
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
		this.shapeInformationType=ShapeInformationType.COMMON_MEASURE;
	}
	

	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointO() {
		return pointO;
	}


	public void setPointO(Point pointO) {
		this.pointO = pointO;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}



	@Override
	public Map<DetailType, Object> getDetails() {
		Double[] measure= {new Double(radius)};
		Point[] points= {pointA,pointO};
		Map<DetailType,Object> map= new HashMap<>();
		map.put(DetailType.POINT, points);
		map.put(DetailType.COMMON_MEASURE,measure);
		return map;
	}

	@Override
	public ShapeInformationType getShapeInformationType() {
	    return shapeInformationType;
	}


	@Override
	public String toString() {
		return "Circle [shapeInformationType=" + shapeInformationType + ", pointA=" + pointA + ", pointO=" + pointO
				+ ", radius=" + radius + "]";
	}
	
}
