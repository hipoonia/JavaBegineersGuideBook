class Queue {
	private char q[];
	private int putloc, getloc;
	
	
	Queue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	
	}
	
	void put (char ch) {
		if (putloc==q.length) {
			System.out.println("Queue is full. ---- ");
			return;
		}
		
		q[putloc++] = ch;
	}
	
	char get() {
		if (getloc==putloc) {
			System.out.println("queue is empty---- ");
			return (char) 0;
			}
		return q[getloc++];
	}
}

class QDemo {
	public static void main(String args[]) {
		
		Queue bigQ = new Queue(25);
		Queue smallQ = new Queue(4);
		
		char ch;
		int i;
		
		for (i=0; i<26; i++ ) {
			bigQ.put((char) ('A' + i));
			
		}
		
		for (i=0; i<26; i++) {
			ch = bigQ.get();
			if (ch != (char) 0) System.out.print(ch);
		}
					 
		System.out.print("\n");
					 
		
					 
		
	}

}
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 

