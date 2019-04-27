package io.math.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import io.math.algebra.Point;
import io.math.shapes._2d.Line;
import io.math.shapes._2d.Square;
import io.math.shapes._2d.Triangle;

public class CalculatorTest {

	Calculator calc=new Calculator();
	
	@Test
	public void testCalculatePerimeterShape2D() {
		Line line=new Line(new Point(1),new Point(2));
		Square square=new Square(new Point(0,0),new Point(1,0),new Point(1,1),new Point(0,1));
		Triangle triangle=new Triangle(new Point(0,0),new Point(3,0),new Point(2,1));
		double[] resultArray=calc.calculatePerimeters(line,square,triangle);
		for(double var:resultArray)
			System.out.println(var);
	}

	@Test
	public void testCalculatePerimeters() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculatePerimeterShape2DArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculateAreaShape2D() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculateAreas() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculateAreaShape2DArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculateSurfaceAreaShape3D() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculateSurfaceAreas() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculateSurfaceAreaShape3DArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculateVolumeShape3D() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculateVolumes() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculateVolumeShape3DArray() {
		fail("Not yet implemented");
	}

}
