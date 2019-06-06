class ExcepMismatch {
	
	public static void main(String args[]) {
	
		try {
		
			int nums[] = new int[4];
		
			System.out.println("Befre");
		
			nums[7] = 10;
			System.out.println("wont be printed");
		}
		
		catch (ArithmeticException e) {
			
			System.out.println("this also wont be printed");
			
		}
		
		System.out.println("after");
		
		
	}
 }