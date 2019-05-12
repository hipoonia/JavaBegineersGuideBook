package bookpackext;
import bookpack.*;


class UseBook {
	public static void main (String args[]) {
		
		Book books[] = new Book[5];
		
		books[0] = new Book ("java a begineers guide", "Schildt", 2014);
		books[1] = new Book ("java the comp reference", "Schildt", 2014);
		books[2] = new Book ("art of java", "Schildt and holmes", 2003);
		books[3] = new Book ("xyz", "some author", 2001);
		books[4] = new Book ("abc", "lekhak", 1999);
		
		for (int i=0; i<books.length; i++) 
			books[i].show();
		
	
	}	
		

}
























