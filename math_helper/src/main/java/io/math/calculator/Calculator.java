package io.math.calculator;

import io.math.formula.AreaFormula;
import io.math.formula.PerimeterFormula;
import io.math.formula.SurfaceAreaFormula;
import io.math.formula.VolumeFormula;
import io.math.shapes._2d.Shape2D;
import io.math.shapes._3d.Shape3D;

/**
 * @author gentjan kolicaj
 *
 */
public class Calculator extends AbstractCalculator {


	public Calculator() {
		super();

	}

	@Override
	public double calculatePerimeter(Shape2D shape2d) throws RuntimeException {
		return PerimeterFormula.apply(shape2d);
	}

	@Override
	public double[] calculatePerimeters(Shape2D... shape2d) throws RuntimeException {
		return PerimeterFormula.apply(shape2d);
	}

	@Override
	public double calculatePerimeter(Shape2D... shape2d) throws RuntimeException {
		double[] arrayPerimeter = PerimeterFormula.apply(shape2d);
		double total = 0.0;
		for (double tmp : arrayPerimeter)
			total += tmp;
		return total;
	}

	@Override
	public double calculateArea(Shape2D shape2d) throws RuntimeException {
		return AreaFormula.apply(shape2d);
	}

	@Override
	public double[] calculateAreas(Shape2D... shape2d) throws RuntimeException {
	return AreaFormula.apply(shape2d);
	}

	@Override
	public double calculateArea(Shape2D... shape2d) throws RuntimeException {
		double[] areaArray=AreaFormula.apply(shape2d);
		double total=0.0;
		for(double tmp:areaArray)
			total+=tmp;
		return total;
	}

	@Override
	public double calculateSurfaceArea(Shape3D shape3d) throws RuntimeException {
		return SurfaceAreaFormula.apply(shape3d);
	}

	@Override
	public double[] calculateSurfaceAreas(Shape3D... shape3d) throws RuntimeException {
		return SurfaceAreaFormula.apply(shape3d);
	}

	@Override
	public double calculateSurfaceArea(Shape3D... shape3d) throws RuntimeException {
		double[] surfaceAreaArray=SurfaceAreaFormula.apply(shape3d);
		double total=0.0;
		for(double tmp:surfaceAreaArray)
			total+=tmp;
		return total;
	}

	@Override
	public double calculateVolume(Shape3D shape3d) throws RuntimeException {
		return VolumeFormula.apply(shape3d);
	}

	@Override
	public double[] calculateVolumes(Shape3D... shape3d) throws RuntimeException {
		return VolumeFormula.apply(shape3d);
	}

	@Override
	public double calculateVolume(Shape3D... shape3d) throws RuntimeException {
		double[] volumeArray=VolumeFormula.apply(shape3d);
		double total=0.0;
		for(double tmp:volumeArray)
			total+=tmp;
		
		return total;
	}

}
