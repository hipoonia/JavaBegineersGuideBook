class StaticDemo {
	
	int x;
	static int y;
	
	int sum() {
		return x+y;
	}
	
}



class SDemo {
	public static void main (String args[]) {
		
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();
		
		ob1.x = 10;
		ob2.x = 20;
		
		StaticDemo.y = 1;
		
		System.out.println(ob1.sum());
		System.out.println(ob2.sum());
		
		ob2.y = 200;
		ob1.y = 3;
		
		System.out.println(ob1.sum());
		System.out.println(ob2.sum());
		
		
		
	}	
		

}























