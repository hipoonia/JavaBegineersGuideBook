package SeriesDemo;
import ByTwo.ByTwo;
import ByThree.ByThree;
import Series.Series;

class SeriesDemo2 {

	public static void main (String args[]) {
	
		ByTwo twoOb = new ByTwo();
		ByThree threeOb = new ByThree();
		Series ob;
		
		
		
		for (int i=0; i<5; i++) {
			ob = twoOb;
			System.out.println("Next ByTwo value is " + ob.getNext());
			ob = threeOb;
			System.out.println("Next ByThre value is " + ob.getNext());
			
		}
	
		
	}
}