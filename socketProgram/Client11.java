package socketProgram;

import java.io.*;
import java.net.*;

public class Client11 
{
	public static void main(String[] args) throws IOException //port no. may throw an exception
	{
		String ip="localhost";	// since server is local computer
		int port=9990;	//0-1023: Reserved ports, 1024-65535
		
		System.out.println("Client started");
		Socket s1=new Socket(ip,port);	// to create socket at server side
		
		String str="Hello";	//message to be transmitted
		
		//to convert string in to stream and send it to server: DataOutputStream
		//to write stream to output port of socket: getOutputStream
		
		DataOutputStream out=new DataOutputStream(s1.getOutputStream());
		out.writeUTF(str);	//to send data to server
		
		out.close();		
		s1.close();		
	}
}
