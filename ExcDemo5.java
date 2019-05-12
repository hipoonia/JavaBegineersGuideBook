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

class ExcDemo5 {
	
	public static void main (String[] args) {
		
		int numer[] = { 4, 8, 16 , 32 , 64 , 128 , 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };
		
		for (int i=0; i<numer.length; i++) {
			
			try {
			
				System.out.println(numer[i]+"/"+denom[i]+" is "+ numer[i]/denom[i]);
			}
			
			catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println("No matching element found. ");
			}
			
			catch (Throwable exc) {
			
				System.out.println("Some exception occured. ");
			}
			
			
			
			
		}
		
		
		
		System.out.println("program ends");
		
	}
	
}



					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 

