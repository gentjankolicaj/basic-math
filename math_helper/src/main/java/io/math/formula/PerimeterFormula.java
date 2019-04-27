package io.math.formula;

import io.math.algebra.ShapeInformationType;
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

/**
 * @author gentjan kolicaj
 *
 */
public class PerimeterFormula implements Formula<Shape2D>{
	
	public PerimeterFormula() {}

	@Override
	public double apply(Shape2D t) throws RuntimeException {
		if(t instanceof Line) {
			Line l=(Line)t;
			if(l.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return DistanceUtils.distance(l.getA(),l.getB());
				
			}else {
				return DistanceUtils.distance(l.getPointA(), l.getPointB());
				
			}
		}else if(t instanceof Triangle) {
			Triangle tr=(Triangle) t;
			if(tr.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				/*
				 * double s1=tr.getBase(); double s2=tr.getHeight(); 
				 */
				throw new PerimeterException("Perimeter of triangle with base="+tr.getBase()+",height="+tr.getHeight()+" can't be found because formula is not implemented");
				
			}else if(tr.getShapeInformationType().equals(ShapeInformationType.SIDE_MEASURE)) {
				return tr.getSide1()+tr.getSide2()+tr.getSide3();
				
			}else {
				double s1=DistanceUtils.distance(tr.getPointA(), tr.getPointB());
				double s2=DistanceUtils.distance(tr.getPointB(), tr.getPointC());
				double s3=DistanceUtils.distance(tr.getPointC(), tr.getPointA());
				return s1+s2+s3;
				
			}
		}else if(t instanceof Square) {
			Square s=(Square)t;
			if(s.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE) ){
				return 4*s.getBase();
						
			}else {
				double s1=DistanceUtils.distance(s.getPointA(), s.getPointB());
				return 4*s1;
			}
		}else if(t instanceof Rectangle) {
			Rectangle r=(Rectangle) t;
			if(r.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return 2*r.getLength()+2*r.getWidth();
				
			}else {
				double s1=DistanceUtils.distance(r.getPointA(), r.getPointB());
				double s2=DistanceUtils.distance(r.getPointB(),r.getPointC());
				return s1*2+s2*2;
			}
		}else if(t instanceof Parallelogram) {
			Parallelogram p=(Parallelogram)t;
			if(p.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return 2*p.getBase()+2*p.getHeight();
				
			}else {
				double s1=DistanceUtils.distance(p.getPointA(), p.getPointB());
				double s2=DistanceUtils.distance(p.getPointB(),p.getPointC());
				return s1*2+s2*2;
			}
		}else if(t instanceof Trapezoid) {
			Trapezoid tp=(Trapezoid)t;
			if(tp.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				double avgBase=(tp.getBase1()+tp.getBase2())/2;
				return 2*avgBase+2*tp.getHeight();
				
			}else if(tp.getShapeInformationType().equals(ShapeInformationType.SIDE_MEASURE)) {
				return tp.getSide1()+tp.getSide2()+tp.getSide3()+tp.getSide4();
				
			}else {
				double s1=DistanceUtils.distance(tp.getPointA(), tp.getPointB());
				double s2=DistanceUtils.distance(tp.getPointB(),tp.getPointC());
				double s3=DistanceUtils.distance(tp.getPointC(),tp.getPointD());
				double s4=DistanceUtils.distance(tp.getPointD(),tp.getPointA());
				return s1+s2+s3+s4;
			}
		}else if(t instanceof Pentagram) {
			Pentagram p = (Pentagram) t;
			if (p.getShapeInformationType().equals(ShapeInformationType.SIDE_MEASURE)) {
				return p.getSide1() + p.getSide2() + p.getSide3() + p.getSide4() + p.getSide5();

			} else {
				double s1 = DistanceUtils.distance(p.getPointA(), p.getPointB());
				double s2 = DistanceUtils.distance(p.getPointB(), p.getPointC());
				double s3 = DistanceUtils.distance(p.getPointC(), p.getPointD());
				double s4 = DistanceUtils.distance(p.getPointD(), p.getPointE());
				double s5 = DistanceUtils.distance(p.getPointE(), p.getPointA());
				return s1 + s2 + s3 + s4 + s5;
			}
		}else if(t instanceof Hexagram) {
			Hexagram h = (Hexagram) t;
			if (h.getShapeInformationType().equals(ShapeInformationType.SIDE_MEASURE)) {
				return h.getSide1() + h.getSide2() + h.getSide3() + h.getSide4() + h.getSide5();

			} else {
				double s1 = DistanceUtils.distance(h.getPointA(), h.getPointB());
				double s2 = DistanceUtils.distance(h.getPointB(), h.getPointC());
				double s3 = DistanceUtils.distance(h.getPointC(), h.getPointD());
				double s4 = DistanceUtils.distance(h.getPointD(), h.getPointE());
				double s5 = DistanceUtils.distance(h.getPointE(), h.getPointF());
				double s6 = DistanceUtils.distance(h.getPointF(), h.getPointA());
				return s1 + s2 + s3 + s4 + s5+s6;
			}
		}else if(t instanceof Circle) {
			Circle c=(Circle) t;
			if(c.getShapeInformationType().equals(ShapeInformationType.COMMON_MEASURE)) {
				return 2*Math.PI*c.getRadius();
			}else {
				double radius=DistanceUtils.distance(c.getPointO(), c.getPointA());
				return 2*Math.PI*radius;
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
