package scannerdemo;

import java.util.Scanner;

public class ScannerClassDemo 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);  
        System.out.print("Enter an integer value: ");        
        int vi = obj.nextInt();
        System.out.print("Enter a float value: ");        
        float vf = obj.nextFloat();
        System.out.print("Enter a long value: ");        
        long vl = obj.nextLong();
        System.out.print("Enter a string value: ");        
        String vs = obj.next();
        
        System.out.println("\nYou entered following values");
        System.out.println("Integer value is: " + vi);   
        System.out.println("Float value is: " + vf);   
        System.out.println("Long value is: " + vl);   
        System.out.println("String value is: " + vs);
        System.out.println("First character in String is: " + vs.charAt(0));
        
        Integer v1=vi;
        System.out.println("Integer value in String format is: " + v1.toString());      
        
        obj.close();  
               
        Scanner obj1 = new Scanner("India is my country");         
        while (obj1.hasNext()) //it uses delimiter. Here, it is space character
        {  
            System.out.println(obj1.next());  
        }  
       
        obj1.close(); 
	}

}
