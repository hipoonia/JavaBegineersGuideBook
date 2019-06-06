/*
Each multi-catch parameter is
implicitly final. (You can explicitly specify final, if desired, but it is not necessary.) Because each
multi-catch parameter is implicitly final, it can't be assigned a new value
 ??
 */

class multicatch {

	public static void main (String args[]) {
	
		int a=88, b=0;
		
		int result;
		
		char chrs[] = {'A', 'B', 'C'};
		
		for (int i=0; i<2; i++) {
		
			try {
			
				if (i==0)
					result = a/b;
				else 
					chrs[5] = 'X';
			}
			
			catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			
				System.out.println("Exception caught: " + e);
			}
		
		}
		
		System.out.println("after multi-catch");
	}
}