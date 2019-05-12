class VarArgs2 {
		
	static void vaTest (String msg, int ... v) {
			
		System.out.println(msg + v.length);
		
			
			if (v.length!=0) 	
				System.out.println("contents: ");
			
			for (int i=0; i<v.length; i++) {
				System.out.println(" arg " + i + ": " + v[i]);
			}
			System.out.println();
		}
		
	public static void main(String args[]) {
		
		
		vaTest("One vararg: " , 10);
		vaTest("Five vararg: ", 1,2,3,4,5);
		vaTest("No varargs ");
		
	}

}
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 

