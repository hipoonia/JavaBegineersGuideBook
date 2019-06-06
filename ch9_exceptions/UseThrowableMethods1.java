class ExcTest1 {

	static void genException() {
	
		int nums[] = new int[4];
		
		System.out.println("Before ");
		
		nums[7] = 10;
		System.out.println(" !!wont be printed ");
	}
}

class UseThrowableMethods1 {

	public static void main (String args[]) {
	
		try {
		
			ExcTest1.genException();
		}
		catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("standard msg is: ");
			System.out.println(e);
			
			System.out.println("\n\n stack trace is: ");
			e.printStackTrace();
		}
		
		System.out.println("after ");
	}
}