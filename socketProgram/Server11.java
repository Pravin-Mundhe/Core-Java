package socketProgram;

import java.io.*;
import java.net.*;

public class Server11 
{
	public static void main(String[] args) throws IOException 
	{
		
		System.out.println("Server started");
		
		ServerSocket ss=new ServerSocket(9990);
		
		System.out.println("Server is listening");		
		System.out.println("Server is waiting for the client request");
		
		//to create connection with client, create object of socket 
		//use accept() of ServerSocket to connect with client, to establish connection
		Socket s1= ss.accept(); //accept() returns an instance of Socket class 
		
		System.out.println("Client is connected");
		
		//to fetch data from user, use BufferedReader class
		DataInputStream din=new DataInputStream(s1.getInputStream());
		String str=din.readUTF();
		
		System.out.println("Client data is: "+ str);
		
		ss.close();
		s1.close();
		din.close();
		System.out.println("Client closed");
		System.out.println("Server closed");		
	}
}
