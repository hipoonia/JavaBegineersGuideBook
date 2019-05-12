package bookpackext;

class ExtBook extends bookpack.Book {

	private String publisher;
	
	public ExtBook (String t, String a, int d, String p) {
	
		super (t,a,d);
		publisher = p;
	}
	
	public void show() {
		super.show();
		System.out.println(publisher);
		System.out.println();
	}
	
	public String getPublisher() {return publisher;}
	public void setPublisher (String p) {publisher = p;}
	
	public String getAuthor() {return author;}
	public void setAuthor (String t) {author = t;}
	
	public String getTitle() {return title;}
	public void setTitle (String t) {title = t;}
	
	public int getPubDate() {return pubDate;}
	public void setPubDate (int d) {pubDate = d;}
}


class ProtectDemo {
	public static void main (String args[]) {
		
		ExtBook books[] = new ExtBook[5];
		
		books[0] = new ExtBook ("java a begineers guide", "Schildt", 2014, "McGrawHill");
		books[1] = new ExtBook ("java the comp reference", "Schildt", 2014,"McGrawHill");
		books[2] = new ExtBook ("art of java", "Schildt and holmes", 2003,"McGrawHill");
		books[3] = new ExtBook ("xyz", "some author", 2001,"McGrawHill");
		books[4] = new ExtBook ("abc", "lekhak", 1999,"McGrawHill");
		
		for (int i=0; i<books.length; i++) 
			books[i].show();
		
		
		System.out.println("showing all books by schildt.");
		
		for (int i=0; i<books.length; i++) {
			if (books[i].getAuthor() == "Schildt")
				System.out.println(books[i].getTitle());
		}
		
//		books[0].title = "test title";
//bookpackext/ProtectDemo.java:55: error: title has protected access in Book
	// Access to protected field not allowd by non subclass.
	}	
		

}
























