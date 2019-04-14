package io.math.utils;

public class DistanceUtils {

	public static double distance(double x1,double x2) {
		return Math.abs(x2-x1);
	}
	
	public static double distance(double x1,double x2,double y1,double y2) {
		double x=x2-x1;
		double y=y2-y1;
		return Math.sqrt(x*x+y*y);
	}
	public static double distance(double x1,double x2,double y1,double y2,double z1,double z2) {
		double x=x2-x1;
		double y=y2-y1;
		double z=z2-z1;
		return Math.sqrt(x*x+y*y+z*z);
	}
}
