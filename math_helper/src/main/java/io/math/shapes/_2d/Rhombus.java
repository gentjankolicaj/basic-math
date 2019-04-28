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
public class Rhombus extends Shape2D {

	private ShapeInformationType shapeInformationType;

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;

	private double side;

	private double base;
	private double height;

	public Rhombus(Point pointA, Point pointB, Point pointC, Point pointD) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
		this.shapeInformationType = ShapeInformationType.POINT;
	}

	public Rhombus(double side) {
		super();
		this.side = side;
		this.shapeInformationType = ShapeInformationType.SIDE_MEASURE;
	}

	public Rhombus(double base, double height) {
		super();
		this.base = base;
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

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public Map<DetailType, Object> getDetails() {
		Double[] commonMeasure = { new Double(base), new Double(height) };
		Double[] sideMeasure = { new Double(side) };
		Point[] points = { pointA, pointB, pointC, pointD };
		Map<DetailType, Object> map = new HashMap<>();
		map.put(DetailType.POINT, points);
		map.put(DetailType.COMMON_MEASURE, commonMeasure);
		map.put(DetailType.SIDE_MEASURE, sideMeasure);

		return map;
	}

	@Override
	public ShapeInformationType getShapeInformationType() {
		return shapeInformationType;
	}

	@Override
	public String toString() {
		return "Rhombus [shapeInformationType=" + shapeInformationType + ", pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + ", pointD=" + pointD + ", side=" + side + ", base=" + base + ", height="
				+ height + "]";
	}

}
