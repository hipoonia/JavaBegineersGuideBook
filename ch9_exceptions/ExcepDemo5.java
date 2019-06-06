class ExcepDemo5 {

	public static void main(String args[]) {
	
		int num[] = {4,8,16,32,64,128, 256, 512};
		int den[] = {2,0,4,4,0,8};
		
		
		for (int i=0; i<num.length; i++) {
		
			try {
				
				int x = num[i]/den[i];
				System.out.println(i);
			
			}
			
			//catch (Throwable e) {
				
			//	System.out.println("some exception occured");
				
				
		//	}
			
			// Unreachable code in java is an error!
			
			catch (ArithmeticException e) {
			
				System.out.println("cant divide by zero!");
				
				
			}	
			
			catch (Throwable e) {
				
				System.out.println("some exception occured");
				
				
			}
			
			
			
			
		}
		
		System.out.println("after catch statement");
		
	}
}

