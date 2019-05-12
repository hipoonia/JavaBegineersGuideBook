import MyIF.*;

class MyIFImp implements MyIF {

	public int getUserID() {
	
		return 100;
	}
}

class MyIFImp2 implements MyIF {

	public int getUserID() {
		return 1234;
	}
	public int getAdminID() {
		return 12345;
	}
}


class DefaultMethodDemo {

	public static void main (String args[]) {
	
		MyIFImp obj = new MyIFImp();
		
		System.out.println("usr ID is: " + obj.getUserID()	);
						   
		System.out.println("Admin ID is: " + obj.getAdminID()	);
		
		MyIFImp2 obj1 = new MyIFImp2();
		
		System.out.println("usr ID is: " + obj1.getUserID()	);
						   
		System.out.println("Admin ID is: " + obj1.getAdminID()	);
	}					   
}