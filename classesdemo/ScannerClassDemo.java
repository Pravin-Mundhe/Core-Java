package pravin.classesdemo;

import java.util.Scanner;

public class ScannerClassDemo 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);  
        System.out.print("Enter a value: ");  
        int var = obj.nextInt();  
        System.out.println("Input is: " + var);             
        obj.close();             

	}

}
