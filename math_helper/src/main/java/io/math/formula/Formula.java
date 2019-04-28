package io.math.formula;
/**
 * @author gentjan kolicaj
 *
 */
public interface Formula<T> {
	
	public abstract double apply(T t) throws RuntimeException;
	
	public abstract double[] apply(T... t) throws RuntimeException;


}
