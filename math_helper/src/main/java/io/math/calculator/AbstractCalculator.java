package io.math.calculator;

import io.math.exception.ShapeException;
import io.math.shapes._2d.Shape2D;
import io.math.shapes._3d.Shape3D;

public abstract class AbstractCalculator {
	
	
	//2D shapes
	public abstract double  calculatePerimeter(Shape2D shape2D) throws RuntimeException;
	
	public abstract double[]  calculatePerimeters(Shape2D... shape2D) throws RuntimeException;

	public abstract double  calculatePerimeter(Shape2D... shape2D) throws RuntimeException;

	public abstract double  calculateArea(Shape2D shape2D) throws RuntimeException;
	
	public abstract double[]  calculateAreas(Shape2D... shape2D) throws RuntimeException;

	public abstract double  calculateArea(Shape2D... shape2D) throws RuntimeException;
	
	
	//3D shapes
	public abstract double  calculateSurfaceArea(Shape3D shape3D) throws RuntimeException;
	
	public abstract double[]  calculateSurfaceAreas(Shape3D... shape3D) throws RuntimeException;

	public abstract double  calculateSurfaceArea(Shape3D... shape3D) throws RuntimeException;

	public abstract double  calculateVolume(Shape3D shape3D) throws RuntimeException;
	
	public abstract double[]  calculateVolumes(Shape3D... shape3D) throws RuntimeException;

	public abstract double  calculateVolume(Shape3D... shape3D) throws RuntimeException;
	
	

}
