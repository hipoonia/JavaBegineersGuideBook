package bookpack;

class Book {
	
	private String title;
	private String author;
	private int pubDate;
	
	Book (String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}
	
	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}



class BookDemo {
	public static void main (String args[]) {
		
		Book books[] = new Book[5];
		
		books[0] = new Book ("java a begineers guide", "Schildt", 2014);
		books[1] = new Book ("java the comp reference", "Schildt", 2014);
		books[2] = new Book ("art of java", "Schildt and holmes", 2003);
		books[3] = new Book ("xyz", "some author", 2001);
		books[4] = new Book ("abc", "lekhak", 1999);
		
	
	}	
		

}























