//Implement Series.

package ByThree;
import Series.Series;

public class ByThree implements Series {

	int start;
	int val;

	
	public ByThree() {
	
		start = 0;
		val = 0;
	}
	
	public int getNext() {
	
		val += 3;
		return val;
	}
	
	public void reset() {
	
		val = start;
	}
	
	public void setStart(int x) {
	
		start = x;
		val = x;
	}
	

}























