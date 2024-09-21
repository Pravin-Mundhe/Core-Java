package socketProgram;

import java.io.*;
import java.net.*;

public class Server51 
{
	public static void main(String[] args) throws IOException 
	{		
		ServerSocket servsock = new ServerSocket(12345);
		System.out.println("Server Waiting for connection");
	    File myFile = new File("E:\\Java_Pravin\\Core_Java\\SampleOut.txt");
	    while (true) 
	    {
	      Socket sock = servsock.accept();
	      byte[] mybytearray = new byte[(int) myFile.length()];
	      BufferedInputStream bis = new BufferedInputStream(new FileInputStream(myFile));
	      bis.read(mybytearray, 0, mybytearray.length);
	      OutputStream os = sock.getOutputStream();
	      os.write(mybytearray, 0, mybytearray.length);
	      os.flush();
	      sock.close();
		 System.out.println("File sent succesfully!");
	    }
	
	    }
}
