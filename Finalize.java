class FDemo {
	long x;
	
	FDemo(long i) {
		x = i;
	}
	
	protected void finalize() {
		System.out.println("Finalizing "+x);
	}
	
	void generator (long i) {
		FDemo o = new FDemo(i);
	}
}

class Finalize {

	public static void main(String args[]) {
		long count;
		
		FDemo ob = new FDemo(0);
		
		
		
		for (count=1; count<1000000; count++) {
		//ob.generator(count);
			FDemo o = new FDemo(count);
			o = ob;
		}
	
	}

}