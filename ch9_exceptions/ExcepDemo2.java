class ExcepDemo2 {

	public static void main(String args[]) {
	
	
		
		
		try {
			ExcTest.genException();
			
		}
		
		
		catch (ArrayIndexOutOfBoundsException e) {
			
				System.out.println("index out of bounds from main");
				
		}
		
		System.out.println("after catch statement");
		
	}
}

class ExcTest {

	static void genException() {
	
		int nums[] =  new int[4];
		System.out.println("before exception is generated");
		
		try {
			nums[7] = 10;
			
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
				System.out.println("index out of bounds from genException method");
				
		}
		

		System.out.println("this wont be printed");
		
	}
}






