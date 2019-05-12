class A {

	int i;
}

class B extends A {
	
	int i; // this i hides i in A
	
	B (int a, int b) {
		i = b; // i in B
		super.i = a; //i in A
	}
	
	void show() {
		
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}
		
}



class UseSuper {
	public static void main (String args[]) {
		
		B subOb = new B(1,2);
		
		subOb.show();
		
		
		
		
	}	
		

}























