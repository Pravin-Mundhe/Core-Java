package socketProgram;

import java.io.*;
import java.net.*;

public class Sever01 
{
	public static void main(String[] args) throws IOException 
	{
		//for one client, one ServerSocket, for multiple clients, multiple ServerSockets
		System.out.println("Server started");		
		
		ServerSocket ss=new ServerSocket(8000);
		
		System.out.println("Server is listening");		
		System.out.println("Server is waiting for the client request");
		//to create connection with client, create object of socket 
		//use accept() of ServerSocket to connect with client
				
		Socket s01= ss.accept();
		
		System.out.println("Connected with client. Connection is established");
		
		ss.close();	// to close the connection
		System.out.println("Connection terminated");	
	}
}
