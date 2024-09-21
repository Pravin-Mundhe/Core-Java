package socketProgram;

import java.io.*;
import java.net.*;

public class Server21 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Server started");
		
		ServerSocket ss=new ServerSocket(9990);
		
		System.out.println("Server is listening");		
		System.out.println("Server is waiting for the client request");		
		
		Socket s1= ss.accept();  
		
		System.out.println("Client is connected");		
		
		String str1="",str2="";	
		
		DataInputStream in=new DataInputStream(s1.getInputStream());
		DataOutputStream out=new DataOutputStream(s1.getOutputStream());
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		
		while(!str1.equals("bye"))
		{
			str1=in.readUTF();	//for receiving from client
			System.out.println("Client: "+str1);  			
			
			str2=br.readLine();  
			out.writeUTF(str2);  //for sending to client					
		}
		
		in.close();
		out.close();
		s1.close();
		ss.close();		
	
		System.out.println("Client closed");
		System.out.println("Server closed");
	}

}
