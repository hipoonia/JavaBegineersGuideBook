class X {

	int a;
	X(int i) { a=i;}
}

class Y  {
	
	int a;
	Y(int i) { a=i;}
}

class Z extends X {
	int b;
	
	Z(int i, int j) {
		super(j);
		b = i;
	}
}



class SupSubRef {
	public static void main (String args[]) {
		
		X x = new X(10);
		X x2;
		Y y = new Y(5);
		
		x2 = x;
		
//		x2 = y;
	//incompatible types: Y cannot be converted to X
		
		Z z = new Z (5,6);
		x2 = z; // still ok because Y is derived from X
		
		System.out.println("x2.a: " + x2.a);
		
		x2.a = 19; //ok
//		x2.b = 27; // Error, X doesnt have a b member
		
	
	}	
		

}























