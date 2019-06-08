import java.io.*;

class ShowFile3 {

	public static void main (String args[]) {
	
		int i;
		
		if (args.length!=1) {
		
			System.out.println("Uasage: ShowFile File");
			return;
		}
		
		try (FileInputStream fin = new FileInputStream(args[0])) {
		// try-wht-resources block | f automatic resource management
		//the resource declared in the try statement is implicitly final
		//means that you can’t assign to the resource after it has been created
		//also, the scope of the resource is limited to the try-with-resources statement
			
			do {
			
				i = fin.read();
				if (i!=-1) System.out.print((char)i);
			//	if (i!=-1) System.out.print(i);
				
			} while (i!= -1);
			
		}
		
		catch (IOException e) {
		
			System.out.println("An I/O error occured " + e);
		}
		
	}

}