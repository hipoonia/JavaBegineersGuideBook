class Factorial {
	
	long factR (long n) {
		
		long result;
		if (n==1) return 1;
		result = factR(n-1) * n;
		return result;
	
	}
	
	long factI (long n) {
		long t, result;
		
		result = 1;
		for (t=1;t<=n;t++) result *= t;
		return result;
	
	}
	
}



class Recursion {
	public static void main (String args[]) {
	
		Factorial f = new Factorial();
		System.out.println(f.factR(5));
		System.out.println(f.factI(5));
		System.out.println(f.factR(6));
		System.out.println(f.factI(6));
		System.out.println(f.factR(21));
		System.out.println(f.factI(21));
		
	}	
		

}























