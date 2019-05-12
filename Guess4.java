class Guess4 {
	public static void main (String args[]) 
	throws java.io.IOException {
		
		char ch, ignore, answer = 'k';
		
		System.out.print("I am thinking a letter between a and z. Guess it ");
		
		do {
			
			ch = (char) System.in.read();
			
			do {
				ignore = (char) System.in.read();
				
			} while(ignore!='\n');
			
			if (ch==answer) System.out.println("***RIGHT***");
			
			else {
				
				System.out.print("..Sorry, you are");
				if (ch<answer) System.out.println("too low");
				else System.out.println("too high");
				System.out.println("Try again\n");
				
			}
											   
		} while (answer != ch);
		
	
	}

}