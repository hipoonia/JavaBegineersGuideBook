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

class MoreThreads2 {

	public static void main (String args[]) {
	
		System.out.println("Main thread starting.");
		
		MyThread mt1 = new MyThread("Child #1");
		MyThread mt2 = new MyThread("Child #2");
		MyThread mt3 = new MyThread("Child #3");
	//	mt.run();
	//	Thread newThread = new Thread(mt);
		
	//	newThread.start();
		
		do {
		
			System.out.print(".");
			try {
			
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
			
				System.out.println("Main thread interrupted.");
			}
		} while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive());
		
		System.out.println("Main thread ending.");
	}
}






