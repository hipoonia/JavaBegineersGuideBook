class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
	
	Vehicle (int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	int range() {
//		System.out.print("Range is :"+ fuelcap*mpg);
		return fuelcap*mpg; 
	
	}
	
	double fuelneeded (int miles) {
		return (double) miles/mpg;
	}
 
}

class VehicleDemo {
	public static void main (String args[]) {
		
		Vehicle minivan = new Vehicle(10,7,20);
		Vehicle swift;
		swift = new Vehicle(10,5,20);
		int dist = 100;
		
//		minivan.fuelcap = 10;
//		minivan.passengers = 7;
//		minivan.mpg = 20;
		
//		swift.fuelcap = 11;
//		swift.passengers = 5;
//		swift.mpg = 15;
		
			
		int range = minivan.range();;
		int range2 = swift.range();;
		
//		range = minivan.fuelcap * minivan.mpg;
//		range2 = swift.fuelcap * swift.mpg;
		
		System.out.println("Minivan can carry "+ minivan.passengers+ " with a range of "+ range+ " miles");
		
		System.out.println("Swift can carry "+ swift.passengers+ " with a range of "+ range2);
		
		System.out.println("minivan requires" + minivan.fuelneeded(dist)+"gallons of fuel to travel" + dist+" miles");


	}

}