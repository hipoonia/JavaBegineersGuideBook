class Bubble {

	public static void main(String args[]) 	
			throws java.io.IOException			{
		
//		int[] nums = {99, -10, 100123, 18, -978, 324, 23234, -9, 287, 49, 0};
		
		int[] nums = new int[10];
		char ignore;
		int count = 0;
		
		do {
			
			nums[count] = System.in.read();
			count++;
			
			do {
				ignore = (char) System.in.read();
				
			} while(ignore!='\n');
		
		} 
			while(count<10);
		
		int size = nums.length;
		
		for (int i=0; i<size; i++) {
			
			int x = i;
			
			for (int j=i; j<size; j++) {
				
				if (nums[j] < nums[x] ) {
					int temp = nums[x];
					nums[x] = nums[j];
					nums[j] = temp;
				}
			
			}
		
		}
		for (int i: nums) {
		System.out.print(i+" ");
		}
 	
	}

}