package io.math.formula;

import io.math.shapes._2d.Circle;
import io.math.shapes._2d.Hexagram;
import io.math.shapes._2d.Line;
import io.math.shapes._2d.Parallelogram;
import io.math.shapes._2d.Pentagram;
import io.math.shapes._2d.Rectangle;
import io.math.shapes._2d.Shape2D;
import io.math.shapes._2d.Square;
import io.math.shapes._2d.Triangle;

/**
 * @author gentjan kolicaj
 *
 */
public class PerimeterFormula implements Formula<Shape2D>{
	
	public PerimeterFormula() {}

	@Override
	public double apply(Shape2D t) throws RuntimeException {
		if(t instanceof Line) {
			return 0;
		}else if(t instanceof Triangle) {
			return 0;
		}else if(t instanceof Square) {
			return 0;
		}else if(t instanceof Rectangle) {
			return 0;
		}else if(t instanceof Parallelogram) {
			return 0;
		}else if(t instanceof Pentagram) {
			return 0;
		}else if(t instanceof Hexagram) {
			return 0;
		}else if(t instanceof Circle) {
			return 0;
		}else return 0;
	}

	@Override
	public double[] apply(Shape2D... t) throws RuntimeException {
		double[] array=new double[t.length];
		for(Shape2D var:t) {
			
		}
		return array;
	}
	

}
