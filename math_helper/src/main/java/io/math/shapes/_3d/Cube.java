package io.math.shapes._3d;

import java.util.HashMap;
import java.util.Map;

import io.math.algebra.DetailType;
import io.math.algebra.Point;
import io.math.algebra.ShapeInformationType;

/**
 * @author gentjan kolicaj
 *
 */
public class Cube extends Shape3D {

	private ShapeInformationType shapeInformationType;

	private Point pointA;
	private Point pointB;
	private Point pointE;

	private double side;

	public Cube(Point pointA, Point pointB, Point pointE) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointE = pointE;
		this.shapeInformationType = ShapeInformationType.POINT;
	}

	public Cube(double side) {
		super();
		this.side = side;
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

	public Point getPointE() {
		return pointE;
	}

	public void setPointE(Point pointE) {
		this.pointE = pointE;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public Map<DetailType, Object> getDetails() {
		Double[] measure = { new Double(side) };
		Point[] points = { pointA, pointB, pointE };
		Map<DetailType, Object> map = new HashMap<>();
		map.put(DetailType.POINT, points);
		map.put(DetailType.COMMON_MEASURE, measure);
		return map;
	}

	@Override
	public ShapeInformationType getShapeInformationType() {
		return shapeInformationType;
	}

	@Override
	public String toString() {
		return "Cube [shapeInformationType=" + shapeInformationType + ", pointA=" + pointA + ", pointB=" + pointB
				+ ", pointE=" + pointE + ", side=" + side + "]";
	}

}
