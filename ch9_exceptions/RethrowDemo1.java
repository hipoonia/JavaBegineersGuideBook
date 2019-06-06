class Rethrow1 {

	public static void genException() {
	
	
		int num[] = {4,8,16,32,64,128, 256, 512};
		int den[] = {2,0,4,4,0,8};
		
		for (int i=0; i<num.length; i++) {
		
			try {
			
				System.out.println(i);
				int x = num[i]/den[i];
			}
			catch (ArithmeticException e) {
			
				System.out.println("cant divide by zero!");
			}
			
			catch (ArrayIndexOutOfBoundsException e) {
			
				System.out.println("out of bound exception!!!");
				throw e;
			}
		
		}
		
	}

}

class RethrowDemo1 {

	public static void main(String args[]) {
	
		try {
		
			Rethrow1.genException();
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("fatal");
			
		}
	}
}












