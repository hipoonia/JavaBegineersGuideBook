public interface Series {

	int getNext();
	void reset();
	void setStart(int x);
	
	default int[] getNextArray(int n) {
	
		int[] vals = new int[n];
		
		for (int i=0; i<n; i++) vals[i] = getNext();
		return vals;
	}
	
}
























