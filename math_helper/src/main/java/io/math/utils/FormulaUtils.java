package io.math.utils;

public class FormulaUtils {
	
	public static double usePythagorasTheorem(double a,double b) {
		return Math.sqrt(a*a+b*b);
	}
	
	public static double useHeronFormula(double a,double b,double c) {
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

}
