package arrayDemos;

public class OneDArrayDemo5 
{	
	public static void main(String[] args) 
	{			
		int[] A={10,20,30,40,50};			
		
		int[] C=new int[5];	//array elements will be initialized to 0s	
		
		System.arraycopy(A, 0, C, 0, 5);	//copying using arraycopy method
		//System.arraycopy(A, 1, C, 0, 3);
		//System.arraycopy(A, 1, C, 1, 3);
		//System.arraycopy(A, 1, C, 0, 6);
		
		System.out.println("Array A is:");
		for (int i = 0; i < A.length; i++) 
		{
			System.out.print(A[i]+" ");
		}
		
		System.out.println("\n\nArray C is:");
		for (int i = 0; i < C.length; i++) 
		{
			System.out.print(C[i]+" ");
		}
		
		System.out.println("\n\nAre A and C equal?"); 
		System.out.println(A==C); 
		
	}

}
