class TwoDShape {
		
	private double width;
	private double height;
	
	TwoDShape() {
		width = height = 0;
	}
	
	TwoDShape (double w,double h) {
		width = w;
		height = h;
	}
	
	TwoDShape (double x) {
		width = height = x;
	}
	
	TwoDShape (TwoDShape ob) {
		width = ob.width;
		height = ob.height;
	}
	
	double getWidth() {return width;}
	double getHeight() {return height;}
	void setWidth(double w) {width = w;}
	void setHeight(double h) {height = h;}
	
	void showDim() {
		System.out.println("Width and height are " + width+ " and " + height);
	}
}

class Triangle extends TwoDShape {
	private String style;
	
	Triangle () {
		super ();
		style = "none";
	}
	
	Triangle (String s, double w, double h) {
	//	setWidth(w);
	//	setHeight(h);
		
		super (w,h);
		
		style = s;
	}
	
	Triangle (double x) {
		super (x);
		style = "filled";
	}
	
	Triangle (Triangle ob) {
		super (ob); // pass object to TwoDshape constructor;
		style = ob.style;
	}
	
	double area() {
		return getWidth() * getHeight()/2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}

}

class ColorTriangle extends Triangle {
	private String color;
	
	ColorTriangle (String c, String s, double w, double h) {
		super (s,w,h);
		color = c;
	}
	
	String getColor() { return color; }
	
	void showColor() {
		System.out.println( "Color is " + color);
	}
}

class Rectangle extends TwoDShape {
	
	Rectangle (double w, double h) {
		super (w,h);
	}
	
	boolean isSquare() {
		if (getWidth()==getHeight()) return true;
		else return false;
	}
	
	double area() {
		return getHeight()*getWidth();
	}

}

class Shapes7 {
	
	public static void main (String args[]) {
		
		ColorTriangle t1 = new ColorTriangle ("Blue" , "outlined", 8.0, 12.0);
		ColorTriangle t2 = new ColorTriangle ("Red" , "filled", 2.0, 2.0);

		//	Triangle t1 = new Triangle("filled", 4.0, 4.0);
//		Triangle t1 = new Triangle();
//		Triangle t2 = new Triangle("outlined", 8.0, 12.0);
		Triangle t3 = new Triangle(4.0);
		Rectangle r1 = new Rectangle(10.0,10.1);
		
		t1 = t2;
		
	//	r1.setWidth(10.000);
	//	r1.setHeight(10.001);
		
		if (!r1.isSquare()) System.out.println(r1.area());
		System.out.println();
		
//		t1.setWidth(4.0);
//		t1.setHeight(4.0);
//		t1.style = "filled";
		
//		t2.setWidth(8.0);
//		t2.setHeight(12.0);
//		t2.style = "out lined";
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("area is " + t2.area());
		
		System.out.println();
		
		System.out.println("Info for t3: ");
		t3.showStyle();
		t3.showDim();
		System.out.println("area is " + t3.area());
		
		
		Triangle tt1 = new Triangle ("outlined" , 8.0, 12.0);
		
		Triangle tt2 = new Triangle (tt1);
		
		System.out.println();
		
		System.out.println("Info for tt1: ");
		tt1.showStyle();
		tt1.showDim();
		System.out.println("area is " + tt1.area());
		
		System.out.println();
		
		System.out.println("Info for tt2: ");
		tt2.showStyle();
		tt2.showDim();
		System.out.println("area is " + tt2.area());
	
	}

}
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 

