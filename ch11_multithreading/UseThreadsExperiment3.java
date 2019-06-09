class MyThread implements Runnable {
	
	
	public void run() {
	
		System.out.println(threadName + " starting." );
		
		try {
		
			for (int count=0; count<10; count++) {
			
				Thread.sleep(400);
				System.out.println("In " + this.getName() + ", count is " + count);
			}
		}
		catch (InterruptedException e) {
		
			System.out.println(threadName + " inetrrupted." );
		}
		System.out.println(threadName + " terminating.");
	}
}

class UseThreadsExperiment3 {

	public static void main (String args[]) {
	
		System.out.println("Main thread starting.");
		
		MyThread mt = new MyThread();
	
		Thread newThread = new Thread(mt, child1);
		
		newThread.start();
		
		for(int i=0; i<5;i++) {
			
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






