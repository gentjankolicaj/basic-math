package io.math.algebra;
import java.util.Map;
/**
 * @author gentjan kolicaj
 *
 */
public interface Shape<K,V> {
	
	public abstract Map<K,V> getDetails();
	
	public abstract ShapeInformationType getShapeInformationType();

}
