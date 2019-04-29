package io.math.formula;

import io.math.algebra.ShapeInformationType;
import io.math.exception.AreaException;
import io.math.exception.ShapeException;
import io.math.exception.SurfaceAreaException;
import io.math.shapes._2d.Circle;
import io.math.shapes._2d.Hexagram;
import io.math.shapes._2d.Line;
import io.math.shapes._2d.Parallelogram;
import io.math.shapes._2d.Pentagram;
import io.math.shapes._2d.Rectangle;
import io.math.shapes._2d.Square;
import io.math.shapes._2d.Trapezoid;
import io.math.shapes._2d.Triangle;
import io.math.shapes._3d.Cone;
import io.math.shapes._3d.Cube;
import io.math.shapes._3d.Cuboid;
import io.math.shapes._3d.Cylinder;
import io.math.shapes._3d.Ellipsoid;
import io.math.shapes._3d.Shape3D;
import io.math.shapes._3d.Sphere;
import io.math.shapes._3d.SquarePyramid;
import io.math.utils.DistanceUtils;
import io.math.utils.FormulaUtils;

/**
 * @author gentjan kolicaj
 *
 */
public class SurfaceAreaFormula {

	public SurfaceAreaFormula() {
	}

	
	public static double apply(Shape3D t) throws RuntimeException {
		if (t instanceof Cone) {
			Cone c = (Cone) t;
			if (c.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return Math.PI * c.getRadius() * c.getRadius() + Math.PI * c.getRadius()
						* Math.sqrt(c.getRadius() * c.getRadius() + c.getHeight() * c.getHeight());
			} else {
				double r = DistanceUtils.distance(c.getPointO(), c.getPointA());
				double h = DistanceUtils.distance(c.getPointO(), c.getPointH());
				return Math.PI * r * r + Math.PI * r * Math.sqrt(r * r + h * h);
			}
		} else if (t instanceof Cube) {
			Cube c = (Cube) t;
			if (c.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return 6 * c.getSide() * c.getSide();
			} else {
				double side = DistanceUtils.distance(c.getPointA(), c.getPointB());
				return 6 * side * side;
			}
		} else if (t instanceof Cuboid) {
			Cuboid c = (Cuboid) t;
			if (c.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return 2 * (c.getLength() * c.getWidth() + c.getLength() * c.getHeight()
						+ c.getWidth() * c.getHeight());
			} else {
				double length = DistanceUtils.distance(c.getPointA(), c.getPointB());
				double width = DistanceUtils.distance(c.getPointB(), c.getPointC());
				double height = DistanceUtils.distance(c.getPointA(), c.getPointE());
				return 2 * (length * width + length * height + width * length);
			}
		} else if (t instanceof Cylinder) {
			Cylinder c = (Cylinder) t;
			if (c.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE))
				return 2 * Math.PI * c.getRadius() * c.getHeight() + 2 * Math.PI * c.getRadius() * c.getRadius();
			else {
				double radius = DistanceUtils.distance(c.getPointO(), c.getPointA());
				double height = DistanceUtils.distance(c.getPointO(), c.getPointH());
				return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
			}

		} else if (t instanceof Ellipsoid) {
			throw new SurfaceAreaException(
					"For shapes of type elipsoid formula for calculation of SA not implemented yet !!!");

		} else if (t instanceof SquarePyramid) {
			SquarePyramid s = (SquarePyramid) t;
			if (s.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				double baseArea = s.getBaseSideLength() * s.getBaseSideLength();
				double slantHeightOfPyramid = FormulaUtils.usePythagorasTheorem(s.getBaseSideLength() / 2, s.getHeight());
				double basePerimeter = 4 * s.getBaseSideLength();
				return (slantHeightOfPyramid * basePerimeter) / 2 + baseArea;
			} else {
				double baseLength = DistanceUtils.distance(s.getPointO(), s.getPointA());
				double height = DistanceUtils.distance(s.getPointO(), s.getPointH());
				double baseArea = baseLength * baseLength;
				double slantHeightOfPyramid = FormulaUtils.usePythagorasTheorem(baseLength / 2, height);
				double basePerimeter = 4 * baseLength;
				return (slantHeightOfPyramid * basePerimeter) / 2 + baseArea;
			}

		} else if (t instanceof Sphere) {
			Sphere s = (Sphere) t;
			if (s.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return 4 * Math.PI * s.getRadius() * s.getRadius();
			} else {
				double radius = DistanceUtils.distance(s.getPointO(), s.getPointA());
				return 4 * Math.PI * radius * radius;
			}

		} else
			throw new ShapeException(
					"Shape unknown : " + t + ".Formula for finding surface area of this shape not found !!!");

	}

	
	public static double[] apply(Shape3D... t) throws RuntimeException {
		double[] array = new double[t.length];
		for (int i = 0; i < t.length; i++) {
			double surfaceArea = apply(t[i]);
			array[i] = surfaceArea;
		}
		return array;
	}

}
