

class SeriesDemo {

	public static void main (String args[]) {
	
		ByTwo ob = new ByTwo();
		
		for (int i=0; i<5; i++) {
			System.out.println("Next value is " + ob.getNext());
		}
		
		System.out.println("\n Resetting");
		ob.reset();
		
		for (int i=0; i<5; i++) {
			System.out.println("Next value is " + ob.getNext());
		}
		
		System.out.println("\n Starting at 100");
		ob.setStart(100);
		
		for (int i=0; i<5; i++) {
			System.out.println("Next value is " + ob.getNext());
		}
		
	}
}