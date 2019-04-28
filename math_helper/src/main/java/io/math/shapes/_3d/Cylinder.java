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
public class Cylinder extends Shape3D {

	private ShapeInformationType shapeInformationType;

	private Point pointO;
	private Point pointA;
	private Point pointH;

	private double radius;
	private double height;

	public Cylinder(Point pointO, Point pointA, Point pointH) {
		super();
		this.pointO = pointO;
		this.pointA = pointA;
		this.pointH = pointH;
		this.shapeInformationType = ShapeInformationType.POINT;
	}

	public Cylinder(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
		this.shapeInformationType = ShapeInformationType.COMMON_MEASURE;
	}

	public Point getPointO() {
		return pointO;
	}

	public void setPointO(Point pointO) {
		this.pointO = pointO;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointH() {
		return pointH;
	}

	public void setPointH(Point pointH) {
		this.pointH = pointH;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public Map<DetailType, Object> getDetails() {
		Double[] measure = { new Double(radius), new Double(height) };
		Point[] points = { pointO, pointA, pointH };
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
		return "Cylinder [shapeInformationType=" + shapeInformationType + ", pointO=" + pointO + ", pointA=" + pointA
				+ ", pointH=" + pointH + ", radius=" + radius + ", height=" + height + "]";
	}

}
