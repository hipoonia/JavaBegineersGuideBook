class MyThread implements Runnable {

	Thread thrd;
	
	MyThread(String name) {
	
		thrd = new Thread(this, name);
		thrd.start();
	}
	
	public void run() {
	
		System.out.println(thrd.getName() + " starting." );
		
		try {
		
			for (int count=0; count<10; count++) {
			
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + ", count is " + count);
			}
		}
		catch (InterruptedException e) {
		
			System.out.println(thrd.getName() + " inetrrupted." );
		}
		System.out.println(thrd.getName() + " terminating.");
	}
}

class JoinThreads {

	public static void main (String args[]) {
	
		System.out.println("Main thread starting.");
		
		MyThread mt1 = new MyThread("Child #1");
		MyThread mt2 = new MyThread("Child #2");
		MyThread mt3 = new MyThread("Child #3");
	//	mt.run();
	//	Thread newThread = new Thread(mt);
		
	//	newThread.start();
		
		try {
			
			System.out.println("INTO MAIN TRY");
		
			mt1.thrd.join();
			System.out.println("Child #1 joined.");
			
			mt2.thrd.join();
			System.out.println("Child #2 joined.");
			
			mt3.thrd.join();
			System.out.println("Child #3 joined.");
			
		}
		catch (InterruptedException e) {
		
			System.out.println("Main Thread inperrupted.");
		}
		
		
		System.out.println("Main thread ending.");
	}
}






