package io.math.formula;

import io.math.algebra.ShapeInformationType;
import io.math.exception.AreaException;
import io.math.exception.PerimeterException;
import io.math.exception.ShapeException;
import io.math.shapes._2d.Circle;
import io.math.shapes._2d.Hexagram;
import io.math.shapes._2d.Line;
import io.math.shapes._2d.Parallelogram;
import io.math.shapes._2d.Pentagram;
import io.math.shapes._2d.Rectangle;
import io.math.shapes._2d.Shape2D;
import io.math.shapes._2d.Square;
import io.math.shapes._2d.Trapezoid;
import io.math.shapes._2d.Triangle;
import io.math.utils.DistanceUtils;
import io.math.utils.FormulaUtils;

/**
 * @author gentjan kolicaj
 *
 */
public class AreaFormula implements Formula<Shape2D>{
	
	public AreaFormula() {}

	@Override
	public double apply(Shape2D t) throws RuntimeException {
		if(t instanceof Line) {
			return 0.0;
		}else if(t instanceof Triangle) {
			Triangle tr=(Triangle) t;
			if(tr.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return tr.getBase()*tr.getHeight()/2;
				
			}else if(tr.getShapeInformationType().equals(ShapeInformationType.SIDE_MEASURE)) {
				return FormulaUtils.useHeronFormula(tr.getSide1(), tr.getSide2(), tr.getSide3());
				
			}else {
				//to be implemented with matrix
			   return 0.0;
				
			}
		}else if(t instanceof Square) {
			Square s=(Square)t;
			if(s.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE) ){
				return s.getBase()*s.getBase();	
			}else {
				double s1=DistanceUtils.distance(s.getPointA(), s.getPointB());
				return s1*s1;
			}
		}else if(t instanceof Rectangle) {
			Rectangle r=(Rectangle) t;
			if(r.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) 
				return r.getLength()+r.getWidth();	
			else 
				throw new AreaException("For rectangle shapes,only formula with base x height is implemented.");
	
		}else if(t instanceof Parallelogram) {
			Parallelogram p=(Parallelogram)t;
			if(p.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return p.getBase()*p.getHeight();
			}else 
				throw new AreaException("For parallelogram shapes,only formula with base x height is implemented.");
				
		
		}else if(t instanceof Trapezoid) {
			Trapezoid tp=(Trapezoid)t;
			if(tp.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				double avgBase=(tp.getBase1()+tp.getBase2())/2;
				return avgBase*tp.getHeight();
			}else 
				throw new AreaException("For trapezoid shapes,only formula with 1/2(base1 x base2) x height is implemented.");
					
		}else if(t instanceof Pentagram) {
			throw new AreaException("For Pentagram shapes,the formula for calculating area isn't implemented.");
		
		}else if(t instanceof Hexagram) {
			throw new AreaException("For hexagram shapes,the formula for calculating area isn't implemented.");
			
		}else if(t instanceof Circle) {
			Circle c=(Circle) t;
			if(c.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return Math.PI*c.getRadius()*c.getRadius();
			}else {
				double radius=DistanceUtils.distance(c.getPointO(), c.getPointA());
				return Math.PI*radius*radius;
			}
			
		}else throw new ShapeException("Shape unknown : "+t+".Formual for finding perimeter of this shape not found !!!");

	}

	@Override
	public double[] apply(Shape2D... t) throws RuntimeException {
		double[] array=new double[t.length];
		for(int i=0;i<t.length;i++) {
			double perimeter=apply(t[i]);
			array[i]=perimeter;
		}
		return array;
	}

	

}
