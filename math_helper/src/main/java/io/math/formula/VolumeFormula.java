package io.math.formula;

import io.math.algebra.ShapeInformationType;
import io.math.exception.ShapeException;
import io.math.exception.SurfaceAreaException;
import io.math.shapes._3d.Cone;
import io.math.shapes._3d.Cube;
import io.math.shapes._3d.Cuboid;
import io.math.shapes._3d.Cylinder;
import io.math.shapes._3d.Ellipsoid;
import io.math.shapes._3d.Shape3D;
import io.math.shapes._3d.Sphere;
import io.math.shapes._3d.SquarePyramid;
import io.math.utils.DistanceUtils;

/**
 * @author gentjan kolicaj
 *
 */
public class VolumeFormula{
	
	public VolumeFormula() {}

	
	public static double apply(Shape3D t) throws RuntimeException {
		if (t instanceof Cone) {
			Cone c = (Cone) t;
			if (c.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return Math.PI*c.getRadius()*c.getRadius()*c.getHeight()/3;
			} else {
				double r = DistanceUtils.distance(c.getPointO(), c.getPointA());
				double h = DistanceUtils.distance(c.getPointO(), c.getPointH());
				return Math.PI *r*r*h/3;
			}
		} else if (t instanceof Cube) {
			Cube c = (Cube) t;
			if (c.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return c.getSide() * c.getSide() * c.getSide();
			} else {
				double side = DistanceUtils.distance(c.getPointA(), c.getPointB());
				return side* side * side;
			}
		} else if (t instanceof Cuboid) {
			Cuboid c = (Cuboid) t;
			if (c.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return c.getLength() * c.getWidth()*c.getHeight();
			} else {
				double length = DistanceUtils.distance(c.getPointA(), c.getPointB());
				double width = DistanceUtils.distance(c.getPointB(), c.getPointC());
				double height = DistanceUtils.distance(c.getPointA(), c.getPointE());
				return length*width*height;
			}
		} else if (t instanceof Cylinder) {
			Cylinder c = (Cylinder) t;
			if (c.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE))
				return  Math.PI * c.getRadius()*c.getRadius() * c.getHeight();
			else {
				double radius = DistanceUtils.distance(c.getPointO(), c.getPointA());
				double height = DistanceUtils.distance(c.getPointO(), c.getPointH());
				return  Math.PI * radius *radius* height;
			}

		} else if (t instanceof Ellipsoid) {
			throw new SurfaceAreaException(
					"For shapes of type elipsoid formula for calculation of volume not implemented yet !!!");

		} else if (t instanceof SquarePyramid) {
			SquarePyramid s = (SquarePyramid) t;
			if (s.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return s.getBaseSideLength() * s.getBaseSideLength()*s.getHeight()/3;
			} else {
				double baseSideLength = DistanceUtils.distance(s.getPointO(), s.getPointA());
				double height = DistanceUtils.distance(s.getPointO(), s.getPointH());
	    		return baseSideLength*baseSideLength*height/3;
			}

		} else if (t instanceof Sphere) {
			Sphere s = (Sphere) t;
			if (s.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return 4 * Math.PI * s.getRadius() * s.getRadius()*s.getRadius()/3;
			} else {
				double radius = DistanceUtils.distance(s.getPointO(), s.getPointA());
				return 4 * Math.PI * radius * radius*radius/3;
			}

		} else
			throw new ShapeException(
					"Shape unknown : " + t + ".Formula for finding volume of this shape not found !!!");

	}

	
	public static double[] apply(Shape3D... t) throws RuntimeException {
		double[] array=new double[t.length];
		for(int i=0;i<t.length;i++) {
			double volume=apply(t[i]);
			array[i]=volume;
		}
		return array;
	}
	
	

}
