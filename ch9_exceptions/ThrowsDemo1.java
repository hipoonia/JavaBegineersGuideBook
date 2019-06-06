class ThrowsDemo1 {

	public static char prompt (String str) 
		throws java.io.IOException {
		
		System.out.println(str + ":  ");
		return (char) System.in.read();
	}
	
	public static void main (String args[]) {
	
	
		char ch;
		
		try {
		
			ch = prompt("Enter a letter");
		}
		catch (java.io.IOException e) {
		
			System.out.println("IO exception occured.");
			ch = 'X';
		}
		
		System.out.println("you pressed: " + ch );
	}
	
}