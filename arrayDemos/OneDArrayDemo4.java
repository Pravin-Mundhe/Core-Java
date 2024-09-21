package arrayDemos;

public class OneDArrayDemo4 
{	
	public static void main(String[] args) 
	{			
		int[] A={10,20,30,40,50};
		
		int[] B=A;	//directly copying everything, pointing to same location
		
		int[] C=new int[5];
			
		for (int i = 0; i < A.length; i++) //copying using for loop
		{
			C[i]=A[i];		//different reference
		}
		
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
		
		System.out.println("\nAre B and C equal?"); 
		System.out.println(B==C); 
		
		/*
		B[4]=100;	
		//If there is any further change, it will be done to both 
		//arrays, since they are pointing to same memory location. 		
		
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
