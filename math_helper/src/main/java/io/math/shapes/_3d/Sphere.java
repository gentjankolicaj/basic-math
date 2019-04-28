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
public class Sphere extends Shape3D {

	private ShapeInformationType shapeInformationType;

	private Point pointO;
	private Point pointA;

	private double radius;

	public Sphere(Point pointO, Point pointA) {
		super();
		this.pointO = pointO;
		this.pointA = pointA;
		this.shapeInformationType = ShapeInformationType.POINT;
	}

	public Sphere(double radius) {
		super();
		this.radius = radius;
		this.shapeInformationType = ShapeInformationType.COMMON_MEASURE;
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
		Double[] measure = { new Double(radius) };
		Point[] points = { pointO, pointA };
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
		return "Sphere [shapeInformationType=" + shapeInformationType + ", pointO=" + pointO + ", pointA=" + pointA
				+ ", radius=" + radius + "]";
	}

}
