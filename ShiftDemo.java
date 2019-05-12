class ShiftDemo {
	
	public static void main (String[] args) {
		
		int val = -1;
		
		for (int i=0; i<8; i++) {
			for (int t=128; t>0; t /=2) {
				if ((val&t) != 0) System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();
			val = val<<1; //left shift
		}
		val = val>>1;
		System.out.println();
		
		
		for (int i=0; i<8; i++) {
			for (int t=128; t>0; t /=2) {
				if ((val&t) != 0) System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();
			val = val >> 1; // right shift
		}
		
		System.out.println(val);
		
	}

}

					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 

