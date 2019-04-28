package io.math.algebra;
/**
 * @author gentjan kolicaj
 *
 */
public enum Dimension {

	D0(0),D1(1),D2(2),D3(3),D4(4);
	private int index;
	
    Dimension(int index){
    	this.index=index;
    }
    
    public int getIndex() {
    	return index;
    }
}
