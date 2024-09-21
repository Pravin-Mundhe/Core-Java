package socketProgram;

import java.io.*;
import java.net.*;

public class Client01 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Client started");		
		Socket s=new Socket("localhost",8000);		
		//localhost: current computer, 8000: port number 
		s.close();
	}
}
