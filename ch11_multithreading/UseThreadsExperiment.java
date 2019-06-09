class MyThread implements Runnable {

	String threadName;
	
	MyThread(String str) {
	
		threadName = str;
	}
	
	public void run() {
	
		System.out.println(threadName + " starting." );
		
		try {
		
			for (int count=0; count<10; count++) {
			
				Thread.sleep(400);
				System.out.println("In " + threadName + ", count is " + count);
			}
		}
		catch (InterruptedException e) {
		
			System.out.println(threadName + " inetrrupted." );
		}
		System.out.println(threadName + " terminating.");
	}
}

class UseThreadsExperiment {

	public static void main (String args[]) {
	
		System.out.println("Main thread starting.");
		
		MyThread mt = new MyThread("Child #1");
	//	mt.run();
	//	Thread newThread = new Thread(mt);
		
	//	newThread.start();
		
		for(int i=0; i<5;i++) {
			
			Thread newThread = new Thread(mt);
			newThread.start();
			
			System.out.print(".");
			try {
				
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
			
				System.out.println("Main thread interrupted.");
			}
		}
		
		System.out.println("Main thread ending.");
	}
}






