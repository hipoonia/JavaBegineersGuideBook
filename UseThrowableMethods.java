class ExcTest {
	static void genException() {
		
	int nums[] = new int[4];
	
	System.out.println("before exception is generated. ");
	
	nums[7] = 10;
	
	System.out.println("this wont be displayed");

	}
}
	

class UseThrowableMethods {

	public static void main (String args[]) {
	
		try {
		
			ExcTest.genException();
		}
		
		catch (ArrayIndexOutOfBoundsException exc) {
		
			System.out.println("Standard msg is :");
			System.out.println(exc);
			System.out.println("\nStack Trace:");
			exc.printStackTrace();
		}
		
		System.out.println("After catch statement.");
	}
}