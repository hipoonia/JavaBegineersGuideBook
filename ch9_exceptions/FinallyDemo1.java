class UseFinally1 {

	public static void genException (int what) {
	
		int t;
		int nums[] = new int[2];
		
		System.out.println("Receiving: " + what);
		
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
		catch (ArithmeticException e) {
		
			System.out.println("cant divide by 0");
			return;
		}
		catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("out of bounds");
		}
		finally {
		
			System.out.println("leaving try");
		}
	
	}

}


class FinallyDemo1 {

	public static void main (String args[]) {
	
		for (int i=0; i<3; i++) {
		
			UseFinally1.genException(i);
			System.out.println();
		}
	}
}













