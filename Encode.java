class Encode {
	
	public static void main (String[] args) {
	
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		int key = 88;
		
		System.out.println("Original msg: "+ msg+"\n");
		
		for (int i=0; i<msg.length(); i++) {
			encmsg = encmsg + (char) (msg.charAt(i) ^key);
			
		}
		
		System.out.println("Encoded msg: "+ encmsg+"\n");
		
		for (int i=0; i<encmsg.length(); i++) {
			decmsg = decmsg + (char) (encmsg.charAt(i) ^(key+1) ^(key+1) ^(key));
			
		}
		
		System.out.println("Decoded msg: "+ decmsg+"\n");
		
		
	}

}

					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 

