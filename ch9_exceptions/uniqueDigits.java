class uniqueDigits {
    public static long countNumbersWithUniqueDigits(int n) {
        
        long m = (int)Math.pow(10,n);
        long res = 0;
        
        for (int d=0; d<m; d++) {
            
            int i = d;
			
            int[] count = new int[10];
            
            while (i>0) {
                int pos = i%10;
                count[pos] = count[pos] + 1;
        //        if (count[pos]>1) break;
                
                i = i/10;
            }
            
            int j=0;
            
            for (j=0; j<10; j++) {
                
                if (count[j] > 1) break;
       //         System.out.print(count[j]+" ");
                
            }
       //     System.out.println();
            if (j==10) {
			System.out.println(d);
				res++;
			}
            
        }
        
        return res;
    }
	
	
	public static void main (String args[]) {
		
		System.out.println(countNumbersWithUniqueDigits(10));
		
	}
}