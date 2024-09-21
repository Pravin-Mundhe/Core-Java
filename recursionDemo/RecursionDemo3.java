package recursionDemo;

import java.util.Scanner;

public class RecursionDemo3 
{
	int factorial(int n)	//recursive method
	{   		
		if (n == 1)    //termination condition  
          return 1;      
        else        	    
          return(n * factorial(n-1));  //recursive call   
        
	}      
	public static void main(String[] args) 
	{		
		RecursionDemo3 obj=new RecursionDemo3();
		
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=obj1.nextInt();
		
		int result=obj.factorial(n);
		
		System.out.println("The factorial of "+n+" is "+result);		
	}
}
