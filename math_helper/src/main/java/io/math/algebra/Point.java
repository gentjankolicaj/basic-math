package io.math.algebra;

public class Point {

	private Dimension dimension;
	private double x;
	private double y;
	private double z;
	private double w;
	
	public Point() {
		super();
		this.dimension=Dimension.D0;
	}

	public Point(double x) {
		super();
		this.x = x;
		this.dimension=Dimension.D1;
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
		this.dimension=Dimension.D2;
	}

	public Point(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.dimension=Dimension.D3;
	}

	public Point(double x, double y, double z, double w) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
		this.dimension=Dimension.D4;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	public Dimension getDimension() {
		return dimension;
	}

	
}
