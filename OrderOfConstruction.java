class a {
	a() {
	
		System.out.println("Constructing A.");
	}
}

class b extends a {
	b() {
		System.out.println("Constructing B.");
	}
}

class c extends b {
	c() {
		System.out.println("Constructing C.");
	}
	
}




class OrderOfConstruction {
	public static void main (String args[]) {
		
		c cOb = new c();
		
	}	
		

}























