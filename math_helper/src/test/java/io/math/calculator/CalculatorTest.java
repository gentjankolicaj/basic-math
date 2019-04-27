package io.math.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import io.math.algebra.Point;
import io.math.shapes._2d.Line;
import io.math.shapes._2d.Square;

public class CalculatorTest {

	Calculator calc=new Calculator();
	
	@Test
	public void testCalculatePerimeterShape2D() {
		Line line=new Line(new Point(1),new Point(2));
		Square square=new Square(new Point(1,0),new Point(1,0),new Point(1,1),new Point(0,1));
		double value=calc.calculatePerimeter(line);
		double value2=calc.calculatePerimeter(square);
		System.out.println(value);
		System.out.println(value2);
		
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
