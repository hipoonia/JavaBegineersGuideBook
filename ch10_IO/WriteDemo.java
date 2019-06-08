class WriteDemo {

	public static void main(String args[]) {
	
		int c = 'C';
		System.out.write(c); // op: C
		System.out.println();
		int b;

		/* The two methods of PrintStream have different meanings:

		print(int) writes a decimal representation of the entire int, while
		write(int) writes the least significant byte of the specified int to the output.
This leads to different results: if you call print(48), the output is going to be 48, 
but if you call write(48), the output would be system-dependent, but on most systems it would be 0.

*/		
		
		System.out.write(48); // op : 0
		System.out.println();
		b = 'X';
		System.out.println(b);  // op: 88
		System.out.println();
		System.out.write(b);  
		System.out.println();// op: X
		System.out.write('\n');
		
		System.out.write(c); // no op!!
		System.out.write(b);
		
		
		String str = "random string";
		
//		System.out.write(str);
//		error :  write(String) has private access in PrintStream

		char a = 'A';
		System.out.write(a);
		System.out.write(a);
		System.out.write(a);
		// no output!
		
		byte z = 12;
		System.out.write(z);
		// no output! ?
		
		int asd = 1234567;
		System.out.write(asd);
		// no op!
		
		asd = 1;
		System.out.write(asd);
		// no op
		
		asd = 'A';
		System.out.write(asd);

	}
}