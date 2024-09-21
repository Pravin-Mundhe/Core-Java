package arrayDemos;

import java.util.Arrays;

public class OneDArrayDemo6 
{	
	public static void main(String[] args) 
	{			
		int[] A={10,20,30,40,50};			
		
		int[] B=Arrays.copyOf(A, 5);
		//int[] B=Arrays.copyOf(A, 6);	
		
		//int[] C=Arrays.copyOfRange(A, 0, 4);	//newlength=4-0=4
		int[] C=Arrays.copyOfRange(A, 2, 5);	//newlength=5-2=3
		//int[] C=Arrays.copyOfRange(A, 3, 7);	//newlength=7-3=4
		
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
		
		System.out.println("\n\nArray C is:");
		for (int i = 0; i < C.length; i++) 
		{
			System.out.print(C[i]+" ");
		}
		
		System.out.println("\n\nAre A and B equal?"); 
		System.out.println(A==B); 	
		
		System.out.println("\nAre A and C equal?"); 
		System.out.println(A==C); 
		
	}

}
