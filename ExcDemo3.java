/*
class ExcTest {

	static void genException() {
	
		int nums[] = new int[4];
		
		System.out.println("Before exception is generated .");
		
		nums[7] = 10;
		
		System.out.println("This wont be displayed");
	}
}
*/

class ExcDemo3 {
	
	public static void main (String[] args) {
		
		int numer[] = { 4, 8, 16 , 32 , 64 , 128 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };
		
		for (int i=0; i<numer.length; i++) {
			
			try {
			
				System.out.println(numer[i]+"/"+denom[i]+" is "+ numer[i]/denom[i]);
			}
			
			catch (ArithmeticException exc) {
			
				System.out.println("Cant divide by Zero!");
			}
			
			
		}
		
		
		
		System.out.println("program ends");
		
	}
	
}



					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 

