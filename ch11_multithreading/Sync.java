class SumArray {

	private int sum;
	
	synchronized int sumArray (int nums[]) {
	
		sum = 0; // reset sum
		
		for (int i=0; i<nums.length; i++) {
		
			sum += nums[i];
			System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
			
			try {
			
				Thread.sleep(10); // allow task-switch
			}
			catch (InterruptedException e) {
			
				System.out.println("thread interrupted.");
			}
		}
		return sum;
	}
}

class MyThreadClass implements Runnable {

	Thread thrd;
	static SumArray sa = new SumArray();
	
	int a[];
	int answer;
	
	//Construct a new thread.
	
	MyThreadClass(String name, int nums[]) {
	
		thrd = new Thread (this, name);
		a = nums;
		thrd.start(); // start the thread
	}
	
	// begin execution of new thread
	public void run() {
	
		int sum;
		
		System.out.println(thrd.getName() + " starting.");
		
		answer = sa.sumArray(a);
		System.out.println("Sum for " + thrd.getName() + " is " + answer);
		
		System.out.println(thrd.getName() + " terminating.");
	}
	
}


class Sync {

	public static void main (String args[]) {
	
		int a[] = {1,2,3,4,5};
		
		MyThreadClass mt1 = new MyThreadClass("Child #1", a);
		MyThreadClass mt2 = new MyThreadClass("Child #2", a);
		
		try {
		
			mt1.thrd.join();
			mt2.thrd.join();
		}
		catch (InterruptedException e) {
		
			System.out.println("Main thread interrupted.");
		}
	
	}

}




















