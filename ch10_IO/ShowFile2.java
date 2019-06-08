import java.io.*;

class ShowFile2 {

	public static void main (String args[]) {
	
		int i;
		FileInputStream fin = null;
		
		if (args.length!=1) {
		
			System.out.println("Uasage: ShowFile File");
			return;
		}
		
		try {
		
			fin = new FileInputStream(args[0]);
			
			do {
			
				i = fin.read();
				if (i!=-1) System.out.print((char)i);
			//	if (i!=-1) System.out.print(i);
				
			} while (i!= -1);
			
		}
		catch (FileNotFoundException e) {
		
			System.out.println("File Not Found");
			return;
		}
		
		catch (IOException e) {
		
			System.out.println("An I/O error occured");
		}
		
		finally {
			
			try {
			
				if (fin != null) fin.close();
			} catch (IOException e) {
		
				System.out.println("Error closing File.");
			}	
		
		}
		
	}

}