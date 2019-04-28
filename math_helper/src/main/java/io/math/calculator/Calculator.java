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

	private AreaFormula areaFormula;
	private PerimeterFormula perimeterFormula;
	private SurfaceAreaFormula surfaceAreaFormula;
	private VolumeFormula volumeFormula;

	public Calculator() {
		super();
		this.areaFormula = new AreaFormula();
		this.perimeterFormula = new PerimeterFormula();
		this.surfaceAreaFormula = new SurfaceAreaFormula();
		this.volumeFormula = new VolumeFormula();

	}

	@Override
	public double calculatePerimeter(Shape2D shape2d) throws RuntimeException {
		return perimeterFormula.apply(shape2d);
	}

	@Override
	public double[] calculatePerimeters(Shape2D... shape2d) throws RuntimeException {
		return perimeterFormula.apply(shape2d);
	}

	@Override
	public double calculatePerimeter(Shape2D... shape2d) throws RuntimeException {
		double[] arrayPerimeter = perimeterFormula.apply(shape2d);
		double total = 0.0;
		for (double tmp : arrayPerimeter)
			total += tmp;
		return total;
	}

	@Override
	public double calculateArea(Shape2D shape2d) throws RuntimeException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double[] calculateAreas(Shape2D... shape2d) throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateArea(Shape2D... shape2d) throws RuntimeException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateSurfaceArea(Shape3D shape3d) throws RuntimeException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double[] calculateSurfaceAreas(Shape3D... shape3d) throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateSurfaceArea(Shape3D... shape3d) throws RuntimeException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateVolume(Shape3D shape3d) throws RuntimeException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double[] calculateVolumes(Shape3D... shape3d) throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateVolume(Shape3D... shape3d) throws RuntimeException {
		// TODO Auto-generated method stub
		return 0;
	}

}
