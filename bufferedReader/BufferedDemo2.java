package bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedDemo2 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter a character:");
		char c=(char)br.read();
		
		System.out.println("You entered the character: "+c);
		
		/*
		System.out.println("Enter a String:");
		String s=br.readLine();
		
		System.out.println("You entered the String: "+s);
		*/
		/*
		System.out.println("Enter a number:");
		int i=Integer.parseInt(br.readLine());
		
		System.out.println("You entered the number: "+i);
		*/
		/*
		System.out.println("Enter a float value:");
		float f=Float.parseFloat(br.readLine());
		
		System.out.println("You entered the float value: "+f);
		*/
		br.close();
	}

}
