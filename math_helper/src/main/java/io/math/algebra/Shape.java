package io.math.algebra;
import java.util.Map;

public interface Shape<K,V> {
	
	public abstract Map<K,V> getDetails();
	
	public abstract ShapeInformationType getShapeInformationType();

}
