import java.io.*;

class RandomAccessDemo {

	public static void main (String args[]) {
	
		double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
		double d;
		
		try (RandomAccessFile raf = new RandomAccessFile("random2.dat", "rw"))
		{
		
			for (int i=0; i<data.length; i++) {
				raf.writeDouble(data[i]);
			}
			
			raf.seek(0);
			d = raf.readDouble();
			System.out.println("First value is " + d);
			
			raf.seek(8);
			d = raf.readDouble();
			System.out.println("Second value is " + d);
			
			raf.seek(8*3);
			d = raf.readDouble();
			System.out.println("4th value is " + d);
			
			System.out.println();
			
			System.out.println("Here is every other value: ");
			
			for (int i=0; i<data.length; i+=2) {
			
				raf.seek(i*8);
				d = raf.readDouble();
				System.out.print(d+ " ");
			}
		}
		catch (IOException e) {
		
			System.out.println("I/O Exception: " + e);
		}
	}
}