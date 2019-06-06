class NestedTrys {

	public static void main(String args[]) {
	
		int num[] = {4,8,16,32,64,128, 256, 512};
		int den[] = {2,0,4,4,0,8};
		
		try {
			for (int i=0; i<num.length; i++) {
		
			try {
				
				int x = num[i]/den[i];
				System.out.println(i);
			
			}
			
			catch (ArithmeticException e) {
			
				System.out.println("cant divide by zero!");
				
				
				}
			}
			
		}
	// You might use an outer try block to catch the most
//severe errors, allowing inner try blocks to handle less serious ones.	
		catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println("outer try");
				
				
		}
		
		System.out.println("after catch statement");
		
	}
}

