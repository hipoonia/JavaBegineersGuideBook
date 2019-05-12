class MyClass {
	
	private int alpha; 
	public int beta;
	int gamma;
	
	void setAlpha (int a) {
		alpha = a;
	}
	
	int getAlpha() {
		return alpha;
	}
	
}

class AccessDemo {
	
	public static void main (String[] args) {
		
		MyClass ob = new MyClass();
		
		ob.setAlpha(93);
		//ob.alpha = 93; // will give error : AccessDemo.java:24: error: alpha has private access in MyClass
		

		System.out.println("ob.alpha is "+ ob.getAlpha());
		
		ob.beta =92;
		ob.gamma = 102;
		
	}

}

					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 

