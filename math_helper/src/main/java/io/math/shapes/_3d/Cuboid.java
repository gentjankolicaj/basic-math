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
public class Cuboid extends Shape3D {

	private ShapeInformationType shapeInformationType;

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointE;

	private double length;
	private double width;
	private double height;

	public Cuboid(Point pointA, Point pointB, Point pointC, Point pointE) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointE = pointE;
		this.shapeInformationType = ShapeInformationType.POINT;
	}

	public Cuboid(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
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

	public Point getPointE() {
		return pointE;
	}

	public void setPointE(Point pointE) {
		this.pointE = pointE;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public Map<DetailType, Object> getDetails() {
		Double[] measure = { new Double(length), new Double(width), new Double(height) };
		Point[] points = { pointA, pointB, pointC, pointE };
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
		return "Cuboid [shapeInformationType=" + shapeInformationType + ", pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + ", pointE=" + pointE + ", length=" + length + ", width=" + width + ", height="
				+ height + "]";
	}

}
