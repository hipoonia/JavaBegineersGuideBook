class Guess {
	public static void main (String args[]) 
	
		double num, sroot, rerr;
	
	for (int i=1.0; i<100.0; i++) {
		sroot = Math.sqrt(num);
		System.out.println("Square root of "+num+" is "+sroot);
		
		rerr = num - (sroot*sroot);
		System.out.println("Rounding error is " + rerr);
		System.out.println();
		
	}
		
	}
}