// Creating exception subclasses

// Throwable super class -> Exception sub class

class NonIntResultException extends Exception {

	int n;
	int d;
	
	NonIntResultException (int i, int j) {
	
		n = i;
		d = j;
	}
	
	public String toString() {
	
		return "Result of " + n + " / " + d + " is non-integer.";
	}

}


class CustomExceptDemo {

	public static void main (String args[]) {
	
		int num[] = {4,16,15,32, 64, 127,256, 512};
		int den[] = {2,0,4,4,0,8};
		
		for (int i=0; i<num.length; i++) {
		
			try {
			
				if (num[i]%2!=0)
					throw new NonIntResultException(num[i],den[i]);
				
				System.out.println(num[i]+"/"+den[i]+" is "+num[i]/den[i]);
			}
			
			catch (ArithmeticException e) {
			
				System.out.println("cant divinde by zero");
			}
			
			catch (ArrayIndexOutOfBoundsException e) {
			
				System.out.println("arrAy out of bounds");
			}
			catch (NonIntResultException e) {
			
				System.out.println(e);
			}
		}
	}

}








