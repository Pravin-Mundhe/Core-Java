package socketProgram;

import java.io.*;
import java.net.*;

public class Client51 
{
	public static void main(String[] args) throws IOException //port no. may throw an exception
	{
		 Socket sock = new Socket("localhost", 12345);
		 byte[] mybytearray = new byte[1024];
		 InputStream is = sock.getInputStream();
		 FileOutputStream fos = new FileOutputStream("E:\\Java_Pravin\\Core_Java\\SampleIn.txt");
		 BufferedOutputStream bos = new BufferedOutputStream(fos);
		 int bytesRead = is.read(mybytearray, 0, mybytearray.length);
		 bos.write(mybytearray, 0, bytesRead);
		 bos.close();
		 sock.close();
		 System.out.println("File saved successfully!");	
	}
}
