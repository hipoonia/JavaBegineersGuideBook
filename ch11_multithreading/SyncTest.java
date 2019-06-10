// why arnt threads working one by one!

class Tester implements Runnable {
	
	synchronized public void run() {
	
		for(int i=0; i<20; i++) {
	
			System.out.println(i + " " + Thread.currentThread().getName());
			
			try {
			
				Thread.sleep(50);
			}
			catch (InterruptedException e) {
			
				System.out.println("thread interrupted.");
			}
			
		}
	}
}


class SyncTest {

	public static void main (String args[]) {
	
		Tester t1 = new Tester();
		Tester t2 = new Tester();
		
		Thread thrd1 = new Thread(t1);
		Thread thrd2 = new Thread(t2);
		
		
		thrd1.start();
		thrd2.start();
		
		
	}
}
							  