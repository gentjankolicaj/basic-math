package io.math.shapes._2d;

import java.util.HashMap;
import java.util.Map;

import io.math.algebra.DetailType;
import io.math.algebra.Point;
import io.math.algebra.ShapeInformationType;

/**
 * @author gentjan kolicaj
 *
 */
public class Rectangle extends Shape2D {

	private ShapeInformationType shapeInformationType;

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;

	private double length;
	private double width;

	public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
		this.shapeInformationType = ShapeInformationType.POINT;
	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
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

	@Override
	public Map<DetailType, Object> getDetails() {
		Double[] commonMeasure = { new Double(length), new Double(width) };
		Point[] points = { pointA, pointB, pointC, pointD };
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
		return "Rectangle [shapeInformationType=" + shapeInformationType + ", pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + ", pointD=" + pointD + ", length=" + length + ", width=" + width + "]";
	}

}
