package socketProgram;

import java.io.*;
import java.net.*;


public class Client21 
{
	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		String ip="localhost";	
		int port=9990;	
		
		System.out.println("Client started");
		Socket s1=new Socket(ip,port);	
		
		String str1="",str2="";	
		
		DataInputStream in=new DataInputStream(s1.getInputStream());
		DataOutputStream out=new DataOutputStream(s1.getOutputStream());
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		
		while(!str1.equals("bye"))
		{
			str1=br.readLine();  
			out.writeUTF(str1);  //for sending to server
			
			str2=in.readUTF();	//for receiving from server
			System.out.println("Server: "+str2);  			
		}
		
		in.close();
		out.close();
		s1.close();
	}
}
