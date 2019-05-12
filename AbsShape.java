abstract class TwoDShape {
		
	private double width;
	private double height;
	
	private String name;
	
	TwoDShape() {
		width = height = 0;
		name = "none";
	}
	
	TwoDShape (double w,double h, String n) {
		width = w;
		height = h;
		name = n;
	}
	
	TwoDShape (double x, String n) {
		width = height = x;
		name = n;
	}
	
	TwoDShape (TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	
	double getWidth() {return width;}
	double getHeight() {return height;}
	void setWidth(double w) {width = w;}
	void setHeight(double h) {height = h;}
	
	String getName() {return name;}
	
	void showDim() {
		System.out.println("Width and height are " + width+ " and " + height);
	}
	
	abstract double area()  ;
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
		
		super (w,h, "triangle");
		
		style = s;
	}
	
	Triangle (double x) {
		super (x, "triangle");
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

/*
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
} */

class Rectangle extends TwoDShape {
	
	Rectangle() {
		super();
	}
	
	Rectangle (double w, double h) {
		super (w,h, "rectangle");
	}
	
	Rectangle (double x) {
		super (x, "rectangle");
	}
	
	Rectangle (Rectangle ob) {
		super(ob);
	}
	
	boolean isSquare() {
		if (getWidth()==getHeight()) return true;
		else return false;
	}
	
	double area() {
		return getHeight()*getWidth();
	}

}

class AbsShape {
	
	public static void main (String args[]) {
		
		TwoDShape shapes[] = new TwoDShape[5];
		
		shapes[0] = new Triangle("outlined", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10,4);
		shapes[3] = new Triangle(7.0);
//		shapes[4] = new TwoDShape(10,20,"generic");
		
		for (int i=0; i<shapes.length-1; i++) {
			System.out.println("object is "+ shapes[i].getName());
			System.out.println("Area is " + shapes[i].area());
			System.out.println();
		}
	
	}

}
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 

