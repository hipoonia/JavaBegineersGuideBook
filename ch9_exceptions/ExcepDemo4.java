class ExcepDemo4 {

	public static void main(String args[]) {
	
		int num[] = {4,8,16,32,64,128, 256, 512};
		int den[] = {2,0,4,4,0,8};
		
		
		for (int i=0; i<num.length; i++) {
		
			try {
				
				int x = num[i]/den[i];
				System.out.println(i);
			
			}
			
			catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println("out of bounds");
				
				
			}
			
			catch (ArithmeticException e) {
			
				System.out.println("cant divide by zero!");
				
				
			}	
			
			
		}
		
		System.out.println("after catch statement");
		
	}
}

