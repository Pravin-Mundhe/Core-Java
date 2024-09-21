package arrayDemos;

public class TwoDArrayDemo 
{
	public static void main(String[] args)
	{
	
		//Declaring 2-D array
		int[][] a= new int[2][2]; //or int[][] b; b=new int[2][2]; 
		
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		System.out.println("a[0][0] is: "+a[0][0]);
		System.out.println("a[0][1] is: "+a[0][1]);
		System.out.println("a[1][0] is: "+a[1][0]);
		System.out.println("a[1][1] is: "+a[1][1]);
		
		System.out.println("\nLength of a[][] is "+a.length);
		
		System.out.print("\nDisplaying a[][] using normal for loop");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println();
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
		}			
		
		/*
		int[][] c=	{
						{1,2,3},
						{4,5,6},
						{7,8,9}
       				}; 
		System.out.println("Length of c[][] is "+c.length);			
		
		System.out.print("\nDisplaying c[][] using enhanced for loop");
		for(int[] i:c)	//extract each 1D array
		{
			System.out.println();
			for(int j: i)	//then, print element from first to last
				System.out.print(j+" ");
		}
		*/
	}
	
}
