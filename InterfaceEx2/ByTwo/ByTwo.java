//Implement Series.

package ByTwo;
import Series.Series;

public class ByTwo implements Series {

	int start;
	int val;
	int prev;
	
	public ByTwo() {
	
		start = 0;
		val = 0;
		prev = -2;
	}
	
	public int getNext() {
	
		prev = val;
		val += 2;
		return val;
	}
	
	public void reset() {
	
		val = start;
		prev = start - 2;
	}
	
	public void setStart(int x) {
	
		prev = x - 2;
		start = x;
		val = x;
	}
	
	int getPrevious() {
// add a method not defined in Series.	
		return prev;
	}
}






















