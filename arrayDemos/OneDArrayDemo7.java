package arrayDemos;

import java.util.Arrays;

public class OneDArrayDemo7 
{	
	public static void main(String[] args) 
	{			
		int[] A={10,20,30,40,50};			
		
		int[] B=A.clone();						
		
		System.out.println("Array A is:");
		for (int i = 0; i < A.length; i++) 
		{
			System.out.print(A[i]+" ");
		}
		
		System.out.println("\n\nArray B is:");
		for (int i = 0; i < B.length; i++) 
		{
			System.out.print(B[i]+" ");
		}		
		
		System.out.println("\n\nAre A and B equal?"); 
		System.out.println(A==B); 	
		
		/*
		B[4]=100;		
		
		System.out.println("\nArray A is:");
		for (int i = 0; i < A.length; i++) 
		{
			System.out.print(A[i]+" ");
		}	
		
		System.out.println("\n\nArray B is:");
		for (int i = 0; i < B.length; i++) 
		{
			System.out.print(B[i]+" ");
		}
		*/
	}

}
