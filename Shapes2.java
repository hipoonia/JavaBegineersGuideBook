class TwoDShape {
		
	private double width;
	private double height;
	
	double getWidth() {return width;}
	double getHeight() {return height;}
	void setWidth(double w) {width = w;}
	void setHeight(double h) {height = h;}
	
	void showDim() {
		System.out.println("Width and height are " + width+ " and " + height);
	}
}

class Triangle extends TwoDShape {
	String style;
	
	double area() {
		return getWidth() * getHeight()/2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}

}

class Rectangle extends TwoDShape {
	
	boolean isSquare() {
		if (getWidth()==getHeight()) return true;
		else return false;
	}
	
	double area() {
		return getHeight()*getWidth();
	}

}

class Shapes2 {
	
	public static void main (String args[]) {
	
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Rectangle r1 = new Rectangle();
		
		r1.setWidth(10.000);
		r1.setHeight(10.001);
		
		if (!r1.isSquare()) System.out.println(r1.area());
		System.out.println();
		
		t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style = "filled";
		
		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style = "out lined";
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("area is " + t2.area());
	
	}

}
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 

