class Phone {
	
	public static void main (String[] args) {
		
		String numbers[][] = {
			{"Sanju", "1426"},
			{"Pradeep", "3268"},
			{"home", "295" }
		};
			
			int i=0;
		
		if (args.length != 1) 
			System.out.println("Usage: java Phone <name>");
		else
			for (i=0; i<numbers.length; i++) {
				if (numbers[i][0].equals(args[0])) {
					System.out.println(numbers[i][0]+": "+numbers[i][1]);
					break;
					}
				
			
			}
			
		if (i == numbers.length) {
			System.out.println("Name not found.");
		}
	
	}

}

					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 

