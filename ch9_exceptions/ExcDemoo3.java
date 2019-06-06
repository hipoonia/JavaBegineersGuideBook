class ExcDemoo3 {

	public static void main(String args[]) {
	
	
		int nums[] = new int[4];	
		
		try {
			try {
		
				System.out.println("before exception is generated");

				nums[7] = 10;

				System.out.println("this wont be printed");
			} 
			
			catch (ArrayIndexOutOfBoundsException e) {
			
				System.out.println("index out of bounds");
				int x = 10/0;
			}
		} 
		catch (ArithmeticException e) {
		
			System.out.println("divide by zero");
		}
		
		
		 
		
		
		System.out.println("after catch statement");
		
	}
}