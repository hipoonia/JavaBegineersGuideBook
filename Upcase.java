class Upcase {
	
	public static void main (String[] args) {
	
		char ch;
		
		for (int i=0; i<10; i++) {
			ch = (char) ('a' + i);
			System.out.print(ch);
			
			ch = (char) ((int) ch & 65503);
			// or do this: 
//			ch = (char) ((int) ch ^ 32);
			System.out.print(ch+" ");
		}
		
		System.out.println();
		
		for (int i=10; i<20; i++) {
			ch = (char) ('a' + i);
			System.out.print(ch);
			
//			ch = (char) ((int) ch & 65503);
//			 or do this: 
			ch = (char) ((int) ch ^ 32);
			System.out.print(ch+" ");
		}
		System.out.println();
		
		for (int i=0; i<10; i++) {
			ch = (char) ('A' + i);
			System.out.print(ch);
			
			ch = (char) ((int) ch | 32);
			
			System.out.print(ch+" ");
		}
		
		
	}

}

					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 

