package arrayDemos;
public class ThreeDArrayDemo 
{
	public static void main(String[] args) 
	{
		// 3-D array
		int[][][] a= {
						{
							{1,2,3},
							{4,5,6}
						},
						{
							{7,8,9},
							{10,11,12}
						},
						{
							{13,14,15},
							{16,17,18}
						}
			      	 };	//Hence, dimensions are [3][2][3]
		
		System.out.println("\nLength of a[][][] is "+a.length);
		
		System.out.print("Displaying a[][][] using normal for loop");
		for (int i = 0; i < 3; i++) 
		{
			System.out.println();
			for (int j = 0; j < 2; j++) 
			{
				System.out.println();
				for (int k = 0; k < 3; k++) 
				{	
					System.out.print(a[i][j][k]+" ");
				}
			}
		}	
		
		/*
		System.out.print("Displaying a[][][] using enhanced for loop");
		for (int[][] i : a) //extract each 2D array
		{
			System.out.println();
			for (int[] j: i) //then, extract each 1D array
			{
				System.out.println();
				for (int k : j) //then, print element from first to last
				{	
					System.out.print(k+" ");
				}
			}
		}	
		*/
	}

}
