class UseFinally {

	public static void getException (int what) {
	
		int t;
		int nums[] = new int[2];
		
		System.out.println("Receiving "+ what);
		
		try {
		
			switch(what) {
			
				case 0:
					t = 10/what;
					break;
				case 1:
					nums[4] = 4;
					break;
				case 2:
					return;
			}
		}
		
		catch (ArithmeticException ecx) {
		
			System.out.println("cant divide by zero!!");
			return;
		}
		catch (ArrayIndexOutOfBoundsException exc) {
		
			System.out.println("No matching element found.");
		}
		
		finally {
			
			System.out.println("closing connections. ");
			System.out.println("leaving try. ");
		}
	}
}

class FinallyDemo {

	public static void main (String args[]) {
	
		for (int i=0; i<3; i++) {
		
			UseFinally.getException(i);
			System.out.println();
		}
	}
}













