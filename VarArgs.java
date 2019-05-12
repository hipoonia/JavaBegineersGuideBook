class VarArgs {
		
	void vaTest (int ... v) {
		
			System.out.println("NUmber of args: "+ v.length);
			if (v.length!=0) 	
				System.out.println("contents: ");
			
			for (int i=0; i<v.length; i++) {
				System.out.println(" arg " + i + ": " + v[i]);
			}
			System.out.println();
		}
		
	public static void main(String args[]) {
		
		VarArgs v = new VarArgs();
		
		v.vaTest(10);
		v.vaTest(1,2,3,4,5);
		v.vaTest();
		
	}

}
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 

