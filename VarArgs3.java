class VarArgs3 {
		
	static void vaTest (int ... v) {
			
		System.out.println("vaTest (int ...): "+ "Number of args: "+ v.length);
		
			
			if (v.length!=0) 	
				System.out.println("contents: ");
			
			for (int i=0; i<v.length; i++) {
				System.out.println(" arg " + i + ": " + v[i]);
			}
			System.out.println();
		}
	
	static void vaTest (boolean ... v) {
			
		System.out.println("vaTest (boolean ...): "+ "Number of args: "+ v.length);
		
			
			if (v.length!=0) 	
				System.out.println("contents: ");
			
			for (int i=0; i<v.length; i++) {
				System.out.println(" arg " + i + ": " + v[i]);
			}
			System.out.println();
		}
	
	static void vaTest (String msg, int ... v) {
			
		System.out.println("vaTest (String, int ...): "+msg +  "Number of args: "+ v.length);
		
			
			if (v.length!=0) 	
				System.out.println("contents: ");
			
			for (int i=0; i<v.length; i++) {
				System.out.println(" arg " + i + ": " + v[i]);
			}
			System.out.println();
		}
	
	
		
	public static void main(String args[]) {
		
		vaTest(1,2,3);
		vaTest("One vararg/Testing: " , 10, 20);
		vaTest("Five vararg: ", 1,2,3,4,5);
		vaTest("No varargs ");
		vaTest(true, false, false);
		
	}

}
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 

