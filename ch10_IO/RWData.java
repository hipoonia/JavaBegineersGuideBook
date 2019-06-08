import java.io.*;

class RWData {

	public static void main (String args[]) 
	{
	
		int i=10;
		double d = 1023.456;
		boolean b = true;
		
		try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata2")))
		{
		
			System.out.println("Writing " + i);
			dataOut.writeInt(i);
			
			System.out.println("Writing " + d);
			dataOut.writeDouble(d);
			
			System.out.println("Writing " + b);
			dataOut.writeBoolean(b);
			
			System.out.println("Writing " + 12.2*7.4);
			dataOut.writeDouble(12.2*7.4);
		}
		catch (IOException e) {
		
			System.out.println("Writing error ");
			return;
		}
		
		System.out.println();
		
		//Now, read them back.
		
		try (DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata2")))
		{
		
			i = dataIn.readInt();
			System.out.println("Reading " + i);
			
			d = dataIn.readDouble();
			System.out.println("Reading " + d);
			
			b = dataIn.readBoolean();
			System.out.println("Reading " + b);
			
			d = dataIn.readDouble();
			System.out.println("Reading " + d);
			
		}	
		catch (IOException e) {
		
			System.out.println("Read Error. ");
		}
	}
}