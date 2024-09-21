package socketProgram;

import java.io.*;
import java.net.*;


public class Client11A 
{
	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		String ip="localhost";	
		int port=9990;	
		
		System.out.println("Client started");
		Socket s1=new Socket(ip,port);	
		
		String str1="";			
		
		DataOutputStream out=new DataOutputStream(s1.getOutputStream());
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		
		while(!str1.equals("stop"))
		{
			str1=br.readLine();  
			out.writeUTF(str1);  //for sending to server			 			
		}		
		
		out.close();
		s1.close();
	}
}
