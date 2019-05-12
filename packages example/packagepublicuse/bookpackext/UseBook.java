package bookpackext;

class UseBook {
	public static void main (String args[]) {
		
		bookpack.Book books[] = new bookpack.Book[5];
		
		books[0] = new bookpack.Book ("java a begineers guide", "Schildt", 2014);
		books[1] = new bookpack.Book ("java the comp reference", "Schildt", 2014);
		books[2] = new bookpack.Book ("art of java", "Schildt and holmes", 2003);
		books[3] = new bookpack.Book ("xyz", "some author", 2001);
		books[4] = new bookpack.Book ("abc", "lekhak", 1999);
		
		for (int i=0; i<books.length; i++) 
			books[i].show();
		
	
	}	
		

}
























