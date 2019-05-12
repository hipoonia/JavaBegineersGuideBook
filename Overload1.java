class AA {

	int i, j;
	AA(int a, int b) { 
	
		i = a;
		j = b;
	}
	
	void show() {
		System.out.println("i and j: " + i + " "+ j);
	}
}

class BB extends AA {
	int k;
	
	
	BB(int a, int b, int c) {
		super(a,b);
		k = c;
	}
	
/*	void show() {
		super.show(); // this calls AA's show()
		System.out.println("k ;" + k);
	}
	*/
	
	void show(String msg) {
		System.out.println(msg + k);
	}
}



class Overload1 {
	public static void main (String args[]) {
		
		BB subOb = new BB(1,2,3);
		
		subOb.show();
		subOb.show("this is k: ");
		
	
	}	
		

}























