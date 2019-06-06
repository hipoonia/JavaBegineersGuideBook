public class ThrowDemo1 {

	public static void main (String args[]) {
	
	
		try {
		
			System.out.println("Before throw.");
			throw new ArithmeticException();
		}
		catch (ArithmeticException e) {
		
			System.out.println("Catch");
		}
		
		System.out.println("after");
		
	}

}