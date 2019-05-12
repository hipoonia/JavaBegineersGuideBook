class Overload {
	
	void ovlDemo() {
		System.out.println("No parameters");
		System.out.println();
	}
	
	void ovlDemo( int a) {
		System.out.println("One parameter: "+a);
		System.out.println();
	}
	
	/* this wont work, even if return types are diff. 
	int ovlDemo( int a) {
		System.out.println("One parameter: "+a);
		System.out.println();
	}
	*/
	
	int ovlDemo (int a, int b ) {
		System.out.println("two parameters: "+a+" "+b);
		System.out.println();
		return a+b;
	}
	
	double ovlDemo (double a, double b ) {
		System.out.println("two double parameters: "+a+" "+b);
		System.out.println();
		return a+b;
	}
	
	
}



class OverloadDemo {
	public static void main (String args[]) {
	
		Overload ob = new Overload();
		
		int resI;
		double resD;
		
		ob.ovlDemo();
		
		ob.ovlDemo(2);
		
		resI = ob.ovlDemo(4,6);
		System.out.println(resI);
		
		resD = ob.ovlDemo(1.1,2.32);
		System.out.println(resD);
		
	
	}	
		

}























